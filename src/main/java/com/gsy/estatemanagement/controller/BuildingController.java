package com.gsy.estatemanagement.controller;

import com.github.pagehelper.Page;
import com.gsy.estatemanagement.common.PageResult;
import com.gsy.estatemanagement.common.Result;
import com.gsy.estatemanagement.domain.Building;
import com.gsy.estatemanagement.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/building")
public class BuildingController {
    @Autowired
    private BuildingService buildingService;
    @RequestMapping("/find")
    public Result find() {
        List<Building> allBuildings = buildingService.getAllBuildings();
        return new Result(false, 200, "成功！", allBuildings);
    }
    /**
     * @param searchBuildingMap
     * @return
     * @Map 动态接收参数
     * @RequestBody 将Json转换为对象
     */
    @PostMapping("/search")
    public PageResult search(@RequestBody Map searchBuildingMap) {
        Page<Building> page = buildingService.searchBuilding(searchBuildingMap);
        return new PageResult(false, 200, "查询成功！", page.getResult(), page.getTotal());
    }
}
