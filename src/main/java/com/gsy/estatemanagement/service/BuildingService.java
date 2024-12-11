package com.gsy.estatemanagement.service;

import com.github.pagehelper.Page;
import com.gsy.estatemanagement.domain.Building;

import java.util.List;
import java.util.Map;

public interface BuildingService {

    public List<Building> getAllBuildings();

    public Page<Building> searchBuilding(Map searchBuildingMap);
}
