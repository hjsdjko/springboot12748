package com.dao;

import com.entity.ShetuanleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShetuanleixingVO;
import com.entity.view.ShetuanleixingView;


/**
 * 社团类型
 * 
 * @author 
 * @email 
 * @date 2021-04-16 21:06:36
 */
public interface ShetuanleixingDao extends BaseMapper<ShetuanleixingEntity> {
	
	List<ShetuanleixingVO> selectListVO(@Param("ew") Wrapper<ShetuanleixingEntity> wrapper);
	
	ShetuanleixingVO selectVO(@Param("ew") Wrapper<ShetuanleixingEntity> wrapper);
	
	List<ShetuanleixingView> selectListView(@Param("ew") Wrapper<ShetuanleixingEntity> wrapper);

	List<ShetuanleixingView> selectListView(Pagination page,@Param("ew") Wrapper<ShetuanleixingEntity> wrapper);
	
	ShetuanleixingView selectView(@Param("ew") Wrapper<ShetuanleixingEntity> wrapper);
	
}
