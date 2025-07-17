package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonggongbumenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonggongbumenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonggongbumenView;


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