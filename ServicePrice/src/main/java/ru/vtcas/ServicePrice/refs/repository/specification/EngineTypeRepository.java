package ru.vtcas.ServicePrice.refs.repository.specification;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.vtcas.ServicePrice.refs.domain.specification.EngineType;

import java.util.List;

@Repository
public interface EngineTypeRepository extends CrudRepository<EngineType, Long> {
    List<EngineType> findAll();
}
