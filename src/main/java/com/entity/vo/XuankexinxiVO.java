package com.entity.vo;

import com.entity.XuankexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 选课信息
 * @author 
 * @email 
 * @date 2024-04-21 16:43:32
 */
public class XuankexinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 课程名称
	 */
	
	private String kechengmingcheng;
		
	/**
	 * 科目
	 */
	
	private String kemu;
		
	/**
	 * 课程封面
	 */
	
	private String kechengfengmian;
		
	/**
	 * 选课人数
	 */
	
	private Integer kechengrenshu;
		
	/**
	 * 授课时间
	 */
	
	private String shoukeshijian;
		
	/**
	 * 授课地点
	 */
	
	private String shoukedidian;
		
	/**
	 * 职工号
	 */
	
	private String zhigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 选课时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xuankeshijian;
		
	/**
	 * 选课备注
	 */
	
	private String xuankebeizhu;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：选课人数
	 */
	 
	public void setKechengrenshu(Integer kechengrenshu) {
		this.kechengrenshu = kechengrenshu;
	}
	
	/**
	 * 获取：选课人数
	 */
	public Integer getKechengrenshu() {
		return kechengrenshu;
	}
				
	
	/**
	 * 设置：授课时间
	 */
	 
	public void setShoukeshijian(String shoukeshijian) {
		this.shoukeshijian = shoukeshijian;
	}
	
	/**
	 * 获取：授课时间
	 */
	public String getShoukeshijian() {
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
	 * 设置：选课时间
	 */
	 
	public void setXuankeshijian(Date xuankeshijian) {
		this.xuankeshijian = xuankeshijian;
	}
	
	/**
	 * 获取：选课时间
	 */
	public Date getXuankeshijian() {
		return xuankeshijian;
	}
				
	
	/**
	 * 设置：选课备注
	 */
	 
	public void setXuankebeizhu(String xuankebeizhu) {
		this.xuankebeizhu = xuankebeizhu;
	}
	
	/**
	 * 获取：选课备注
	 */
	public String getXuankebeizhu() {
		return xuankebeizhu;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
