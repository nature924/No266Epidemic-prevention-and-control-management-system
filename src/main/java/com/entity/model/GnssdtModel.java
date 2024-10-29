package com.entity.model;

import com.entity.GnssdtEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 国内实时动态
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-21 11:55:18
 */
public class GnssdtModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
