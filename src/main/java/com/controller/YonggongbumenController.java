package com.controller;

import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.YonggongbumenEntity;
import com.entity.view.YonggongbumenView;
import com.service.TokenService;
import com.service.YonggongbumenService;
import com.utils.MPUtil;
import com.utils.PageUtils;
import com.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/**
 * 用工部门
 * 后端接口
 * @author 
 * @email 
 * @date
 */
@RestController
@RequestMapping("/yonggongbumen")
public class YonggongbumenController {
    @Autowired
    private YonggongbumenService yonggongbumenService;


	@Autowired
	private TokenService tokenService;

	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		YonggongbumenEntity user = yonggongbumenService.selectOne(new EntityWrapper<YonggongbumenEntity>().eq("bumenbianhao", username));
		if(user==null || !user.getMima().equals(password)) {
			return R.error("账号或密码不正确");
		}
		String token = tokenService.generateToken(user.getId(), username,"yonggongbumen",  "用工部门" );
		return R.ok().put("token", token);
	}

	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody YonggongbumenEntity yonggongbumen){
    	//ValidatorUtils.validateEntity(yonggongbumen);
    	YonggongbumenEntity user = yonggongbumenService.selectOne(new EntityWrapper<YonggongbumenEntity>().eq("bumenbianhao", yonggongbumen.getBumenbianhao()));
		if(user!=null) {
			return R.error("注册用户已存在");
		}
		Long uId = new Date().getTime();
		yonggongbumen.setId(uId);
        yonggongbumenService.insert(yonggongbumen);
        return R.ok();
    }


	/**
	 * 退出
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}

	/**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        YonggongbumenEntity user = yonggongbumenService.selectById(id);
        return R.ok().put("data", user);
    }

    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	YonggongbumenEntity user = yonggongbumenService.selectOne(new EntityWrapper<YonggongbumenEntity>().eq("bumenbianhao", username));
    	if(user==null) {
    		return R.error("账号不存在");
    	}
        user.setMima("123456");
        yonggongbumenService.updateById(user);
        return R.ok("密码已重置为：123456");
    }


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YonggongbumenEntity yonggongbumen,
		HttpServletRequest request){

        EntityWrapper<YonggongbumenEntity> ew = new EntityWrapper<YonggongbumenEntity>();

    	PageUtils page = yonggongbumenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yonggongbumen), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YonggongbumenEntity yonggongbumen,
		HttpServletRequest request){
        EntityWrapper<YonggongbumenEntity> ew = new EntityWrapper<YonggongbumenEntity>();

    	PageUtils page = yonggongbumenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yonggongbumen), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YonggongbumenEntity yonggongbumen){
       	EntityWrapper<YonggongbumenEntity> ew = new EntityWrapper<YonggongbumenEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yonggongbumen, "yonggongbumen"));
        return R.ok().put("data", yonggongbumenService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YonggongbumenEntity yonggongbumen){
        EntityWrapper< YonggongbumenEntity> ew = new EntityWrapper< YonggongbumenEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yonggongbumen, "yonggongbumen"));
		YonggongbumenView yonggongbumenView =  yonggongbumenService.selectView(ew);
		return R.ok("查询用工部门成功").put("data", yonggongbumenView);
    }

    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YonggongbumenEntity yonggongbumen = yonggongbumenService.selectById(id);
        return R.ok().put("data", yonggongbumen);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YonggongbumenEntity yonggongbumen = yonggongbumenService.selectById(id);
        return R.ok().put("data", yonggongbumen);
    }


    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YonggongbumenEntity yonggongbumen, HttpServletRequest request){
    	yonggongbumen.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yonggongbumen);
    	YonggongbumenEntity user = yonggongbumenService.selectOne(new EntityWrapper<YonggongbumenEntity>().eq("bumenbianhao", yonggongbumen.getBumenbianhao()));
		if(user!=null) {
			return R.error("用户已存在");
		}

		yonggongbumen.setId(new Date().getTime());
        yonggongbumenService.insert(yonggongbumen);
        return R.ok();
    }

    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YonggongbumenEntity yonggongbumen, HttpServletRequest request){
    	yonggongbumen.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yonggongbumen);
    	YonggongbumenEntity user = yonggongbumenService.selectOne(new EntityWrapper<YonggongbumenEntity>().eq("bumenbianhao", yonggongbumen.getBumenbianhao()));
		if(user!=null) {
			return R.error("用户已存在");
		}

		yonggongbumen.setId(new Date().getTime());
        yonggongbumenService.insert(yonggongbumen);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YonggongbumenEntity yonggongbumen, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yonggongbumen);
        yonggongbumenService.updateById(yonggongbumen);//全部更新
        return R.ok();
    }


    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yonggongbumenService.deleteBatchIds(Arrays.asList(ids));
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

		Wrapper<YonggongbumenEntity> wrapper = new EntityWrapper<YonggongbumenEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = yonggongbumenService.selectCount(wrapper);
		return R.ok().put("count", count);
	}

}