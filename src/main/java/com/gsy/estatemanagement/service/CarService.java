package com.gsy.estatemanagement.service;

import com.github.pagehelper.Page;
import com.gsy.estatemanagement.domain.Car;

import java.util.List;
import java.util.Map;

public interface CarService {

    public List<Car> getAllCars();

    public Page<Car> searchCars(Map searchCarMap);
}
