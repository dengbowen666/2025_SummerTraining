package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JixiaoxinchouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JixiaoxinchouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JixiaoxinchouView;


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