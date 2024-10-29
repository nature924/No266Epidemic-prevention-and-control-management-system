package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HesuanjianceyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HesuanjianceyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HesuanjianceyuyueView;


/**
 * 核酸检测预约
 *
 * @author 
 * @email 
 * @date 2023-02-21 11:55:18
 */
public interface HesuanjianceyuyueService extends IService<HesuanjianceyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HesuanjianceyuyueVO> selectListVO(Wrapper<HesuanjianceyuyueEntity> wrapper);
   	
   	HesuanjianceyuyueVO selectVO(@Param("ew") Wrapper<HesuanjianceyuyueEntity> wrapper);
   	
   	List<HesuanjianceyuyueView> selectListView(Wrapper<HesuanjianceyuyueEntity> wrapper);
   	
   	HesuanjianceyuyueView selectView(@Param("ew") Wrapper<HesuanjianceyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HesuanjianceyuyueEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<HesuanjianceyuyueEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<HesuanjianceyuyueEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<HesuanjianceyuyueEntity> wrapper);



}

