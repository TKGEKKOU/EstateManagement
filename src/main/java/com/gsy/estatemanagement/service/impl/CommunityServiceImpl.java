package com.gsy.estatemanagement.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.gsy.estatemanagement.dao.CommunityMapper;
import com.gsy.estatemanagement.domain.Community;
import com.gsy.estatemanagement.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;

import java.util.List;
import java.util.Map;

@Service
public class CommunityServiceImpl implements CommunityService {

    @Autowired
    private CommunityMapper communityMapper;

    @Override
    public List<Community> getAllCommunities() {
        return communityMapper.selectAll();
    }

    @Override
    public Page<Community> searchCommunity(Map searchMap) {
        // TKMapper多条件搜索
        int pageNum = 1;
        int pageSize = 2;
        Example example = new Example(Community.class);
        Example.Criteria criteria = example.createCriteria();   // 创建查询条件
        if (searchMap != null) {
             /*时间区间
            在检查 startTime 和 endTime 时，除了判断 null 之外，还需要检查是否为空字符串（""）
            以避免空字符串被传递到 SQL 语句中,
            导致 Incorrect TIMESTAMP value 错误。
             */
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
        return (Page<Community>) communityMapper.selectByExample(example);
    }
}
