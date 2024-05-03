package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShetuanshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShetuanshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShetuanshenqingView;


/**
 * 社团申请
 *
 * @author 
 * @email 
 * @date 2021-04-16 21:06:36
 */
public interface ShetuanshenqingService extends IService<ShetuanshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShetuanshenqingVO> selectListVO(Wrapper<ShetuanshenqingEntity> wrapper);
   	
   	ShetuanshenqingVO selectVO(@Param("ew") Wrapper<ShetuanshenqingEntity> wrapper);
   	
   	List<ShetuanshenqingView> selectListView(Wrapper<ShetuanshenqingEntity> wrapper);
   	
   	ShetuanshenqingView selectView(@Param("ew") Wrapper<ShetuanshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShetuanshenqingEntity> wrapper);
   	
}

