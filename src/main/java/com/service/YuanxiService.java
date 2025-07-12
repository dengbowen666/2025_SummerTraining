package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.YuanxiEntity;
import com.entity.view.YuanxiView;
import com.entity.vo.YuanxiVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 院系
 *
 * @author 
 * @email 
 * @date
 */
public interface YuanxiService extends IService<YuanxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuanxiVO> selectListVO(Wrapper<YuanxiEntity> wrapper);
   	
   	YuanxiVO selectVO(@Param("ew") Wrapper<YuanxiEntity> wrapper);
   	
   	List<YuanxiView> selectListView(Wrapper<YuanxiEntity> wrapper);
   	
   	YuanxiView selectView(@Param("ew") Wrapper<YuanxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, Wrapper<YuanxiEntity> wrapper);

}