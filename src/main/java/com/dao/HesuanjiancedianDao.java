package com.dao;

import com.entity.HesuanjiancedianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HesuanjiancedianVO;
import com.entity.view.HesuanjiancedianView;


/**
 * 核酸检测点
 * 
 * @author 
 * @email 
 * @date 2023-02-21 11:55:18
 */
public interface HesuanjiancedianDao extends BaseMapper<HesuanjiancedianEntity> {
	
	List<HesuanjiancedianVO> selectListVO(@Param("ew") Wrapper<HesuanjiancedianEntity> wrapper);
	
	HesuanjiancedianVO selectVO(@Param("ew") Wrapper<HesuanjiancedianEntity> wrapper);
	
	List<HesuanjiancedianView> selectListView(@Param("ew") Wrapper<HesuanjiancedianEntity> wrapper);

	List<HesuanjiancedianView> selectListView(Pagination page,@Param("ew") Wrapper<HesuanjiancedianEntity> wrapper);
	
	HesuanjiancedianView selectView(@Param("ew") Wrapper<HesuanjiancedianEntity> wrapper);
	

}
