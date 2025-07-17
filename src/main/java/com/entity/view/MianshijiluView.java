package com.entity.view;

import com.entity.MianshijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 面试记录
 * 后端返回视图实体辅助类
 * @author 
 * @email 
 * @date
 */
@TableName("mianshijilu")
public class MianshijiluView  extends MianshijiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MianshijiluView(){
	}
 
 	public MianshijiluView(MianshijiluEntity mianshijiluEntity){
 	try {
			BeanUtils.copyProperties(this, mianshijiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}