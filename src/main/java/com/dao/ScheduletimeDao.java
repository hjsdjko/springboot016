package com.dao;

import com.entity.ScheduletimeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ScheduletimeVO;
import com.entity.view.ScheduletimeView;


/**
 * 课表时间
 * 
 * @author 
 * @email 
 * @date 2024-04-21 16:43:31
 */
public interface ScheduletimeDao extends BaseMapper<ScheduletimeEntity> {
	
	List<ScheduletimeVO> selectListVO(@Param("ew") Wrapper<ScheduletimeEntity> wrapper);
	
	ScheduletimeVO selectVO(@Param("ew") Wrapper<ScheduletimeEntity> wrapper);
	
	List<ScheduletimeView> selectListView(@Param("ew") Wrapper<ScheduletimeEntity> wrapper);

	List<ScheduletimeView> selectListView(Pagination page,@Param("ew") Wrapper<ScheduletimeEntity> wrapper);

	
	ScheduletimeView selectView(@Param("ew") Wrapper<ScheduletimeEntity> wrapper);
	

}
