package com.gsy.estatemanagement.service;

import com.github.pagehelper.Page;
import com.gsy.estatemanagement.domain.ParkingUse;

import java.util.List;
import java.util.Map;

public interface ParkingUseService {


    public List<ParkingUse> getAllParkingUse();

    public Page<ParkingUse> searchParkingUse(Map searchMap);
}
