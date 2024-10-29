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
 * 全国实时数据
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-21 11:55:18
 */
@TableName("qgsssj")
public class QgsssjEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QgsssjEntity() {
		
	}
	
	public QgsssjEntity(T t) {
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
	 * 全国确诊
	 */
					
	private String qgqz;
	
	/**
	 * 境外输入
	 */
					
	private String jwsr;
	
	/**
	 * 治愈人数
	 */
					
	private String zyrs;
	
	/**
	 * 死亡人数
	 */
					
	private String swrs;
	
	
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
	 * 设置：全国确诊
	 */
	public void setQgqz(String qgqz) {
		this.qgqz = qgqz;
	}
	/**
	 * 获取：全国确诊
	 */
	public String getQgqz() {
		return qgqz;
	}
	/**
	 * 设置：境外输入
	 */
	public void setJwsr(String jwsr) {
		this.jwsr = jwsr;
	}
	/**
	 * 获取：境外输入
	 */
	public String getJwsr() {
		return jwsr;
	}
	/**
	 * 设置：治愈人数
	 */
	public void setZyrs(String zyrs) {
		this.zyrs = zyrs;
	}
	/**
	 * 获取：治愈人数
	 */
	public String getZyrs() {
		return zyrs;
	}
	/**
	 * 设置：死亡人数
	 */
	public void setSwrs(String swrs) {
		this.swrs = swrs;
	}
	/**
	 * 获取：死亡人数
	 */
	public String getSwrs() {
		return swrs;
	}

}
