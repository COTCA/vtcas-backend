package ru.vtcas.ServicePrice.refs.domain.specification;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("drivetrain_types")
public class DrivetrainType {
    private Long id;
    private String name;
}
