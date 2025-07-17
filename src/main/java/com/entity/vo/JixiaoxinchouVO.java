package com.entity.vo;

import com.entity.JixiaoxinchouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 绩效薪酬
 * @author 
 * @email 
 * @date
 */
public class JixiaoxinchouVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 岗位要求
	 */
	
	private String gangweiyaoqiu;
		
	/**
	 * 考核内容
	 */
	
	private String kaoheneirong;
		
	/**
	 * 考核情况
	 */
	
	private String kaoheqingkuang;
		
	/**
	 * 考核评级
	 */
	
	private String kaohepingji;
		
	/**
	 * 考核文件
	 */
	
	private String kaohewenjian;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 薪酬金额
	 */
	
	private Integer xinchoujine;
		
	/**
	 * 考核日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaoheriqi;
		
	/**
	 * 部门编号
	 */
	
	private String bumenbianhao;
		
	/**
	 * 部门名称
	 */
	
	private String bumenmingcheng;
				
	
	/**
	 * 设置：岗位要求
	 */
	 
	public void setGangweiyaoqiu(String gangweiyaoqiu) {
		this.gangweiyaoqiu = gangweiyaoqiu;
	}
	
	/**
	 * 获取：岗位要求
	 */
	public String getGangweiyaoqiu() {
		return gangweiyaoqiu;
	}
				
	
	/**
	 * 设置：考核内容
	 */
	 
	public void setKaoheneirong(String kaoheneirong) {
		this.kaoheneirong = kaoheneirong;
	}
	
	/**
	 * 获取：考核内容
	 */
	public String getKaoheneirong() {
		return kaoheneirong;
	}
				
	
	/**
	 * 设置：考核情况
	 */
	 
	public void setKaoheqingkuang(String kaoheqingkuang) {
		this.kaoheqingkuang = kaoheqingkuang;
	}
	
	/**
	 * 获取：考核情况
	 */
	public String getKaoheqingkuang() {
		return kaoheqingkuang;
	}
				
	
	/**
	 * 设置：考核评级
	 */
	 
	public void setKaohepingji(String kaohepingji) {
		this.kaohepingji = kaohepingji;
	}
	
	/**
	 * 获取：考核评级
	 */
	public String getKaohepingji() {
		return kaohepingji;
	}
				
	
	/**
	 * 设置：考核文件
	 */
	 
	public void setKaohewenjian(String kaohewenjian) {
		this.kaohewenjian = kaohewenjian;
	}
	
	/**
	 * 获取：考核文件
	 */
	public String getKaohewenjian() {
		return kaohewenjian;
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
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：薪酬金额
	 */
	 
	public void setXinchoujine(Integer xinchoujine) {
		this.xinchoujine = xinchoujine;
	}
	
	/**
	 * 获取：薪酬金额
	 */
	public Integer getXinchoujine() {
		return xinchoujine;
	}
				
	
	/**
	 * 设置：考核日期
	 */
	 
	public void setKaoheriqi(Date kaoheriqi) {
		this.kaoheriqi = kaoheriqi;
	}
	
	/**
	 * 获取：考核日期
	 */
	public Date getKaoheriqi() {
		return kaoheriqi;
	}
				
	
	/**
	 * 设置：部门编号
	 */
	 
	public void setBumenbianhao(String bumenbianhao) {
		this.bumenbianhao = bumenbianhao;
	}
	
	/**
	 * 获取：部门编号
	 */
	public String getBumenbianhao() {
		return bumenbianhao;
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
			
}