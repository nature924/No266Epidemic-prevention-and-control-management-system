package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HesuanjieguoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HesuanjieguoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HesuanjieguoView;


/**
 * 核酸结果
 *
 * @author 
 * @email 
 * @date 2023-02-21 11:55:18
 */
public interface HesuanjieguoService extends IService<HesuanjieguoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HesuanjieguoVO> selectListVO(Wrapper<HesuanjieguoEntity> wrapper);
   	
   	HesuanjieguoVO selectVO(@Param("ew") Wrapper<HesuanjieguoEntity> wrapper);
   	
   	List<HesuanjieguoView> selectListView(Wrapper<HesuanjieguoEntity> wrapper);
   	
   	HesuanjieguoView selectView(@Param("ew") Wrapper<HesuanjieguoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HesuanjieguoEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<HesuanjieguoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<HesuanjieguoEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<HesuanjieguoEntity> wrapper);



}

