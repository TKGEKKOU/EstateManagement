package com.gsy.estatemanagement.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.gsy.estatemanagement.dao.BuildingMapper;
import com.gsy.estatemanagement.domain.Building;
import com.gsy.estatemanagement.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;

import java.util.List;
import java.util.Map;

@Service
public class BuildingServiceImpl implements BuildingService {

    @Autowired
    private BuildingMapper buildingMapper;

    @Override
    public List<Building> getAllBuildings() {
        return buildingMapper.selectAll();
    }

    @Override
    public Page<Building> searchBuilding(Map searchMap) {
        int pageNum = 1;
        int pageSize = 10;
        Example example = new Example(Building.class);
        Example.Criteria criteria = example.createCriteria();
        if (searchMap != null) {
            Object startTime = searchMap.get("startTime");
            if (startTime != null && !startTime.equals("")) {
                criteria.andGreaterThanOrEqualTo("createTime", String.valueOf(startTime));
            }
            Object endTime = searchMap.get("endTime");
            if (endTime != null && !endTime.equals("")) {
                criteria.andLessThanOrEqualTo("createTime", String.valueOf(endTime));
            }

            /* 名称模糊搜索 */
            Object name = searchMap.get("name");
            if (name instanceof String && StringUtil.isNotEmpty((String) name)) {
                criteria.andLike("name", "%" + name + "%");
            }

            /* 分页 */
            Object pageNumObj = searchMap.get("pageNum");
            if (pageNumObj instanceof Integer) {
                pageNum = (Integer) pageNumObj;
            } else if (pageNumObj instanceof String && StringUtil.isNotEmpty((String) pageNumObj)) {
                pageNum = Integer.parseInt((String) pageNumObj);
            }

            Object pageSizeObj = searchMap.get("pageSize");
            if (pageSizeObj instanceof Integer) {
                pageSize = (Integer) pageSizeObj;
            } else if (pageSizeObj instanceof String && StringUtil.isNotEmpty((String) pageSizeObj)) {
                pageSize = Integer.parseInt((String) pageSizeObj);
            }
        }
        // 使用PageHelper插件完成分页
        PageHelper.startPage(pageNum, pageSize);
        return (Page<Building>) buildingMapper.selectByExample(example);
    }
}
