package com.gsy.estatemanagement.controller;

import com.github.pagehelper.Page;
import com.gsy.estatemanagement.common.PageResult;
import com.gsy.estatemanagement.common.Result;
import com.gsy.estatemanagement.domain.Community;
import com.gsy.estatemanagement.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/community")
public class CommunityController {
    @Autowired
    private CommunityService communityService;

    @RequestMapping("/find")
    public Result find() {
        List<Community> allCommunities = communityService.getAllCommunities();
        return new Result(false, 200, "成功！", allCommunities);
    }

    /**
     * @param searchCommunityMap
     * @return
     * @Map 动态接收参数
     * @RequestBody 将Json转换为对象
     */
    @PostMapping("/search")
    public PageResult search(@RequestBody Map searchCommunityMap) {
        Page<Community> page = communityService.searchCommunity(searchCommunityMap);
        return new PageResult(false, 200, "查询成功！", page.getResult(), page.getTotal());
    }
}
//    @RequestMapping(value = "/search", method = {RequestMethod.GET, RequestMethod.POST})
//    public PageResult search(@RequestBody(required = false) Map<String, Object> searchMap) {
//        if (searchMap == null || searchMap.isEmpty()) {
//            return new PageResult(false, 400, "请求体不能为空！", null, 0L);
//        }
//
//        try {
//            Page<Community> result = communityService.search(searchMap);
//            return new PageResult(true, 200, "查询成功！", result.getResult(), result.getTotal());
//        } catch (Exception e) {
//            return new PageResult(false, 500, "服务器内部错误", null, 0L);
//        }
//}
