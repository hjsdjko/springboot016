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


import com.dao.KebiaoxinixDao;
import com.entity.KebiaoxinixEntity;
import com.service.KebiaoxinixService;
import com.entity.vo.KebiaoxinixVO;
import com.entity.view.KebiaoxinixView;

@Service("kebiaoxinixService")
public class KebiaoxinixServiceImpl extends ServiceImpl<KebiaoxinixDao, KebiaoxinixEntity> implements KebiaoxinixService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KebiaoxinixEntity> page = this.selectPage(
                new Query<KebiaoxinixEntity>(params).getPage(),
                new EntityWrapper<KebiaoxinixEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KebiaoxinixEntity> wrapper) {
		  Page<KebiaoxinixView> page =new Query<KebiaoxinixView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<KebiaoxinixVO> selectListVO(Wrapper<KebiaoxinixEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KebiaoxinixVO selectVO(Wrapper<KebiaoxinixEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KebiaoxinixView> selectListView(Wrapper<KebiaoxinixEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KebiaoxinixView selectView(Wrapper<KebiaoxinixEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
