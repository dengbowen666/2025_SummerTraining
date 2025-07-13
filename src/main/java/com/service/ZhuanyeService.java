package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.ZhuanyeEntity;
import com.entity.view.ZhuanyeView;
import com.entity.vo.ZhuanyeVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 专业
 *
 * @author 
 * @email 
 * @date
 */
public interface ZhuanyeService extends IService<ZhuanyeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuanyeVO> selectListVO(Wrapper<ZhuanyeEntity> wrapper);
   	
   	ZhuanyeVO selectVO(@Param("ew") Wrapper<ZhuanyeEntity> wrapper);
   	
   	List<ZhuanyeView> selectListView(Wrapper<ZhuanyeEntity> wrapper);
   	
   	ZhuanyeView selectView(@Param("ew") Wrapper<ZhuanyeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuanyeEntity> wrapper);

}