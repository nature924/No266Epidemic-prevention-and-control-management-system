package com.entity.model;

import com.entity.HesuanjieguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 核酸结果
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-21 11:55:18
 */
public class HesuanjieguoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 检测点名称
	 */
	
	private String jiancedianmingcheng;
		
	/**
	 * 检测点位置
	 */
	
	private String jiancedianweizhi;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 人员账号
	 */
	
	private String renyuanzhanghao;
		
	/**
	 * 防疫人员
	 */
	
	private String fangyirenyuan;
		
	/**
	 * 结果时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jieguoshijian;
		
	/**
	 * 核酸结果
	 */
	
	private String hesuanjieguo;
		
	/**
	 * 跨表用户id
	 */
	
	private Long crossuserid;
		
	/**
	 * 跨表主键id
	 */
	
	private Long crossrefid;
				
	
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
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：人员账号
	 */
	 
	public void setRenyuanzhanghao(String renyuanzhanghao) {
		this.renyuanzhanghao = renyuanzhanghao;
	}
	
	/**
	 * 获取：人员账号
	 */
	public String getRenyuanzhanghao() {
		return renyuanzhanghao;
	}
				
	
	/**
	 * 设置：防疫人员
	 */
	 
	public void setFangyirenyuan(String fangyirenyuan) {
		this.fangyirenyuan = fangyirenyuan;
	}
	
	/**
	 * 获取：防疫人员
	 */
	public String getFangyirenyuan() {
		return fangyirenyuan;
	}
				
	
	/**
	 * 设置：结果时间
	 */
	 
	public void setJieguoshijian(Date jieguoshijian) {
		this.jieguoshijian = jieguoshijian;
	}
	
	/**
	 * 获取：结果时间
	 */
	public Date getJieguoshijian() {
		return jieguoshijian;
	}
				
	
	/**
	 * 设置：核酸结果
	 */
	 
	public void setHesuanjieguo(String hesuanjieguo) {
		this.hesuanjieguo = hesuanjieguo;
	}
	
	/**
	 * 获取：核酸结果
	 */
	public String getHesuanjieguo() {
		return hesuanjieguo;
	}
				
	
	/**
	 * 设置：跨表用户id
	 */
	 
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
				
	
	/**
	 * 设置：跨表主键id
	 */
	 
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
			
}
