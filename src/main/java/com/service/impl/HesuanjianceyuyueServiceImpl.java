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


import com.dao.HesuanjianceyuyueDao;
import com.entity.HesuanjianceyuyueEntity;
import com.service.HesuanjianceyuyueService;
import com.entity.vo.HesuanjianceyuyueVO;
import com.entity.view.HesuanjianceyuyueView;

@Service("hesuanjianceyuyueService")
public class HesuanjianceyuyueServiceImpl extends ServiceImpl<HesuanjianceyuyueDao, HesuanjianceyuyueEntity> implements HesuanjianceyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HesuanjianceyuyueEntity> page = this.selectPage(
                new Query<HesuanjianceyuyueEntity>(params).getPage(),
                new EntityWrapper<HesuanjianceyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HesuanjianceyuyueEntity> wrapper) {
		  Page<HesuanjianceyuyueView> page =new Query<HesuanjianceyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HesuanjianceyuyueVO> selectListVO(Wrapper<HesuanjianceyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HesuanjianceyuyueVO selectVO(Wrapper<HesuanjianceyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HesuanjianceyuyueView> selectListView(Wrapper<HesuanjianceyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HesuanjianceyuyueView selectView(Wrapper<HesuanjianceyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<HesuanjianceyuyueEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<HesuanjianceyuyueEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<HesuanjianceyuyueEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
