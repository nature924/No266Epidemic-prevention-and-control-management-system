package com.entity.view;

import com.entity.GnssdtEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 国内实时动态
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-21 11:55:18
 */
@TableName("gnssdt")
public class GnssdtView  extends GnssdtEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GnssdtView(){
	}
 
 	public GnssdtView(GnssdtEntity gnssdtEntity){
 	try {
			BeanUtils.copyProperties(this, gnssdtEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
