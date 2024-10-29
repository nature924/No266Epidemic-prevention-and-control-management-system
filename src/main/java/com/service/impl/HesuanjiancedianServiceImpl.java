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


import com.dao.HesuanjiancedianDao;
import com.entity.HesuanjiancedianEntity;
import com.service.HesuanjiancedianService;
import com.entity.vo.HesuanjiancedianVO;
import com.entity.view.HesuanjiancedianView;

@Service("hesuanjiancedianService")
public class HesuanjiancedianServiceImpl extends ServiceImpl<HesuanjiancedianDao, HesuanjiancedianEntity> implements HesuanjiancedianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HesuanjiancedianEntity> page = this.selectPage(
                new Query<HesuanjiancedianEntity>(params).getPage(),
                new EntityWrapper<HesuanjiancedianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HesuanjiancedianEntity> wrapper) {
		  Page<HesuanjiancedianView> page =new Query<HesuanjiancedianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HesuanjiancedianVO> selectListVO(Wrapper<HesuanjiancedianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HesuanjiancedianVO selectVO(Wrapper<HesuanjiancedianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HesuanjiancedianView> selectListView(Wrapper<HesuanjiancedianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HesuanjiancedianView selectView(Wrapper<HesuanjiancedianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
