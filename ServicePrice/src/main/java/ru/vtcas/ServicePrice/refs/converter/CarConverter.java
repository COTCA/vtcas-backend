package ru.vtcas.ServicePrice.refs.converter;

import ru.vtcas.ServicePrice.refs.domain.Car;
import ru.vtcas.ServicePrice.refs.dto.CarDto;

public class CarConverter {

    public static CarDto toDto(Car object) {
        return CarDto.builder()
                .id(object.getId())
                .make(object.getMake())
                .model(object.getModel()).build();
    }

    public static Car toDomain(CarDto object) {
        return Car.builder()
                .id(object.getId())
                .make(object.getMake())
                .model(object.getModel()).build();
    }

}
