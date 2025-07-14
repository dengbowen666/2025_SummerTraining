package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MianshijiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MianshijiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MianshijiluView;


/**
 * 面试记录
 *
 * @author 
 * @email 
 * @date
 */
public interface MianshijiluService extends IService<MianshijiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MianshijiluVO> selectListVO(Wrapper<MianshijiluEntity> wrapper);
   	
   	MianshijiluVO selectVO(@Param("ew") Wrapper<MianshijiluEntity> wrapper);
   	
   	List<MianshijiluView> selectListView(Wrapper<MianshijiluEntity> wrapper);
   	
   	MianshijiluView selectView(@Param("ew") Wrapper<MianshijiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MianshijiluEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<MianshijiluEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<MianshijiluEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<MianshijiluEntity> wrapper);
}