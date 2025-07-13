package com.dao;

import com.entity.YonggongbumenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonggongbumenVO;
import com.entity.view.YonggongbumenView;


/**
 * 用工部门
 * 
 * @author 
 * @email 
 * @date
 */
public interface YonggongbumenDao extends BaseMapper<YonggongbumenEntity> {
	
	List<YonggongbumenVO> selectListVO(@Param("ew") Wrapper<YonggongbumenEntity> wrapper);
	
	YonggongbumenVO selectVO(@Param("ew") Wrapper<YonggongbumenEntity> wrapper);
	
	List<YonggongbumenView> selectListView(@Param("ew") Wrapper<YonggongbumenEntity> wrapper);

	List<YonggongbumenView> selectListView(Pagination page,@Param("ew") Wrapper<YonggongbumenEntity> wrapper);
	
	YonggongbumenView selectView(@Param("ew") Wrapper<YonggongbumenEntity> wrapper);

}