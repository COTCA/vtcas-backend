package ru.vtcas.ServicePrice.refs.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@Table("cars")
public class Car {
    @Id
    private Long id;
    private String make;
    private String model;
}
