package com.dao;

import com.entity.QgsssjEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QgsssjVO;
import com.entity.view.QgsssjView;


/**
 * 全国实时数据
 * 
 * @author 
 * @email 
 * @date 2023-02-21 11:55:18
 */
public interface QgsssjDao extends BaseMapper<QgsssjEntity> {
	
	List<QgsssjVO> selectListVO(@Param("ew") Wrapper<QgsssjEntity> wrapper);
	
	QgsssjVO selectVO(@Param("ew") Wrapper<QgsssjEntity> wrapper);
	
	List<QgsssjView> selectListView(@Param("ew") Wrapper<QgsssjEntity> wrapper);

	List<QgsssjView> selectListView(Pagination page,@Param("ew") Wrapper<QgsssjEntity> wrapper);
	
	QgsssjView selectView(@Param("ew") Wrapper<QgsssjEntity> wrapper);
	

}
