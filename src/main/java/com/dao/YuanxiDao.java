package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.YuanxiEntity;
import com.entity.view.YuanxiView;
import com.entity.vo.YuanxiVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 院系
 * 
 * @author 
 * @email 
 * @date
 */
public interface YuanxiDao extends BaseMapper<YuanxiEntity> {
	
	List<YuanxiVO> selectListVO(@Param("ew") Wrapper<YuanxiEntity> wrapper);
	
	YuanxiVO selectVO(@Param("ew") Wrapper<YuanxiEntity> wrapper);
	
	List<YuanxiView> selectListView(@Param("ew") Wrapper<YuanxiEntity> wrapper);

	List<YuanxiView> selectListView(Pagination page, @Param("ew") Wrapper<YuanxiEntity> wrapper);
	
	YuanxiView selectView(@Param("ew") Wrapper<YuanxiEntity> wrapper);

}