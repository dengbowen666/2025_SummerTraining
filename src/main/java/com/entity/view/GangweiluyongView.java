package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.GangweiluyongEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;


/**
 * 岗位录用
 * 后端返回视图实体辅助类
 * @author 
 * @email 
 * @date
 */
@TableName("gangweiluyong")
public class GangweiluyongView extends GangweiluyongEntity implements Serializable {
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