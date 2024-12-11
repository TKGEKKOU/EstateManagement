package com.gsy.estatemanagement.domain;

import javax.persistence.Table;
import java.io.Serializable;

import java.util.Date;

/**
* 车辆表
* @TableName tb_car
*/
@Table(name = "tb_car")
public class Car implements Serializable {

    /**
    * 车辆ID
    */
    private Integer id;
    /**
    * 车辆照片
    */
    private String picture;
    /**
    * 所属成员（业主）
    */
    private Integer ownerId;
    /**
    * 车辆颜色
    */
    private String color;
    /**
    * 车牌号
    */
    private String carNumber;
    /**
    * 备注
    */
    private String remark;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 更新时间
    */
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
