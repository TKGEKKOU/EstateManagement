package com.gsy.estatemanagement.service;

import com.github.pagehelper.Page;
import com.gsy.estatemanagement.domain.Activity;
import com.gsy.estatemanagement.domain.Car;

import java.util.List;
import java.util.Map;

public interface ActivityService {
    public List<Activity> getAllActivity();

    public Page<Activity> searchActivity(Map searchCarMap);

}
