package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GnssdtEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GnssdtVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GnssdtView;


/**
 * 国内实时动态
 *
 * @author 
 * @email 
 * @date 2023-02-21 11:55:18
 */
public interface GnssdtService extends IService<GnssdtEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GnssdtVO> selectListVO(Wrapper<GnssdtEntity> wrapper);
   	
   	GnssdtVO selectVO(@Param("ew") Wrapper<GnssdtEntity> wrapper);
   	
   	List<GnssdtView> selectListView(Wrapper<GnssdtEntity> wrapper);
   	
   	GnssdtView selectView(@Param("ew") Wrapper<GnssdtEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GnssdtEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<GnssdtEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<GnssdtEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<GnssdtEntity> wrapper);



}

