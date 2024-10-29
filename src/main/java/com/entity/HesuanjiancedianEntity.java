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
 * 核酸检测点
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-21 11:55:18
 */
@TableName("hesuanjiancedian")
public class HesuanjiancedianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HesuanjiancedianEntity() {
		
	}
	
	public HesuanjiancedianEntity(T t) {
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
	 * 检测点名称
	 */
					
	private String jiancedianmingcheng;
	
	/**
	 * 检测点位置
	 */
					
	private String jiancedianweizhi;
	
	/**
	 * 可预约时段
	 */
					
	private String keyuyueshiduan;
	
	/**
	 * 封面图片
	 */
					
	private String fengmiantupian;
	
	/**
	 * 检测费用
	 */
					
	private Integer jiancefeiyong;
	
	/**
	 * 负责人
	 */
					
	private String fuzeren;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	/**
	 * 说明
	 */
					
	private String shuoming;
	
	
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
	 * 设置：检测点名称
	 */
	public void setJiancedianmingcheng(String jiancedianmingcheng) {
		this.jiancedianmingcheng = jiancedianmingcheng;
	}
	/**
	 * 获取：检测点名称
	 */
	public String getJiancedianmingcheng() {
		return jiancedianmingcheng;
	}
	/**
	 * 设置：检测点位置
	 */
	public void setJiancedianweizhi(String jiancedianweizhi) {
		this.jiancedianweizhi = jiancedianweizhi;
	}
	/**
	 * 获取：检测点位置
	 */
	public String getJiancedianweizhi() {
		return jiancedianweizhi;
	}
	/**
	 * 设置：可预约时段
	 */
	public void setKeyuyueshiduan(String keyuyueshiduan) {
		this.keyuyueshiduan = keyuyueshiduan;
	}
	/**
	 * 获取：可预约时段
	 */
	public String getKeyuyueshiduan() {
		return keyuyueshiduan;
	}
	/**
	 * 设置：封面图片
	 */
	public void setFengmiantupian(String fengmiantupian) {
		this.fengmiantupian = fengmiantupian;
	}
	/**
	 * 获取：封面图片
	 */
	public String getFengmiantupian() {
		return fengmiantupian;
	}
	/**
	 * 设置：检测费用
	 */
	public void setJiancefeiyong(Integer jiancefeiyong) {
		this.jiancefeiyong = jiancefeiyong;
	}
	/**
	 * 获取：检测费用
	 */
	public Integer getJiancefeiyong() {
		return jiancefeiyong;
	}
	/**
	 * 设置：负责人
	 */
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
	/**
	 * 设置：联系方式
	 */
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
	/**
	 * 设置：说明
	 */
	public void setShuoming(String shuoming) {
		this.shuoming = shuoming;
	}
	/**
	 * 获取：说明
	 */
	public String getShuoming() {
		return shuoming;
	}

}
