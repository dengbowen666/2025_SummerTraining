package com.entity.view;

import com.entity.YonggongbumenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用工部门
 * 后端返回视图实体辅助类
 * @author 
 * @email 
 * @date
 */
@TableName("yonggongbumen")
public class YonggongbumenView  extends YonggongbumenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonggongbumenView(){
	}
 
 	public YonggongbumenView(YonggongbumenEntity yonggongbumenEntity){
 	try {
			BeanUtils.copyProperties(this, yonggongbumenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}