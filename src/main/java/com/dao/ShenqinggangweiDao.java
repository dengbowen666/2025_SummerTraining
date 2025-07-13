package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.ShenqinggangweiEntity;
import com.entity.view.ShenqinggangweiView;
import com.entity.vo.ShenqinggangweiVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 申请岗位
 * 
 * @author 
 * @email 
 * @date
 */
public interface ShenqinggangweiDao extends BaseMapper<ShenqinggangweiEntity> {
	
	List<ShenqinggangweiVO> selectListVO(@Param("ew") Wrapper<ShenqinggangweiEntity> wrapper);
	
	ShenqinggangweiVO selectVO(@Param("ew") Wrapper<ShenqinggangweiEntity> wrapper);
	
	List<ShenqinggangweiView> selectListView(@Param("ew") Wrapper<ShenqinggangweiEntity> wrapper);

	List<ShenqinggangweiView> selectListView(Pagination page, @Param("ew") Wrapper<ShenqinggangweiEntity> wrapper);
	
	ShenqinggangweiView selectView(@Param("ew") Wrapper<ShenqinggangweiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params, @Param("ew") Wrapper<ShenqinggangweiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params, @Param("ew") Wrapper<ShenqinggangweiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params, @Param("ew") Wrapper<ShenqinggangweiEntity> wrapper);
}