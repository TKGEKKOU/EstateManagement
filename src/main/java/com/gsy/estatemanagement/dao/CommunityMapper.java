package com.gsy.estatemanagement.dao;

import com.gsy.estatemanagement.domain.Community;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface CommunityMapper extends Mapper<Community> {
}
