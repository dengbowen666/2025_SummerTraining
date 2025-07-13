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

import com.entity.JixiaoxinchouEntity;
import com.entity.view.JixiaoxinchouView;

import com.service.JixiaoxinchouService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 绩效薪酬
 * 后端接口
 * @author 
 * @email 
 * @date
 */
@RestController
@RequestMapping("/jixiaoxinchou")
public class JixiaoxinchouController {
    @Autowired
    private JixiaoxinchouService jixiaoxinchouService;


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JixiaoxinchouEntity jixiaoxinchou, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			jixiaoxinchou.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonggongbumen")) {
			jixiaoxinchou.setBumenbianhao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JixiaoxinchouEntity> ew = new EntityWrapper<JixiaoxinchouEntity>();

    	PageUtils page = jixiaoxinchouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jixiaoxinchou), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JixiaoxinchouEntity jixiaoxinchou, 
		HttpServletRequest request){
        EntityWrapper<JixiaoxinchouEntity> ew = new EntityWrapper<JixiaoxinchouEntity>();

    	PageUtils page = jixiaoxinchouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jixiaoxinchou), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JixiaoxinchouEntity jixiaoxinchou){
       	EntityWrapper<JixiaoxinchouEntity> ew = new EntityWrapper<JixiaoxinchouEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jixiaoxinchou, "jixiaoxinchou")); 
        return R.ok().put("data", jixiaoxinchouService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JixiaoxinchouEntity jixiaoxinchou){
        EntityWrapper< JixiaoxinchouEntity> ew = new EntityWrapper< JixiaoxinchouEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jixiaoxinchou, "jixiaoxinchou")); 
		JixiaoxinchouView jixiaoxinchouView =  jixiaoxinchouService.selectView(ew);
		return R.ok("查询绩效薪酬成功").put("data", jixiaoxinchouView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JixiaoxinchouEntity jixiaoxinchou = jixiaoxinchouService.selectById(id);
        return R.ok().put("data", jixiaoxinchou);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JixiaoxinchouEntity jixiaoxinchou = jixiaoxinchouService.selectById(id);
        return R.ok().put("data", jixiaoxinchou);
    }


    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JixiaoxinchouEntity jixiaoxinchou, HttpServletRequest request){
    	jixiaoxinchou.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jixiaoxinchou);

        jixiaoxinchouService.insert(jixiaoxinchou);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JixiaoxinchouEntity jixiaoxinchou, HttpServletRequest request){
    	jixiaoxinchou.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jixiaoxinchou);

        jixiaoxinchouService.insert(jixiaoxinchou);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JixiaoxinchouEntity jixiaoxinchou, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jixiaoxinchou);
        jixiaoxinchouService.updateById(jixiaoxinchou);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jixiaoxinchouService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<JixiaoxinchouEntity> wrapper = new EntityWrapper<JixiaoxinchouEntity>();
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

		int count = jixiaoxinchouService.selectCount(wrapper);
		return R.ok().put("count", count);
	}

}