package com.gsy.estatemanagement.service;

import com.github.pagehelper.Page;
import com.gsy.estatemanagement.domain.House;

import java.util.List;
import java.util.Map;

public interface HouseService {

    public List<House> getAllHouse();

    public Page<House> searchHouse(Map searchMap);
}
