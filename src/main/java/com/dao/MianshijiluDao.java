package com.dao;

import com.entity.MianshijiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MianshijiluVO;
import com.entity.view.MianshijiluView;


/**
 * 面试记录
 * 
 * @author 
 * @email 
 * @date
 */
public interface MianshijiluDao extends BaseMapper<MianshijiluEntity> {
	
	List<MianshijiluVO> selectListVO(@Param("ew") Wrapper<MianshijiluEntity> wrapper);
	
	MianshijiluVO selectVO(@Param("ew") Wrapper<MianshijiluEntity> wrapper);
	
	List<MianshijiluView> selectListView(@Param("ew") Wrapper<MianshijiluEntity> wrapper);

	List<MianshijiluView> selectListView(Pagination page,@Param("ew") Wrapper<MianshijiluEntity> wrapper);
	
	MianshijiluView selectView(@Param("ew") Wrapper<MianshijiluEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MianshijiluEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MianshijiluEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MianshijiluEntity> wrapper);
}