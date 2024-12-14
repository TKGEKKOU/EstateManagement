package com.gsy.estatemanagement.controller;

import com.github.pagehelper.Page;
import com.gsy.estatemanagement.common.PageResult;
import com.gsy.estatemanagement.common.Result;
import com.gsy.estatemanagement.domain.Car;
import com.gsy.estatemanagement.domain.Device;
import com.gsy.estatemanagement.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/device")
public class DeviceController {
    @Autowired
    private DeviceService deviceService;
    @RequestMapping("/find")
    public Result find() {
        List<Device> allDevices = deviceService.getAllDevice();
        return new Result(false, 200, "成功！", allDevices);
    }
        @PostMapping("/search")
        public PageResult search(@RequestBody Map searchMap) {
            Page<Device> page = deviceService.searchDevice(searchMap);
            return new PageResult(false, 200, "查询成功！", page.getResult(), page.getTotal());

    }
}
