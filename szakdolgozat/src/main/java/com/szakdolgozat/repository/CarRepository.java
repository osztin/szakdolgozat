package com.szakdolgozat.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.szakdolgozat.entity.Car;

public interface CarRepository extends CrudRepository<Car, Long> {

	List<Car> findAll();
}
