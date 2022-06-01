package ru.vtcas.ServicePrice.refs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.vtcas.ServicePrice.refs.domain.CarMake;

@Repository
public interface CarMakeRepository extends CrudRepository<CarMake, Long> {
}

