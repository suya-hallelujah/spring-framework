package com.practice.repository;

import com.practice.entity.Car;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CarRepository extends JpaRepository<Car, Long> {

}
