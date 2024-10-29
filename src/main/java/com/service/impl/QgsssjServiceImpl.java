package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.QgsssjDao;
import com.entity.QgsssjEntity;
import com.service.QgsssjService;
import com.entity.vo.QgsssjVO;
import com.entity.view.QgsssjView;

@Service("qgsssjService")
public class QgsssjServiceImpl extends ServiceImpl<QgsssjDao, QgsssjEntity> implements QgsssjService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QgsssjEntity> page = this.selectPage(
                new Query<QgsssjEntity>(params).getPage(),
                new EntityWrapper<QgsssjEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QgsssjEntity> wrapper) {
		  Page<QgsssjView> page =new Query<QgsssjView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QgsssjVO> selectListVO(Wrapper<QgsssjEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QgsssjVO selectVO(Wrapper<QgsssjEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QgsssjView> selectListView(Wrapper<QgsssjEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QgsssjView selectView(Wrapper<QgsssjEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
