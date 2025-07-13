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


import com.dao.MianshijiluDao;
import com.entity.MianshijiluEntity;
import com.service.MianshijiluService;
import com.entity.vo.MianshijiluVO;
import com.entity.view.MianshijiluView;

@Service("mianshijiluService")
public class MianshijiluServiceImpl extends ServiceImpl<MianshijiluDao, MianshijiluEntity> implements MianshijiluService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MianshijiluEntity> page = this.selectPage(
                new Query<MianshijiluEntity>(params).getPage(),
                new EntityWrapper<MianshijiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MianshijiluEntity> wrapper) {
		  Page<MianshijiluView> page =new Query<MianshijiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MianshijiluVO> selectListVO(Wrapper<MianshijiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MianshijiluVO selectVO(Wrapper<MianshijiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MianshijiluView> selectListView(Wrapper<MianshijiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MianshijiluView selectView(Wrapper<MianshijiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<MianshijiluEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<MianshijiluEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }
    
    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<MianshijiluEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}