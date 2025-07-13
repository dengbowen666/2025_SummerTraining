package com.dao;

import com.entity.GangweiluyongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GangweiluyongVO;
import com.entity.view.GangweiluyongView;


/**
 * 岗位录用
 * 
 * @author 
 * @email 
 * @date
 */
public interface GangweiluyongDao extends BaseMapper<GangweiluyongEntity> {
	
	List<GangweiluyongVO> selectListVO(@Param("ew") Wrapper<GangweiluyongEntity> wrapper);
	
	GangweiluyongVO selectVO(@Param("ew") Wrapper<GangweiluyongEntity> wrapper);
	
	List<GangweiluyongView> selectListView(@Param("ew") Wrapper<GangweiluyongEntity> wrapper);

	List<GangweiluyongView> selectListView(Pagination page,@Param("ew") Wrapper<GangweiluyongEntity> wrapper);
	
	GangweiluyongView selectView(@Param("ew") Wrapper<GangweiluyongEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GangweiluyongEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GangweiluyongEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GangweiluyongEntity> wrapper);
}