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


import com.dao.ScheduletimeDao;
import com.entity.ScheduletimeEntity;
import com.service.ScheduletimeService;
import com.entity.vo.ScheduletimeVO;
import com.entity.view.ScheduletimeView;

@Service("scheduletimeService")
public class ScheduletimeServiceImpl extends ServiceImpl<ScheduletimeDao, ScheduletimeEntity> implements ScheduletimeService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ScheduletimeEntity> page = this.selectPage(
                new Query<ScheduletimeEntity>(params).getPage(),
                new EntityWrapper<ScheduletimeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ScheduletimeEntity> wrapper) {
		  Page<ScheduletimeView> page =new Query<ScheduletimeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ScheduletimeVO> selectListVO(Wrapper<ScheduletimeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ScheduletimeVO selectVO(Wrapper<ScheduletimeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ScheduletimeView> selectListView(Wrapper<ScheduletimeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ScheduletimeView selectView(Wrapper<ScheduletimeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
