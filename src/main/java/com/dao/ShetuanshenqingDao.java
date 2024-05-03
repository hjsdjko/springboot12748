package com.dao;

import com.entity.ShetuanshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShetuanshenqingVO;
import com.entity.view.ShetuanshenqingView;


/**
 * 社团申请
 * 
 * @author 
 * @email 
 * @date 2021-04-16 21:06:36
 */
public interface ShetuanshenqingDao extends BaseMapper<ShetuanshenqingEntity> {
	
	List<ShetuanshenqingVO> selectListVO(@Param("ew") Wrapper<ShetuanshenqingEntity> wrapper);
	
	ShetuanshenqingVO selectVO(@Param("ew") Wrapper<ShetuanshenqingEntity> wrapper);
	
	List<ShetuanshenqingView> selectListView(@Param("ew") Wrapper<ShetuanshenqingEntity> wrapper);

	List<ShetuanshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<ShetuanshenqingEntity> wrapper);
	
	ShetuanshenqingView selectView(@Param("ew") Wrapper<ShetuanshenqingEntity> wrapper);
	
}
