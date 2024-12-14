package com.gsy.estatemanagement.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.gsy.estatemanagement.dao.ParkingUseMapper;
import com.gsy.estatemanagement.domain.Parking;
import com.gsy.estatemanagement.domain.ParkingUse;
import com.gsy.estatemanagement.service.ParkingUseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;

import java.util.List;
import java.util.Map;
@Service
public class ParkingUseServiceImpl implements ParkingUseService {
    @Autowired
    private ParkingUseMapper parkingUseMapper;
    @Override
    public List<ParkingUse> getAllParkingUse() {
        return parkingUseMapper.selectAll();
    }

    @Override
    public Page<ParkingUse> searchParkingUse(Map searchMap) {
        int pageNum = 1;
        int pageSize = 10;
        Example example = new Example(Parking.class);
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
        return (Page<ParkingUse>) parkingUseMapper.selectByExample(example);
    }
}
