package com.dao;

import com.entity.FangyirenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangyirenyuanVO;
import com.entity.view.FangyirenyuanView;


/**
 * 防疫人员
 * 
 * @author 
 * @email 
 * @date 2023-02-21 11:55:18
 */
public interface FangyirenyuanDao extends BaseMapper<FangyirenyuanEntity> {
	
	List<FangyirenyuanVO> selectListVO(@Param("ew") Wrapper<FangyirenyuanEntity> wrapper);
	
	FangyirenyuanVO selectVO(@Param("ew") Wrapper<FangyirenyuanEntity> wrapper);
	
	List<FangyirenyuanView> selectListView(@Param("ew") Wrapper<FangyirenyuanEntity> wrapper);

	List<FangyirenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<FangyirenyuanEntity> wrapper);
	
	FangyirenyuanView selectView(@Param("ew") Wrapper<FangyirenyuanEntity> wrapper);
	

}
