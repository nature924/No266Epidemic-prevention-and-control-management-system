package com.entity.view;

import com.entity.HesuanjiancedianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 核酸检测点
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-21 11:55:18
 */
@TableName("hesuanjiancedian")
public class HesuanjiancedianView  extends HesuanjiancedianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HesuanjiancedianView(){
	}
 
 	public HesuanjiancedianView(HesuanjiancedianEntity hesuanjiancedianEntity){
 	try {
			BeanUtils.copyProperties(this, hesuanjiancedianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
