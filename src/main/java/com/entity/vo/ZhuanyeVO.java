package com.entity.vo;

import java.io.Serializable;


/**
 * 专业
 * @author 
 * @email 
 * @date
 */
public class ZhuanyeVO implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 专业
	 */
	
	private String zhuanye;
				
	
	/**
	 * 设置：专业
	 */
	 
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	
	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}
			
}