package com.gsy.estatemanagement.controller;

import com.github.pagehelper.Page;
import com.gsy.estatemanagement.common.PageResult;
import com.gsy.estatemanagement.common.Result;
import com.gsy.estatemanagement.dao.ParkingMapper;
import com.gsy.estatemanagement.domain.Car;
import com.gsy.estatemanagement.domain.Parking;
import com.gsy.estatemanagement.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/parking")
public class ParkingController {
    @Autowired
    private ParkingService parkingService;

    @RequestMapping("/find")
    public Result find() {
        List<Parking> allParking = parkingService.getAllParking();
        return new Result(false, 200, "成功！", allParking);
    }
    /**
     * @param searchMap
     * @return
     * @Map 动态接收参数
     * @RequestBody 将Json转换为对象
     */
    @PostMapping("/search")
    public PageResult search(@RequestBody Map searchMap) {
        Page<Parking> page = parkingService.searchParking(searchMap);
        return new PageResult(false, 200, "查询成功！", page.getResult(), page.getTotal());
    }
}
