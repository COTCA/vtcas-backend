package ru.vtcas.ServicePrice.refs.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.vtcas.ServicePrice.refs.domain.Car;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {

    @Query("SELECT DISTINCT cars.make FROM cars ORDER BY cars.make")
    List<Car> findAllMakes();

    @Query("SELECT cars.model FROM cars WHERE make = :make")
    List<Car> findModelsByMake(@Param("make") String make);
}
