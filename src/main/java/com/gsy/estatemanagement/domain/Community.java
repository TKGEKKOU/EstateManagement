package com.gsy.estatemanagement.domain;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.Length;

/**
 * 小区表
 * @TableName tb_community
 */
@Table(name = "tb_community")
public class Community implements Serializable {

    /**
     * 小区id
     */
    @Id
    private Integer id;
    /**
     * 小区编号
     */
    private String code;
    /**
     * 小区名称
     */
    private String name;
    /**
     * 坐落地址
     */
    private String address;
    /**
     * 占地面积（m2）
     */
    private Double area;
    /**
     * 总栋数
     */
    private Integer totalBuildings;
    /**
     * 总户数
     */
    private Integer totalHouseholds;
    /**
     * 绿化率（%）
     */
    private Integer greeningRate;
    /**
     * 缩略图
     */
    private String thumbnail;
    /**
     * 开发商名称
     */
    private String developer;
    /**
     * 物业公司名称
     */
    private String estateCompany;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 状态:0-启用（默认），1-不启用
     */
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Integer getTotalBuildings() {
        return totalBuildings;
    }

    public void setTotalBuildings(Integer totalBuildings) {
        this.totalBuildings = totalBuildings;
    }

    public Integer getTotalHouseholds() {
        return totalHouseholds;
    }

    public void setTotalHouseholds(Integer totalHouseholds) {
        this.totalHouseholds = totalHouseholds;
    }

    public Integer getGreeningRate() {
        return greeningRate;
    }

    public void setGreeningRate(Integer greeningRate) {
        this.greeningRate = greeningRate;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getEstateCompany() {
        return estateCompany;
    }

    public void setEstateCompany(String estateCompany) {
        this.estateCompany = estateCompany;
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
