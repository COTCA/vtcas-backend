package ru.vtcas.ServicePrice.refs.repository.specification;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.vtcas.ServicePrice.refs.domain.specification.DrivetrainType;

import java.util.List;

@Repository
public interface DrivetrainTypeRepository extends CrudRepository<DrivetrainType, Long> {
    List<DrivetrainType> findAll();
}
