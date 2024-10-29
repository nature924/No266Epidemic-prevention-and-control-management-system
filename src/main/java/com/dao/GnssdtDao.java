package com.dao;

import com.entity.GnssdtEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GnssdtVO;
import com.entity.view.GnssdtView;


/**
 * 国内实时动态
 * 
 * @author 
 * @email 
 * @date 2023-02-21 11:55:18
 */
public interface GnssdtDao extends BaseMapper<GnssdtEntity> {
	
	List<GnssdtVO> selectListVO(@Param("ew") Wrapper<GnssdtEntity> wrapper);
	
	GnssdtVO selectVO(@Param("ew") Wrapper<GnssdtEntity> wrapper);
	
	List<GnssdtView> selectListView(@Param("ew") Wrapper<GnssdtEntity> wrapper);

	List<GnssdtView> selectListView(Pagination page,@Param("ew") Wrapper<GnssdtEntity> wrapper);
	
	GnssdtView selectView(@Param("ew") Wrapper<GnssdtEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GnssdtEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GnssdtEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GnssdtEntity> wrapper);



}
