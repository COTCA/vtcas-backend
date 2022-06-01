package ru.vtcas.ServicePrice.refs.converter;

import ru.vtcas.ServicePrice.refs.domain.CarMake;
import ru.vtcas.ServicePrice.refs.dto.CarMakeDto;

public class CarMakeConverter {

    public static CarMakeDto toDto(CarMake object) {
        return CarMakeDto.builder()
                .id(object.getId())
                .name(object.getName()).build();
    }

    public static CarMake toDomain(CarMakeDto object) {
        return CarMake.builder()
                .id(object.getId())
                .name(object.getName()).build();
    }

}
