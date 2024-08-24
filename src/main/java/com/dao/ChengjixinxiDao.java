package com.dao;

import com.entity.ChengjixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChengjixinxiVO;
import com.entity.view.ChengjixinxiView;


/**
 * 成绩信息
 * 
 * @author 
 * @email 
 * @date 2024-04-21 16:43:32
 */
public interface ChengjixinxiDao extends BaseMapper<ChengjixinxiEntity> {
	
	List<ChengjixinxiVO> selectListVO(@Param("ew") Wrapper<ChengjixinxiEntity> wrapper);
	
	ChengjixinxiVO selectVO(@Param("ew") Wrapper<ChengjixinxiEntity> wrapper);
	
	List<ChengjixinxiView> selectListView(@Param("ew") Wrapper<ChengjixinxiEntity> wrapper);

	List<ChengjixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ChengjixinxiEntity> wrapper);

	
	ChengjixinxiView selectView(@Param("ew") Wrapper<ChengjixinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChengjixinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChengjixinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChengjixinxiEntity> wrapper);

    List<Map<String, Object>> chengjifenshuSectionStat(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChengjixinxiEntity> wrapper);


}
