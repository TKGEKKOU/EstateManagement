package com.gsy.estatemanagement.domain;

import javax.persistence.Table;
import java.io.Serializable;

import java.util.Date;

/**
* 业主表
* @TableName tb_owner
*/
@Table(name = "tb_owner")
public class Owner implements Serializable {

    /**
    * 业主ID
    */
    private Integer id;
    /**
    * 所属小区
    */
    private Integer communityId;
    /**
    * 所属房产
    */
    private Integer houseId;
    /**
    * 成员名称
    */
    private String name;
    /**
    * 身份证号
    */
    private String idcard;
    /**
    * 联系方式
    */
    private Integer telephone;
    /**
    * 职业
    */
    private String profession;
    /**
    * 性别:0-男（默认），1-女
    */
    private String sex;
    /**
    * 类型:0-房主（默认），1-租客
    */
    private String type;
    /**
    * 备注（默认无）
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
    * 出生日期
    */
    private Date birthday;

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

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
