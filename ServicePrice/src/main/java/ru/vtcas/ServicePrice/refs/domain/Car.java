package ru.vtcas.ServicePrice.refs.domain;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("cars")
public class Car {
    private Long id;
    private String make;
    private String model;
}
