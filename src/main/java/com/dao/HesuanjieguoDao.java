package com.dao;

import com.entity.HesuanjieguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HesuanjieguoVO;
import com.entity.view.HesuanjieguoView;


/**
 * 核酸结果
 * 
 * @author 
 * @email 
 * @date 2023-02-21 11:55:18
 */
public interface HesuanjieguoDao extends BaseMapper<HesuanjieguoEntity> {
	
	List<HesuanjieguoVO> selectListVO(@Param("ew") Wrapper<HesuanjieguoEntity> wrapper);
	
	HesuanjieguoVO selectVO(@Param("ew") Wrapper<HesuanjieguoEntity> wrapper);
	
	List<HesuanjieguoView> selectListView(@Param("ew") Wrapper<HesuanjieguoEntity> wrapper);

	List<HesuanjieguoView> selectListView(Pagination page,@Param("ew") Wrapper<HesuanjieguoEntity> wrapper);
	
	HesuanjieguoView selectView(@Param("ew") Wrapper<HesuanjieguoEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HesuanjieguoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HesuanjieguoEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HesuanjieguoEntity> wrapper);



}
