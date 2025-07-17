package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JixiaoxinchouDao;
import com.entity.JixiaoxinchouEntity;
import com.service.JixiaoxinchouService;
import com.entity.vo.JixiaoxinchouVO;
import com.entity.view.JixiaoxinchouView;

@Service("jixiaoxinchouService")
public class JixiaoxinchouServiceImpl extends ServiceImpl<JixiaoxinchouDao, JixiaoxinchouEntity> implements JixiaoxinchouService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JixiaoxinchouEntity> page = this.selectPage(
                new Query<JixiaoxinchouEntity>(params).getPage(),
                new EntityWrapper<JixiaoxinchouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JixiaoxinchouEntity> wrapper) {
		  Page<JixiaoxinchouView> page =new Query<JixiaoxinchouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JixiaoxinchouVO> selectListVO(Wrapper<JixiaoxinchouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JixiaoxinchouVO selectVO(Wrapper<JixiaoxinchouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JixiaoxinchouView> selectListView(Wrapper<JixiaoxinchouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JixiaoxinchouView selectView(Wrapper<JixiaoxinchouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}