package ru.vtcas.ServicePrice.refs.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.vtcas.ServicePrice.refs.converter.CarMakeConverter;
import ru.vtcas.ServicePrice.refs.domain.CarMake;
import ru.vtcas.ServicePrice.refs.dto.CarMakeDto;
import ru.vtcas.ServicePrice.refs.repository.CarMakeRepository;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class CarMakeService {

    private final CarMakeRepository repository;

    public CarMakeService(CarMakeRepository repository) {
        this.repository = repository;
    }

    public List<CarMakeDto> getAll() {
        List<CarMake> list = (List<CarMake>) repository.findAll();

        log.info("[ GET ] getAll()");
        return list.stream().map(CarMakeConverter::toDto).collect(Collectors.toList());
    }
}
