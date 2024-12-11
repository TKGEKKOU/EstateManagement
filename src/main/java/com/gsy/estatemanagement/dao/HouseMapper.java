package com.gsy.estatemanagement.dao;

import com.gsy.estatemanagement.domain.House;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface HouseMapper extends Mapper<House> {
}
