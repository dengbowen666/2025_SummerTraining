package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.YuanxiEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
 

/**
 * 院系
 * 后端返回视图实体辅助类
 * @author 
 * @email 
 * @date
 */
@TableName("yuanxi")
public class YuanxiView  extends YuanxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuanxiView(){
	}
 
 	public YuanxiView(YuanxiEntity yuanxiEntity){
 	try {
			BeanUtils.copyProperties(this, yuanxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}