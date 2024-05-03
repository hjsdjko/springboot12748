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


import com.dao.ShetuanleixingDao;
import com.entity.ShetuanleixingEntity;
import com.service.ShetuanleixingService;
import com.entity.vo.ShetuanleixingVO;
import com.entity.view.ShetuanleixingView;

@Service("shetuanleixingService")
public class ShetuanleixingServiceImpl extends ServiceImpl<ShetuanleixingDao, ShetuanleixingEntity> implements ShetuanleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShetuanleixingEntity> page = this.selectPage(
                new Query<ShetuanleixingEntity>(params).getPage(),
                new EntityWrapper<ShetuanleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShetuanleixingEntity> wrapper) {
		  Page<ShetuanleixingView> page =new Query<ShetuanleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShetuanleixingVO> selectListVO(Wrapper<ShetuanleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShetuanleixingVO selectVO(Wrapper<ShetuanleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShetuanleixingView> selectListView(Wrapper<ShetuanleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShetuanleixingView selectView(Wrapper<ShetuanleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
