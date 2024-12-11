package com.gsy.estatemanagement.domain;

import javax.persistence.Table;
import java.io.Serializable;

import java.util.Date;

/**
* 设备表
* @TableName tb_device
*/
@Table(name = "tb_device")
public class Device implements Serializable {

    /**
    * 设备ID
    */
    private Integer id;
    /**
    * 所属小区名称
    */
    private String communityName;
    /**
    * 所属小区ID
    */
    private Integer communityId;
    /**
    * 设备编号
    */
    private String code;
    /**
    * 设备名称
    */
    private String name;
    /**
    * 设备品牌
    */
    private String brand;
    /**
    * 购买单价(￥)，单位分
    */
    private Integer unitPrice;
    /**
    * 购买数量
    */
    private Integer num;
    /**
    * 预计使用年限(年)
    */
    private Integer expectedUsefulLife;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 更新时间
    */
    private Date updateTime;
    /**
    * 购买日期
    */
    private Date purchaseDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public Integer getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getExpectedUsefulLife() {
        return expectedUsefulLife;
    }

    public void setExpectedUsefulLife(Integer expectedUsefulLife) {
        this.expectedUsefulLife = expectedUsefulLife;
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

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
