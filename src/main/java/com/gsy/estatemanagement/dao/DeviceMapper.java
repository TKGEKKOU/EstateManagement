package com.gsy.estatemanagement.dao;

import com.gsy.estatemanagement.domain.Device;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface DeviceMapper extends Mapper<Device> {
}