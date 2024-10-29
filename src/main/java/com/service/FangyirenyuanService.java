package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangyirenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangyirenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangyirenyuanView;


/**
 * 防疫人员
 *
 * @author 
 * @email 
 * @date 2023-02-21 11:55:18
 */
public interface FangyirenyuanService extends IService<FangyirenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangyirenyuanVO> selectListVO(Wrapper<FangyirenyuanEntity> wrapper);
   	
   	FangyirenyuanVO selectVO(@Param("ew") Wrapper<FangyirenyuanEntity> wrapper);
   	
   	List<FangyirenyuanView> selectListView(Wrapper<FangyirenyuanEntity> wrapper);
   	
   	FangyirenyuanView selectView(@Param("ew") Wrapper<FangyirenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangyirenyuanEntity> wrapper);
   	

}

