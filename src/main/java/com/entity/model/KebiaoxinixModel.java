package com.entity.model;

import com.entity.KebiaoxinixEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 课表信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-21 16:43:31
 */
public class KebiaoxinixModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 节数
	 */
	
	private String sectionnum;
		
	/**
	 * 星期
	 */
	
	private Integer week;
		
	/**
	 * 班级名称
	 */
	
	private String banjimingcheng;
		
	/**
	 * 教室
	 */
	
	private String jiaoshi;
		
	/**
	 * 授课教师
	 */
	
	private String shoukejiaoshi;
				
	
	/**
	 * 设置：节数
	 */
	 
	public void setSectionnum(String sectionnum) {
		this.sectionnum = sectionnum;
	}
	
	/**
	 * 获取：节数
	 */
	public String getSectionnum() {
		return sectionnum;
	}
				
	
	/**
	 * 设置：星期
	 */
	 
	public void setWeek(Integer week) {
		this.week = week;
	}
	
	/**
	 * 获取：星期
	 */
	public Integer getWeek() {
		return week;
	}
				
	
	/**
	 * 设置：班级名称
	 */
	 
	public void setBanjimingcheng(String banjimingcheng) {
		this.banjimingcheng = banjimingcheng;
	}
	
	/**
	 * 获取：班级名称
	 */
	public String getBanjimingcheng() {
		return banjimingcheng;
	}
				
	
	/**
	 * 设置：教室
	 */
	 
	public void setJiaoshi(String jiaoshi) {
		this.jiaoshi = jiaoshi;
	}
	
	/**
	 * 获取：教室
	 */
	public String getJiaoshi() {
		return jiaoshi;
	}
				
	
	/**
	 * 设置：授课教师
	 */
	 
	public void setShoukejiaoshi(String shoukejiaoshi) {
		this.shoukejiaoshi = shoukejiaoshi;
	}
	
	/**
	 * 获取：授课教师
	 */
	public String getShoukejiaoshi() {
		return shoukejiaoshi;
	}
			
}
