package com.entity.vo;

import com.entity.YonggongbumenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 用工部门
 * @author 
 * @email 
 * @date
 */
public class YonggongbumenVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 部门名称
	 */
	
	private String bumenmingcheng;
		
	/**
	 * 部门图片
	 */
	
	private String bumentupian;
		
	/**
	 * 办公地点
	 */
	
	private String bangongdidian;
		
	/**
	 * 负责教师
	 */
	
	private String fuzejiaoshi;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：部门名称
	 */
	 
	public void setBumenmingcheng(String bumenmingcheng) {
		this.bumenmingcheng = bumenmingcheng;
	}
	
	/**
	 * 获取：部门名称
	 */
	public String getBumenmingcheng() {
		return bumenmingcheng;
	}
				
	
	/**
	 * 设置：部门图片
	 */
	 
	public void setBumentupian(String bumentupian) {
		this.bumentupian = bumentupian;
	}
	
	/**
	 * 获取：部门图片
	 */
	public String getBumentupian() {
		return bumentupian;
	}
				
	
	/**
	 * 设置：办公地点
	 */
	 
	public void setBangongdidian(String bangongdidian) {
		this.bangongdidian = bangongdidian;
	}
	
	/**
	 * 获取：办公地点
	 */
	public String getBangongdidian() {
		return bangongdidian;
	}
				
	
	/**
	 * 设置：负责教师
	 */
	 
	public void setFuzejiaoshi(String fuzejiaoshi) {
		this.fuzejiaoshi = fuzejiaoshi;
	}
	
	/**
	 * 获取：负责教师
	 */
	public String getFuzejiaoshi() {
		return fuzejiaoshi;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
			
}