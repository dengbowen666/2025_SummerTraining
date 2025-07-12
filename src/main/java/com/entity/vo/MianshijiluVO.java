package com.entity.vo;

import com.entity.MianshijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 面试记录
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-07-30 16:07:15
 */
public class MianshijiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 岗位名称
	 */
	
	private String gangweimingcheng;
		
	/**
	 * 岗位要求
	 */
	
	private String gangweiyaoqiu;
		
	/**
	 * 面试情况
	 */
	
	private String mianshiqingkuang;
		
	/**
	 * 面试说明
	 */
	
	private String mianshishuoming;
		
	/**
	 * 人数
	 */
	
	private Integer renshu;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 是否贫困生
	 */
	
	private String shifoupinkunsheng;
		
	/**
	 * 面试日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date mianshiriqi;
		
	/**
	 * 部门编号
	 */
	
	private String bumenbianhao;
		
	/**
	 * 部门名称
	 */
	
	private String bumenmingcheng;
				
	
	/**
	 * 设置：岗位名称
	 */
	 
	public void setGangweimingcheng(String gangweimingcheng) {
		this.gangweimingcheng = gangweimingcheng;
	}
	
	/**
	 * 获取：岗位名称
	 */
	public String getGangweimingcheng() {
		return gangweimingcheng;
	}
				
	
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
	 * 设置：面试情况
	 */
	 
	public void setMianshiqingkuang(String mianshiqingkuang) {
		this.mianshiqingkuang = mianshiqingkuang;
	}
	
	/**
	 * 获取：面试情况
	 */
	public String getMianshiqingkuang() {
		return mianshiqingkuang;
	}
				
	
	/**
	 * 设置：面试说明
	 */
	 
	public void setMianshishuoming(String mianshishuoming) {
		this.mianshishuoming = mianshishuoming;
	}
	
	/**
	 * 获取：面试说明
	 */
	public String getMianshishuoming() {
		return mianshishuoming;
	}
				
	
	/**
	 * 设置：人数
	 */
	 
	public void setRenshu(Integer renshu) {
		this.renshu = renshu;
	}
	
	/**
	 * 获取：人数
	 */
	public Integer getRenshu() {
		return renshu;
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
	 * 设置：是否贫困生
	 */
	 
	public void setShifoupinkunsheng(String shifoupinkunsheng) {
		this.shifoupinkunsheng = shifoupinkunsheng;
	}
	
	/**
	 * 获取：是否贫困生
	 */
	public String getShifoupinkunsheng() {
		return shifoupinkunsheng;
	}
				
	
	/**
	 * 设置：面试日期
	 */
	 
	public void setMianshiriqi(Date mianshiriqi) {
		this.mianshiriqi = mianshiriqi;
	}
	
	/**
	 * 获取：面试日期
	 */
	public Date getMianshiriqi() {
		return mianshiriqi;
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
