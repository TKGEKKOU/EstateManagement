package com.gsy.estatemanagement.service;

import com.github.pagehelper.Page;
import com.gsy.estatemanagement.domain.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface DeviceService {
    @Autowired
    public List<Device> getAllDevice();

    Page<Device> searchDevice(Map searchMap);
}
