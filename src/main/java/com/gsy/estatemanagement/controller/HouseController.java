package com.gsy.estatemanagement.controller;

import com.github.pagehelper.Page;
import com.gsy.estatemanagement.common.PageResult;
import com.gsy.estatemanagement.common.Result;
import com.gsy.estatemanagement.domain.House;
import com.gsy.estatemanagement.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/house")
public class HouseController {
    @Autowired
    private HouseService houseService;
    @RequestMapping("/find")
    public Result find() {
        List<House> allHouse = houseService.getAllHouse();
        return new Result(false, 200, "成功！", allHouse);
    }
    @PostMapping("/search")
    public PageResult search(@RequestBody Map searchHouseMap) {
        Page<House> page = houseService.searchHouse(searchHouseMap);
        return new PageResult(false, 200, "查询成功！", page.getResult(), page.getTotal());
    }
}