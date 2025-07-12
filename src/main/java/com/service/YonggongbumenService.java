package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.YonggongbumenEntity;
import com.entity.view.YonggongbumenView;
import com.entity.vo.YonggongbumenVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 用工部门
 *
 * @author 
 * @email 
 * @date
 */
public interface YonggongbumenService extends IService<YonggongbumenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonggongbumenVO> selectListVO(Wrapper<YonggongbumenEntity> wrapper);
   	
   	YonggongbumenVO selectVO(@Param("ew") Wrapper<YonggongbumenEntity> wrapper);
   	
   	List<YonggongbumenView> selectListView(Wrapper<YonggongbumenEntity> wrapper);
   	
   	YonggongbumenView selectView(@Param("ew") Wrapper<YonggongbumenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, Wrapper<YonggongbumenEntity> wrapper);

}