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
 * 课程信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-21 16:43:31
 */
@TableName("kechengxinxi")
public class KechengxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KechengxinxiEntity() {
		
	}
	
	public KechengxinxiEntity(T t) {
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
	 * 课程封面
	 */
					
	private String kechengfengmian;
	
	/**
	 * 科目
	 */
					
	private String kemu;
	
	/**
	 * 班级名称
	 */
					
	private String banjimingcheng;
	
	/**
	 * 课程人数
	 */
					
	private Integer kechengrenshu;
	
	/**
	 * 授课时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date shoukeshijian;
	
	/**
	 * 授课地点
	 */
					
	private String shoukedidian;
	
	/**
	 * 课程简介
	 */
					
	private String kechengjianjie;
	
	/**
	 * 课程内容
	 */
					
	private String kechengneirong;
	
	/**
	 * 职工号
	 */
					
	private String zhigonghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
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
	 * 设置：课程封面
	 */
	public void setKechengfengmian(String kechengfengmian) {
		this.kechengfengmian = kechengfengmian;
	}
	/**
	 * 获取：课程封面
	 */
	public String getKechengfengmian() {
		return kechengfengmian;
	}
	/**
	 * 设置：科目
	 */
	public void setKemu(String kemu) {
		this.kemu = kemu;
	}
	/**
	 * 获取：科目
	 */
	public String getKemu() {
		return kemu;
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
	 * 设置：课程人数
	 */
	public void setKechengrenshu(Integer kechengrenshu) {
		this.kechengrenshu = kechengrenshu;
	}
	/**
	 * 获取：课程人数
	 */
	public Integer getKechengrenshu() {
		return kechengrenshu;
	}
	/**
	 * 设置：授课时间
	 */
	public void setShoukeshijian(Date shoukeshijian) {
		this.shoukeshijian = shoukeshijian;
	}
	/**
	 * 获取：授课时间
	 */
	public Date getShoukeshijian() {
		return shoukeshijian;
	}
	/**
	 * 设置：授课地点
	 */
	public void setShoukedidian(String shoukedidian) {
		this.shoukedidian = shoukedidian;
	}
	/**
	 * 获取：授课地点
	 */
	public String getShoukedidian() {
		return shoukedidian;
	}
	/**
	 * 设置：课程简介
	 */
	public void setKechengjianjie(String kechengjianjie) {
		this.kechengjianjie = kechengjianjie;
	}
	/**
	 * 获取：课程简介
	 */
	public String getKechengjianjie() {
		return kechengjianjie;
	}
	/**
	 * 设置：课程内容
	 */
	public void setKechengneirong(String kechengneirong) {
		this.kechengneirong = kechengneirong;
	}
	/**
	 * 获取：课程内容
	 */
	public String getKechengneirong() {
		return kechengneirong;
	}
	/**
	 * 设置：职工号
	 */
	public void setZhigonghao(String zhigonghao) {
		this.zhigonghao = zhigonghao;
	}
	/**
	 * 获取：职工号
	 */
	public String getZhigonghao() {
		return zhigonghao;
	}
	/**
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
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
