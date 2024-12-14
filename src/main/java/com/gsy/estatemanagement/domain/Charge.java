package com.gsy.estatemanagement.domain;

import javax.persistence.Table;
import java.io.Serializable;

import java.util.Date;

/**
* 收费项目表
* @TableName tb_charge_item
*/
@Table(name = "tb_charge_item")
public class Charge implements Serializable {

    /**
    * 收费项目ID
    */
    private Integer id;
    /**
    * 所属小区ID
    */
    private Integer communityId;
    /**
    * 所属小区名称
    */
    private String communityName;
    /**
    * 收费编号
    */
    private String code;
    /**
    * 项目名称
    */
    private String name;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 更新时间
    */
    private Date updateTime;
    /**
    * 项目收费金额（年），单位分
    */
    private Integer money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}
