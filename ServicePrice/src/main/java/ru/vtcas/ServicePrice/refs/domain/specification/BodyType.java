package ru.vtcas.ServicePrice.refs.domain.specification;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("body_types")
public class BodyType {
    private Long id;
    private String name;
}
