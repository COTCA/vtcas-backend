package ru.vtcas.ServicePrice.refs.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarMakeDto {
    private Long id;
    private String name;
}
