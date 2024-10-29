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


import com.dao.FangyirenyuanDao;
import com.entity.FangyirenyuanEntity;
import com.service.FangyirenyuanService;
import com.entity.vo.FangyirenyuanVO;
import com.entity.view.FangyirenyuanView;

@Service("fangyirenyuanService")
public class FangyirenyuanServiceImpl extends ServiceImpl<FangyirenyuanDao, FangyirenyuanEntity> implements FangyirenyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangyirenyuanEntity> page = this.selectPage(
                new Query<FangyirenyuanEntity>(params).getPage(),
                new EntityWrapper<FangyirenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangyirenyuanEntity> wrapper) {
		  Page<FangyirenyuanView> page =new Query<FangyirenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangyirenyuanVO> selectListVO(Wrapper<FangyirenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangyirenyuanVO selectVO(Wrapper<FangyirenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangyirenyuanView> selectListView(Wrapper<FangyirenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangyirenyuanView selectView(Wrapper<FangyirenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
