package com.entity.vo;

import com.entity.BanjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 班级
 * @author 
 * @email 
 * @date 2024-04-21 16:43:31
 */
public class BanjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 班级地址
	 */
	
	private String banjidizhi;
				
	
	/**
	 * 设置：班级地址
	 */
	 
	public void setBanjidizhi(String banjidizhi) {
		this.banjidizhi = banjidizhi;
	}
	
	/**
	 * 获取：班级地址
	 */
	public String getBanjidizhi() {
		return banjidizhi;
	}
			
}
