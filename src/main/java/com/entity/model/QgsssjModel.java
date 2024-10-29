package com.entity.model;

import com.entity.QgsssjEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 全国实时数据
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-21 11:55:18
 */
public class QgsssjModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
