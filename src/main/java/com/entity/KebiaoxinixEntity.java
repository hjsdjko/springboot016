package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 课表信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-21 16:43:31
 */
@TableName("kebiaoxinix")
public class KebiaoxinixEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KebiaoxinixEntity() {
		
	}
	
	public KebiaoxinixEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 课程名称
	 */
					
	private String kechengmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：课程名称
	 */
	public void setKechengmingcheng(String kechengmingcheng) {
		this.kechengmingcheng = kechengmingcheng;
	}
	/**
	 * 获取：课程名称
	 */
	public String getKechengmingcheng() {
		return kechengmingcheng;
	}
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
