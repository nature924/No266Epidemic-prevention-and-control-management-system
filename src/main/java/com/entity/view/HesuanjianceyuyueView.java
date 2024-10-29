package com.entity.view;

import com.entity.HesuanjianceyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 核酸检测预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-21 11:55:18
 */
@TableName("hesuanjianceyuyue")
public class HesuanjianceyuyueView  extends HesuanjianceyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HesuanjianceyuyueView(){
	}
 
 	public HesuanjianceyuyueView(HesuanjianceyuyueEntity hesuanjianceyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, hesuanjianceyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
