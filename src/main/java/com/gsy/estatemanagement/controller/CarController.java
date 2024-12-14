package com.gsy.estatemanagement.controller;


import com.github.pagehelper.Page;
import com.gsy.estatemanagement.common.PageResult;
import com.gsy.estatemanagement.common.Result;
import com.gsy.estatemanagement.domain.Car;
import com.gsy.estatemanagement.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarService carService;

    @RequestMapping("/find")
    public Result find() {
        List<Car> allCars = carService.getAllCars();
        return new Result(false, 200, "成功！", allCars);
    }
    /**
     * @param searchMap
     * @return
     * @Map 动态接收参数
     * @RequestBody 将Json转换为对象
     */
    @PostMapping("/search")
    public PageResult search(@RequestBody Map searchMap) {
        Page<Car> page = carService.searchCars(searchMap);
        return new PageResult(false, 200, "查询成功！", page.getResult(), page.getTotal());
    }
}
