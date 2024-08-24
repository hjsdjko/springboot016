package com.dao;

import com.entity.KebiaoxinixEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KebiaoxinixVO;
import com.entity.view.KebiaoxinixView;


/**
 * 课表信息
 * 
 * @author 
 * @email 
 * @date 2024-04-21 16:43:31
 */
public interface KebiaoxinixDao extends BaseMapper<KebiaoxinixEntity> {
	
	List<KebiaoxinixVO> selectListVO(@Param("ew") Wrapper<KebiaoxinixEntity> wrapper);
	
	KebiaoxinixVO selectVO(@Param("ew") Wrapper<KebiaoxinixEntity> wrapper);
	
	List<KebiaoxinixView> selectListView(@Param("ew") Wrapper<KebiaoxinixEntity> wrapper);

	List<KebiaoxinixView> selectListView(Pagination page,@Param("ew") Wrapper<KebiaoxinixEntity> wrapper);

	
	KebiaoxinixView selectView(@Param("ew") Wrapper<KebiaoxinixEntity> wrapper);
	

}
