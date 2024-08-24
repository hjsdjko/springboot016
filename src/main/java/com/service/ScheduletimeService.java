package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ScheduletimeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ScheduletimeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ScheduletimeView;


/**
 * 课表时间
 *
 * @author 
 * @email 
 * @date 2024-04-21 16:43:31
 */
public interface ScheduletimeService extends IService<ScheduletimeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ScheduletimeVO> selectListVO(Wrapper<ScheduletimeEntity> wrapper);
   	
   	ScheduletimeVO selectVO(@Param("ew") Wrapper<ScheduletimeEntity> wrapper);
   	
   	List<ScheduletimeView> selectListView(Wrapper<ScheduletimeEntity> wrapper);
   	
   	ScheduletimeView selectView(@Param("ew") Wrapper<ScheduletimeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ScheduletimeEntity> wrapper);

   	

}

