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
 * 用工部门
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date
 */
@TableName("yonggongbumen")
public class YonggongbumenEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YonggongbumenEntity() {
		
	}
	
	public YonggongbumenEntity(T t) {
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
	@TableId
	private Long id;
	/**
	 * 部门编号
	 */
					
	private String bumenbianhao;
	
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