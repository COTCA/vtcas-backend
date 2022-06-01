package ru.vtcas.ServicePrice.refs.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.vtcas.ServicePrice.exception.BusinessException;
import ru.vtcas.ServicePrice.refs.converter.CarConverter;
import ru.vtcas.ServicePrice.refs.dto.CarDto;
import ru.vtcas.ServicePrice.refs.repository.CarRepository;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class CarService {

    private static final String MODELS_BY_MAKE_NOT_FOUND_EXCEPTION = "Модели марки %s не найдены.";

    private final CarRepository repository;

    public CarService(CarRepository repository) {
        this.repository = repository;
    }

    public List<CarDto> getModelsByMake(String make) {
        if (repository.findModelByMake(make).isEmpty()) {
            log.error(String.format("Not found models by make '%s'", make));
            throw new BusinessException(String.format(MODELS_BY_MAKE_NOT_FOUND_EXCEPTION, make));
        }

        log.info(String.format("[ GET ] getModelsByMake('%s')", make));
        return repository.findModelByMake(make).stream().map(CarConverter::toDto).collect(Collectors.toList());
    }
}
