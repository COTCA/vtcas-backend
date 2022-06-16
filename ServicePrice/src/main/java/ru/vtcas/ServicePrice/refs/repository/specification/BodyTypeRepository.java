package ru.vtcas.ServicePrice.refs.repository.specification;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.vtcas.ServicePrice.refs.domain.specification.BodyType;

import java.util.List;

@Repository
public interface BodyTypeRepository extends CrudRepository<BodyType, Long> {
    List<BodyType> findAll();
}
