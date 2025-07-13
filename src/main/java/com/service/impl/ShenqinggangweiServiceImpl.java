package com.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dao.ShenqinggangweiDao;
import com.entity.ShenqinggangweiEntity;
import com.entity.view.ShenqinggangweiView;
import com.entity.vo.ShenqinggangweiVO;
import com.service.ShenqinggangweiService;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("shenqinggangweiService")
public class ShenqinggangweiServiceImpl extends ServiceImpl<ShenqinggangweiDao, ShenqinggangweiEntity> implements ShenqinggangweiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenqinggangweiEntity> page = this.selectPage(
                new Query<ShenqinggangweiEntity>(params).getPage(),
                new EntityWrapper<ShenqinggangweiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenqinggangweiEntity> wrapper) {
		  Page<ShenqinggangweiView> page =new Query<ShenqinggangweiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenqinggangweiVO> selectListVO(Wrapper<ShenqinggangweiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenqinggangweiVO selectVO(Wrapper<ShenqinggangweiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenqinggangweiView> selectListView(Wrapper<ShenqinggangweiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenqinggangweiView selectView(Wrapper<ShenqinggangweiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ShenqinggangweiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ShenqinggangweiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }
    
    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ShenqinggangweiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}