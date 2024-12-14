package com.gsy.estatemanagement.service;

import com.github.pagehelper.Page;
import com.gsy.estatemanagement.domain.Parking;

import java.util.List;
import java.util.Map;

public interface ParkingService{

    public List<Parking> getAllParking();

    public Page<Parking> searchParking(Map searchMap);
}
