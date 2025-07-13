package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.JixiaoxinchouEntity;
import com.entity.view.JixiaoxinchouView;
import com.entity.vo.JixiaoxinchouVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 绩效薪酬
 * 
 * @author 
 * @email 
 * @date
 */
public interface JixiaoxinchouDao extends BaseMapper<JixiaoxinchouEntity> {

	List<JixiaoxinchouVO> selectListVO(@Param("ew") Wrapper<JixiaoxinchouEntity> wrapper);

	JixiaoxinchouVO selectVO(@Param("ew") Wrapper<JixiaoxinchouEntity> wrapper);

	List<JixiaoxinchouView> selectListView(@Param("ew") Wrapper<JixiaoxinchouEntity> wrapper);

	List<JixiaoxinchouView> selectListView(Pagination page, @Param("ew") Wrapper<JixiaoxinchouEntity> wrapper);

	JixiaoxinchouView selectView(@Param("ew") Wrapper<JixiaoxinchouEntity> wrapper);

}