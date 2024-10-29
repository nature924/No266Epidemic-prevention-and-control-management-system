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


import com.dao.HesuanjieguoDao;
import com.entity.HesuanjieguoEntity;
import com.service.HesuanjieguoService;
import com.entity.vo.HesuanjieguoVO;
import com.entity.view.HesuanjieguoView;

@Service("hesuanjieguoService")
public class HesuanjieguoServiceImpl extends ServiceImpl<HesuanjieguoDao, HesuanjieguoEntity> implements HesuanjieguoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HesuanjieguoEntity> page = this.selectPage(
                new Query<HesuanjieguoEntity>(params).getPage(),
                new EntityWrapper<HesuanjieguoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HesuanjieguoEntity> wrapper) {
		  Page<HesuanjieguoView> page =new Query<HesuanjieguoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HesuanjieguoVO> selectListVO(Wrapper<HesuanjieguoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HesuanjieguoVO selectVO(Wrapper<HesuanjieguoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HesuanjieguoView> selectListView(Wrapper<HesuanjieguoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HesuanjieguoView selectView(Wrapper<HesuanjieguoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<HesuanjieguoEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<HesuanjieguoEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<HesuanjieguoEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
