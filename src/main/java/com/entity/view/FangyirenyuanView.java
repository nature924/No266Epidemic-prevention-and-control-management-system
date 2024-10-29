package com.entity.view;

import com.entity.FangyirenyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 防疫人员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-21 11:55:18
 */
@TableName("fangyirenyuan")
public class FangyirenyuanView  extends FangyirenyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FangyirenyuanView(){
	}
 
 	public FangyirenyuanView(FangyirenyuanEntity fangyirenyuanEntity){
 	try {
			BeanUtils.copyProperties(this, fangyirenyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
