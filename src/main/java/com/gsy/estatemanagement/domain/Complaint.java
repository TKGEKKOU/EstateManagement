package com.gsy.estatemanagement.domain;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.util.Date;

/**
* 投诉表
* @TableName tb_complaint
*/
@Table(name = "tb_complaint")
public class Complaint implements Serializable {

    /**
    * 投诉ID
    */
    @NotNull(message="[投诉ID]不能为空")
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
    * 投诉人员（业主）ID
    */
    private Integer ownerId;
    /**
    * 投诉人员（业主）名称
    */
    private String ownerName;
    /**
    * 投诉具体描述
    */
    private String description;
    /**
    * 投诉事由
    */
    private String reason;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 更新时间
    */
    private Date updateTime;
    /**
    * 状态：0-未受理，1-已受理（默认），2-已处理完毕
    */
    private String status;

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

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
