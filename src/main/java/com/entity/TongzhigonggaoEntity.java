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
 * 通知公告
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-21 16:43:32
 */
@TableName("tongzhigonggao")
public class TongzhigonggaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TongzhigonggaoEntity() {
		
	}
	
	public TongzhigonggaoEntity(T t) {
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
	 * 公告标题
	 */
					
	private String gonggaobiaoti;
	
	/**
	 * 公告封面
	 */
					
	private String gonggaofengmian;
	
	/**
	 * 公告简介
	 */
					
	private String gonggaojianjie;
	
	/**
	 * 公告内容
	 */
					
	private String gonggaoneirong;
	
	/**
	 * 发布日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
	
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
	 * 设置：公告标题
	 */
	public void setGonggaobiaoti(String gonggaobiaoti) {
		this.gonggaobiaoti = gonggaobiaoti;
	}
	/**
	 * 获取：公告标题
	 */
	public String getGonggaobiaoti() {
		return gonggaobiaoti;
	}
	/**
	 * 设置：公告封面
	 */
	public void setGonggaofengmian(String gonggaofengmian) {
		this.gonggaofengmian = gonggaofengmian;
	}
	/**
	 * 获取：公告封面
	 */
	public String getGonggaofengmian() {
		return gonggaofengmian;
	}
	/**
	 * 设置：公告简介
	 */
	public void setGonggaojianjie(String gonggaojianjie) {
		this.gonggaojianjie = gonggaojianjie;
	}
	/**
	 * 获取：公告简介
	 */
	public String getGonggaojianjie() {
		return gonggaojianjie;
	}
	/**
	 * 设置：公告内容
	 */
	public void setGonggaoneirong(String gonggaoneirong) {
		this.gonggaoneirong = gonggaoneirong;
	}
	/**
	 * 获取：公告内容
	 */
	public String getGonggaoneirong() {
		return gonggaoneirong;
	}
	/**
	 * 设置：发布日期
	 */
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}

}
