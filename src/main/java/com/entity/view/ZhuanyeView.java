package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.ZhuanyeEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
 

/**
 * 专业
 * 后端返回视图实体辅助类
 * @author 
 * @email 
 * @date
 */
@TableName("zhuanye")
public class ZhuanyeView  extends ZhuanyeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuanyeView(){
	}
 
 	public ZhuanyeView(ZhuanyeEntity zhuanyeEntity){
 	try {
			BeanUtils.copyProperties(this, zhuanyeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}