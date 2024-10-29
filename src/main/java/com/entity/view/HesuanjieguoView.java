package com.entity.view;

import com.entity.HesuanjieguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 核酸结果
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-21 11:55:18
 */
@TableName("hesuanjieguo")
public class HesuanjieguoView  extends HesuanjieguoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HesuanjieguoView(){
	}
 
 	public HesuanjieguoView(HesuanjieguoEntity hesuanjieguoEntity){
 	try {
			BeanUtils.copyProperties(this, hesuanjieguoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
