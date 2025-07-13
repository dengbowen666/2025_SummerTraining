package com.entity.model;

import java.io.Serializable;
 

/**
 * 专业
 * 接收传参的实体类
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date
 */
public class ZhuanyeModel  implements Serializable {
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