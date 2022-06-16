package ru.vtcas.ServicePrice.refs.domain.specification;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("engine_types")
public class EngineType {
    private Long id;
    private String name;
}
