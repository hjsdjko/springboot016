package com.entity.view;

import com.entity.ScheduletimeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 课表时间
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-21 16:43:31
 */
@TableName("scheduletime")
public class ScheduletimeView  extends ScheduletimeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ScheduletimeView(){
	}
 
 	public ScheduletimeView(ScheduletimeEntity scheduletimeEntity){
 	try {
			BeanUtils.copyProperties(this, scheduletimeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
