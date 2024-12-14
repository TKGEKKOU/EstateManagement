package com.gsy.estatemanagement.controller;

import com.github.pagehelper.Page;
import com.gsy.estatemanagement.common.PageResult;
import com.gsy.estatemanagement.common.Result;
import com.gsy.estatemanagement.domain.Activity;
import com.gsy.estatemanagement.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/activity")
public class ActivityController {
    @Autowired
    private ActivityService activityService;

    @RequestMapping("/find")
    public Result find() {
        List<Activity> allActivity = activityService.getAllActivity();
        return new Result(false, 200, "成功！", allActivity);
    }

    @PostMapping("/search")
    public PageResult search(@RequestBody Map searchMap) {
        Page<Activity> page = activityService.searchActivity(searchMap);
        return new PageResult(false, 200, "查询成功！", page.getResult(), page.getTotal());
    }
}
