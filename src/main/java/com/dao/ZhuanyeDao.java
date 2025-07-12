package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.ZhuanyeEntity;
import com.entity.view.ZhuanyeView;
import com.entity.vo.ZhuanyeVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 专业
 * 
 * @author 
 * @email 
 * @date
 */
public interface ZhuanyeDao extends BaseMapper<ZhuanyeEntity> {
	
	List<ZhuanyeVO> selectListVO(@Param("ew") Wrapper<ZhuanyeEntity> wrapper);
	
	ZhuanyeVO selectVO(@Param("ew") Wrapper<ZhuanyeEntity> wrapper);
	
	List<ZhuanyeView> selectListView(@Param("ew") Wrapper<ZhuanyeEntity> wrapper);

	List<ZhuanyeView> selectListView(Pagination page, @Param("ew") Wrapper<ZhuanyeEntity> wrapper);
	
	ZhuanyeView selectView(@Param("ew") Wrapper<ZhuanyeEntity> wrapper);

}