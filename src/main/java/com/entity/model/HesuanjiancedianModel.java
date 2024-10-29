package com.entity.model;

import com.entity.HesuanjiancedianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 核酸检测点
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-21 11:55:18
 */
public class HesuanjiancedianModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
