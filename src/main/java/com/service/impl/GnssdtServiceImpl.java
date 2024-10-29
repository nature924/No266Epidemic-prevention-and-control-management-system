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


import com.dao.GnssdtDao;
import com.entity.GnssdtEntity;
import com.service.GnssdtService;
import com.entity.vo.GnssdtVO;
import com.entity.view.GnssdtView;

@Service("gnssdtService")
public class GnssdtServiceImpl extends ServiceImpl<GnssdtDao, GnssdtEntity> implements GnssdtService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GnssdtEntity> page = this.selectPage(
                new Query<GnssdtEntity>(params).getPage(),
                new EntityWrapper<GnssdtEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GnssdtEntity> wrapper) {
		  Page<GnssdtView> page =new Query<GnssdtView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GnssdtVO> selectListVO(Wrapper<GnssdtEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GnssdtVO selectVO(Wrapper<GnssdtEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GnssdtView> selectListView(Wrapper<GnssdtEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GnssdtView selectView(Wrapper<GnssdtEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<GnssdtEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<GnssdtEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<GnssdtEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
