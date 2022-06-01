package ru.vtcas.ServicePrice.refs.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarDto {
    private Long id;
    private String make;
    private String model;
}
