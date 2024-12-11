package com.gsy.estatemanagement.domain;

import javax.persistence.Table;
import java.io.Serializable;

import java.util.Date;

/**
* 收费名细表
* @TableName tb_charge_detail
*/
@Table(name = "tb_charge_detail")
public class ChargeDetail implements Serializable {

    /**
    * 收费明细ID
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
    * 收费项目ID
    */
    private Integer chargeItemId;
    /**
    * 收费项目名称
    */
    private String chargeItemName;
    /**
    * 承办人名称
    */
    private String contractor;
    /**
    * 承办人联系电话
    */
    private Integer telephone;
    /**
    * 应收金额(￥)，单位分
    */
    private Integer payMoney;
    /**
    * 实收金额(￥)，单位分
    */
    private Integer actualMoney;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 更新时间
    */
    private Date updateTime;
    /**
    * 缴费时间
    */
    private Date payTime;
    /**
    * 状态：0-生效中（默认），1-已过期
    */
    private String status;

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

    public Integer getChargeItemId() {
        return chargeItemId;
    }

    public void setChargeItemId(Integer chargeItemId) {
        this.chargeItemId = chargeItemId;
    }

    public String getChargeItemName() {
        return chargeItemName;
    }

    public void setChargeItemName(String chargeItemName) {
        this.chargeItemName = chargeItemName;
    }

    public String getContractor() {
        return contractor;
    }

    public void setContractor(String contractor) {
        this.contractor = contractor;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public Integer getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Integer payMoney) {
        this.payMoney = payMoney;
    }

    public Integer getActualMoney() {
        return actualMoney;
    }

    public void setActualMoney(Integer actualMoney) {
        this.actualMoney = actualMoney;
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

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
