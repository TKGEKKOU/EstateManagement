package com.gsy.estatemanagement.dao;

import com.gsy.estatemanagement.domain.Parking;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface ParkingMapper extends Mapper<Parking> {
}
