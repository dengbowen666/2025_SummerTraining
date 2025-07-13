package com.entity.vo;

import com.entity.GangweiluyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 岗位录用
 * @author 
 * @email 
 * @date
 */
public class GangweiluyongVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 岗位要求
	 */
	
	private String gangweiyaoqiu;
		
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
	 * 录用说明
	 */
	
	private String luyongshuoming;
		
	/**
	 * 是否贫困生
	 */
	
	private String shifoupinkunsheng;
		
	/**
	 * 录用日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date luyongriqi;
		
	/**
	 * 部门编号
	 */
	
	private String bumenbianhao;
		
	/**
	 * 部门名称
	 */
	
	private String bumenmingcheng;
		
	/**
	 * 跨表用户id
	 */
	
	private Long crossuserid;
		
	/**
	 * 跨表主键id
	 */
	
	private Long crossrefid;
				
	
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
	 * 设置：录用说明
	 */
	 
	public void setLuyongshuoming(String luyongshuoming) {
		this.luyongshuoming = luyongshuoming;
	}
	
	/**
	 * 获取：录用说明
	 */
	public String getLuyongshuoming() {
		return luyongshuoming;
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
	 * 设置：录用日期
	 */
	 
	public void setLuyongriqi(Date luyongriqi) {
		this.luyongriqi = luyongriqi;
	}
	
	/**
	 * 获取：录用日期
	 */
	public Date getLuyongriqi() {
		return luyongriqi;
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
				
	
	/**
	 * 设置：跨表用户id
	 */
	 
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
				
	
	/**
	 * 设置：跨表主键id
	 */
	 
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
			
}