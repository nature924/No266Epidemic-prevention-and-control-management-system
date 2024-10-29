package com.dao;

import com.entity.HesuanjianceyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HesuanjianceyuyueVO;
import com.entity.view.HesuanjianceyuyueView;


/**
 * 核酸检测预约
 * 
 * @author 
 * @email 
 * @date 2023-02-21 11:55:18
 */
public interface HesuanjianceyuyueDao extends BaseMapper<HesuanjianceyuyueEntity> {
	
	List<HesuanjianceyuyueVO> selectListVO(@Param("ew") Wrapper<HesuanjianceyuyueEntity> wrapper);
	
	HesuanjianceyuyueVO selectVO(@Param("ew") Wrapper<HesuanjianceyuyueEntity> wrapper);
	
	List<HesuanjianceyuyueView> selectListView(@Param("ew") Wrapper<HesuanjianceyuyueEntity> wrapper);

	List<HesuanjianceyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<HesuanjianceyuyueEntity> wrapper);
	
	HesuanjianceyuyueView selectView(@Param("ew") Wrapper<HesuanjianceyuyueEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HesuanjianceyuyueEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HesuanjianceyuyueEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HesuanjianceyuyueEntity> wrapper);



}
