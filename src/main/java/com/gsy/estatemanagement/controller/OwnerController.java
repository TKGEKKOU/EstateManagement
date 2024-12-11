package com.gsy.estatemanagement.controller;

import com.github.pagehelper.Page;
import com.gsy.estatemanagement.common.PageResult;
import com.gsy.estatemanagement.common.Result;
import com.gsy.estatemanagement.domain.Owner;
import com.gsy.estatemanagement.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/owner")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @RequestMapping("/find")
    public Result findOwner(){
        List<Owner> allOwners = ownerService.getAllOwners();
        return new Result(false, 200, "成功！", allOwners);
    }

    /**
     * @param searchMap
     * @return PageResult
     * @Map 动态接收参数
     * @RequestBody 将Json转换为对象
     */
    @PostMapping("/search")
    public PageResult search(@RequestBody Map searchMap) {
        Page<Owner> page = ownerService.searchOwner(searchMap);
        return new PageResult(false, 200, "查询成功！", page.getResult(), page.getTotal());
//        // 从 searchMap 中获取 pageNum 和 pageSize
//        Integer pageNum = (Integer) searchOwnerMap.get("pageNum");
//        Integer pageSize = (Integer) searchOwnerMap.get("pageSize");
//        // 如果 pageNum 或 pageSize 为 null，设置默认值
//        if (pageNum == null) {
//            pageNum = 1;  // 默认页码为 1
//        }
//        if (pageSize == null) {
//            pageSize = 10;  // 默认每页条数为 10
//        }
//        // 使用 PageHelper 设置分页信息
//        PageHelper.startPage(pageNum, pageSize);
//        // 继续处理搜索逻辑
//        Page<Owner> page = ownerService.searchOwner(searchOwnerMap);
        // 返回分页结果
//        return new PageResult(false, 200, "查询成功！", page.getResult(), page.getTotal());
    }

}
