package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenqinggangweiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenqinggangweiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenqinggangweiView;


/**
 * 申请岗位
 *
 * @author 
 * @email 
 * @date
 */
public interface ShenqinggangweiService extends IService<ShenqinggangweiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenqinggangweiVO> selectListVO(Wrapper<ShenqinggangweiEntity> wrapper);
   	
   	ShenqinggangweiVO selectVO(@Param("ew") Wrapper<ShenqinggangweiEntity> wrapper);
   	
   	List<ShenqinggangweiView> selectListView(Wrapper<ShenqinggangweiEntity> wrapper);
   	
   	ShenqinggangweiView selectView(@Param("ew") Wrapper<ShenqinggangweiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenqinggangweiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ShenqinggangweiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ShenqinggangweiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ShenqinggangweiEntity> wrapper);
}

