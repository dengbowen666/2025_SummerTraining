package com.entity.view;

import com.entity.GangweiluyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 


/**
 * 岗位录用
 * 后端返回视图实体辅助类
 * @author 
 * @email 
 * @date
 */
@TableName("gangweiluyong")
public class GangweiluyongView  extends GangweiluyongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GangweiluyongView(){
	}
 
 	public GangweiluyongView(GangweiluyongEntity gangweiluyongEntity){
 	try {
			BeanUtils.copyProperties(this, gangweiluyongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}