package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.GangweiluyongEntity;
import com.entity.view.GangweiluyongView;

import com.service.GangweiluyongService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 岗位录用
 * 后端接口
 * @author 
 * @email 
 * @date
 */
@RestController
@RequestMapping("/gangweiluyong")
public class GangweiluyongController {
    @Autowired
    private GangweiluyongService gangweiluyongService;

    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GangweiluyongEntity gangweiluyong, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			gangweiluyong.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonggongbumen")) {
			gangweiluyong.setBumenbianhao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GangweiluyongEntity> ew = new EntityWrapper<GangweiluyongEntity>();

    	PageUtils page = gangweiluyongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gangweiluyong), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GangweiluyongEntity gangweiluyong, 
		HttpServletRequest request){
        EntityWrapper<GangweiluyongEntity> ew = new EntityWrapper<GangweiluyongEntity>();

    	PageUtils page = gangweiluyongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gangweiluyong), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GangweiluyongEntity gangweiluyong){
       	EntityWrapper<GangweiluyongEntity> ew = new EntityWrapper<GangweiluyongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( gangweiluyong, "gangweiluyong")); 
        return R.ok().put("data", gangweiluyongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GangweiluyongEntity gangweiluyong){
        EntityWrapper< GangweiluyongEntity> ew = new EntityWrapper< GangweiluyongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( gangweiluyong, "gangweiluyong")); 
		GangweiluyongView gangweiluyongView =  gangweiluyongService.selectView(ew);
		return R.ok("查询岗位录用成功").put("data", gangweiluyongView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GangweiluyongEntity gangweiluyong = gangweiluyongService.selectById(id);
        return R.ok().put("data", gangweiluyong);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GangweiluyongEntity gangweiluyong = gangweiluyongService.selectById(id);
        return R.ok().put("data", gangweiluyong);
    }


    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GangweiluyongEntity gangweiluyong, HttpServletRequest request){
    	gangweiluyong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gangweiluyong);

        gangweiluyongService.insert(gangweiluyong);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GangweiluyongEntity gangweiluyong, HttpServletRequest request){
    	gangweiluyong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gangweiluyong);

        gangweiluyongService.insert(gangweiluyong);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody GangweiluyongEntity gangweiluyong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(gangweiluyong);
        gangweiluyongService.updateById(gangweiluyong);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        gangweiluyongService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<GangweiluyongEntity> wrapper = new EntityWrapper<GangweiluyongEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonggongbumen")) {
			wrapper.eq("bumenbianhao", (String)request.getSession().getAttribute("username"));
		}

		int count = gangweiluyongService.selectCount(wrapper);
		return R.ok().put("count", count);
	}


    /**
     * （按值统计）
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}")
    public R value(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        EntityWrapper<GangweiluyongEntity> ew = new EntityWrapper<GangweiluyongEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("xuesheng")) {
            ew.eq("xuehao", (String)request.getSession().getAttribute("username"));
        }
        if(tableName.equals("yonggongbumen")) {
            ew.eq("bumenbianhao", (String)request.getSession().getAttribute("username"));
        }
        List<Map<String, Object>> result = gangweiluyongService.selectValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * （按值统计）时间统计类型
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}/{timeStatType}")
    public R valueDay(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        params.put("timeStatType", timeStatType);
        EntityWrapper<GangweiluyongEntity> ew = new EntityWrapper<GangweiluyongEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("xuesheng")) {
            ew.eq("xuehao", (String)request.getSession().getAttribute("username"));
        }
        if(tableName.equals("yonggongbumen")) {
            ew.eq("bumenbianhao", (String)request.getSession().getAttribute("username"));
        }
        List<Map<String, Object>> result = gangweiluyongService.selectTimeStatValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }
    
    /**
     * 分组统计
     */
    @RequestMapping("/group/{columnName}")
    public R group(@PathVariable("columnName") String columnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("column", columnName);
        EntityWrapper<GangweiluyongEntity> ew = new EntityWrapper<GangweiluyongEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("xuesheng")) {
            ew.eq("xuehao", (String)request.getSession().getAttribute("username"));
        }
        if(tableName.equals("yonggongbumen")) {
            ew.eq("bumenbianhao", (String)request.getSession().getAttribute("username"));
        }
        List<Map<String, Object>> result = gangweiluyongService.selectGroup(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }
}