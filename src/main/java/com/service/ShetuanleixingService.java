package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShetuanleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShetuanleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShetuanleixingView;


/**
 * 社团类型
 *
 * @author 
 * @email 
 * @date 2021-04-16 21:06:36
 */
public interface ShetuanleixingService extends IService<ShetuanleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShetuanleixingVO> selectListVO(Wrapper<ShetuanleixingEntity> wrapper);
   	
   	ShetuanleixingVO selectVO(@Param("ew") Wrapper<ShetuanleixingEntity> wrapper);
   	
   	List<ShetuanleixingView> selectListView(Wrapper<ShetuanleixingEntity> wrapper);
   	
   	ShetuanleixingView selectView(@Param("ew") Wrapper<ShetuanleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShetuanleixingEntity> wrapper);
   	
}

