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


import com.dao.YonggongbumenDao;
import com.entity.YonggongbumenEntity;
import com.service.YonggongbumenService;
import com.entity.vo.YonggongbumenVO;
import com.entity.view.YonggongbumenView;

@Service("yonggongbumenService")
public class YonggongbumenServiceImpl extends ServiceImpl<YonggongbumenDao, YonggongbumenEntity> implements YonggongbumenService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonggongbumenEntity> page = this.selectPage(
                new Query<YonggongbumenEntity>(params).getPage(),
                new EntityWrapper<YonggongbumenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonggongbumenEntity> wrapper) {
		  Page<YonggongbumenView> page =new Query<YonggongbumenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonggongbumenVO> selectListVO(Wrapper<YonggongbumenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonggongbumenVO selectVO(Wrapper<YonggongbumenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonggongbumenView> selectListView(Wrapper<YonggongbumenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonggongbumenView selectView(Wrapper<YonggongbumenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}