package com.gsy.estatemanagement.domain;

import javax.persistence.Table;
import java.io.Serializable;

import java.util.Date;

/**
* 房产表
* @TableName tb_house
*/
@Table(name = "tb_house")
public class House implements Serializable {

    /**
    * 房屋ID
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
    * 所属栋数名称
    */
    private String buildingName;
    /**
    * 所属栋数ID
    */
    private Integer buildingId;
    /**
    * 房产编码
    */
    private String code;
    /**
    * 房产名称
    */
    private String name;
    /**
    * 户主（业主）ID
    */
    private Integer ownerId;
    /**
    * 户主（业主）名称
    */
    private String ownerName;
    /**
    * 联系方式
    */
    private Integer telephone;
    /**
    * 房间数
    */
    private Integer roomNum;
    /**
    * 单元
    */
    private String unit;
    /**
    * 楼层
    */
    private String floor;
    /**
    * 描述
    */
    private String description;
    /**
    * 入住时间
    */
    private Date liveTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getLiveTime() {
        return liveTime;
    }

    public void setLiveTime(Date liveTime) {
        this.liveTime = liveTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public Integer getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }
}
