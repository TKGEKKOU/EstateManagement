package com.gsy.estatemanagement.domain;

import javax.persistence.Table;
import java.io.Serializable;

import java.util.Date;

/**
* 宠物表
* @TableName tb_pet
*/
@Table(name = "tb_pet")
public class Pet implements Serializable {

    /**
    * 宠物ID
    */
    private Integer id;
    /**
    * 宠物照片
    */
    private String picture;
    /**
    * 所属成员（业主）名称
    */
    private String ownerName;
    /**
    * 所属成员（业主）ID
    */
    private Integer ownerId;
    /**
    * 宠物名称
    */
    private String name;
    /**
    * 宠物颜色
    */
    private String color;
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
    /**
    * 收养时间
    */
    private Date adoptTime;

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

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public Date getAdoptTime() {
        return adoptTime;
    }

    public void setAdoptTime(Date adoptTime) {
        this.adoptTime = adoptTime;
    }
}
