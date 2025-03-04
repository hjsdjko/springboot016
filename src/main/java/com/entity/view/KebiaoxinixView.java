package com.entity.view;

import com.entity.KebiaoxinixEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 课表信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-21 16:43:31
 */
@TableName("kebiaoxinix")
public class KebiaoxinixView  extends KebiaoxinixEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KebiaoxinixView(){
	}
 
 	public KebiaoxinixView(KebiaoxinixEntity kebiaoxinixEntity){
 	try {
			BeanUtils.copyProperties(this, kebiaoxinixEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
