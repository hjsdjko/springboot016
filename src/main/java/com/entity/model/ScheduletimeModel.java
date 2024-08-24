package com.entity.model;

import com.entity.ScheduletimeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 课表时间
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-21 16:43:31
 */
public class ScheduletimeModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 开始时间
	 */
	
	private String starttime;
		
	/**
	 * 结束时间
	 */
	
	private String endtime;
				
	
	/**
	 * 设置：开始时间
	 */
	 
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	
	/**
	 * 获取：开始时间
	 */
	public String getStarttime() {
		return starttime;
	}
				
	
	/**
	 * 设置：结束时间
	 */
	 
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	
	/**
	 * 获取：结束时间
	 */
	public String getEndtime() {
		return endtime;
	}
			
}
