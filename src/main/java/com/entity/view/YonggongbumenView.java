package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.YonggongbumenEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;


/**
 * 用工部门
 * 后端返回视图实体辅助类
 * @author 
 * @email 
 * @date
 */
@TableName("yonggongbumen")
public class YonggongbumenView extends YonggongbumenEntity implements Serializable {
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