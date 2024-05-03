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


import com.dao.ShetuanshenqingDao;
import com.entity.ShetuanshenqingEntity;
import com.service.ShetuanshenqingService;
import com.entity.vo.ShetuanshenqingVO;
import com.entity.view.ShetuanshenqingView;

@Service("shetuanshenqingService")
public class ShetuanshenqingServiceImpl extends ServiceImpl<ShetuanshenqingDao, ShetuanshenqingEntity> implements ShetuanshenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShetuanshenqingEntity> page = this.selectPage(
                new Query<ShetuanshenqingEntity>(params).getPage(),
                new EntityWrapper<ShetuanshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShetuanshenqingEntity> wrapper) {
		  Page<ShetuanshenqingView> page =new Query<ShetuanshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShetuanshenqingVO> selectListVO(Wrapper<ShetuanshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShetuanshenqingVO selectVO(Wrapper<ShetuanshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShetuanshenqingView> selectListView(Wrapper<ShetuanshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShetuanshenqingView selectView(Wrapper<ShetuanshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
