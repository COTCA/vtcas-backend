package ru.vtcas.ServicePrice.refs.repository.specification;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.vtcas.ServicePrice.refs.domain.specification.TransmissionType;

import java.util.List;

@Repository
public interface TransmissionTypeRepository extends CrudRepository<TransmissionType, Long> {
    List<TransmissionType> findAll();
}
