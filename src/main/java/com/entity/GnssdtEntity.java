package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 国内实时动态
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-21 11:55:18
 */
@TableName("gnssdt")
public class GnssdtEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GnssdtEntity() {
		
	}
	
	public GnssdtEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 地区
	 */
					
	private String diqu;
	
	/**
	 * 确诊
	 */
					
	private Integer quezhen;
	
	/**
	 * 治愈
	 */
					
	private Integer zhiyu;
	
	/**
	 * 死亡
	 */
					
	private Integer siwang;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：地区
	 */
	public void setDiqu(String diqu) {
		this.diqu = diqu;
	}
	/**
	 * 获取：地区
	 */
	public String getDiqu() {
		return diqu;
	}
	/**
	 * 设置：确诊
	 */
	public void setQuezhen(Integer quezhen) {
		this.quezhen = quezhen;
	}
	/**
	 * 获取：确诊
	 */
	public Integer getQuezhen() {
		return quezhen;
	}
	/**
	 * 设置：治愈
	 */
	public void setZhiyu(Integer zhiyu) {
		this.zhiyu = zhiyu;
	}
	/**
	 * 获取：治愈
	 */
	public Integer getZhiyu() {
		return zhiyu;
	}
	/**
	 * 设置：死亡
	 */
	public void setSiwang(Integer siwang) {
		this.siwang = siwang;
	}
	/**
	 * 获取：死亡
	 */
	public Integer getSiwang() {
		return siwang;
	}

}
