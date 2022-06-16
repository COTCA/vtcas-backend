package ru.vtcas.ServicePrice.refs.domain.specification;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("transmission_types")
public class TransmissionType {
    private Long id;
    private String name;
}
