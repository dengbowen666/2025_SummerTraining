package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.JixiaoxinchouEntity;
import com.entity.view.JixiaoxinchouView;
import com.entity.vo.JixiaoxinchouVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 绩效薪酬
 *
 * @author 
 * @email 
 * @date
 */
public interface JixiaoxinchouService extends IService<JixiaoxinchouEntity> {

    PageUtils queryPage(Map<String, Object> params);

   	List<JixiaoxinchouVO> selectListVO(Wrapper<JixiaoxinchouEntity> wrapper);

   	JixiaoxinchouVO selectVO(@Param("ew") Wrapper<JixiaoxinchouEntity> wrapper);

   	List<JixiaoxinchouView> selectListView(Wrapper<JixiaoxinchouEntity> wrapper);

   	JixiaoxinchouView selectView(@Param("ew") Wrapper<JixiaoxinchouEntity> wrapper);

   	PageUtils queryPage(Map<String, Object> params, Wrapper<JixiaoxinchouEntity> wrapper);

}