package ru.vtcas.ServicePrice.refs.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@Table("car_makes")
public class CarMake {
    @Id
    private Long id;
    private String name;
}
