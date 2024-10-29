package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QgsssjEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QgsssjVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QgsssjView;


/**
 * 全国实时数据
 *
 * @author 
 * @email 
 * @date 2023-02-21 11:55:18
 */
public interface QgsssjService extends IService<QgsssjEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QgsssjVO> selectListVO(Wrapper<QgsssjEntity> wrapper);
   	
   	QgsssjVO selectVO(@Param("ew") Wrapper<QgsssjEntity> wrapper);
   	
   	List<QgsssjView> selectListView(Wrapper<QgsssjEntity> wrapper);
   	
   	QgsssjView selectView(@Param("ew") Wrapper<QgsssjEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QgsssjEntity> wrapper);
   	

}

