package ru.vtcas.ServicePrice.refs.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.vtcas.ServicePrice.refs.repository.CarRepository;

import java.util.ArrayList;
import java.util.List;

// TODO: 02.07.2022 Add DTO for Car

@Slf4j
@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository repository;

    public List<String> getAllMakes() {
        List<String> makes = new ArrayList<>();
        repository.findAllMakes().forEach(car -> makes.add(car.getMake()));

        log.info("[TECH] [Info] Getting all makes");
        return makes;
    }

    public List<String> getModelsByMakes(String make) {
        List<String> models = new ArrayList<>();
        repository.findModelsByMake(make).forEach(car -> models.add(car.getModel()));

        log.info("[TECH] [Info] Getting models by make");
        return models;
    }

}
