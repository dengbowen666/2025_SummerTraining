package com.entity.view;

import com.entity.ShenqinggangweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 申请岗位
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date
 */
@TableName("shenqinggangwei")
public class ShenqinggangweiView  extends ShenqinggangweiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShenqinggangweiView(){
	}
 
 	public ShenqinggangweiView(ShenqinggangweiEntity shenqinggangweiEntity){
 	try {
			BeanUtils.copyProperties(this, shenqinggangweiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
