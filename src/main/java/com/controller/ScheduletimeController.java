package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
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

import com.entity.ScheduletimeEntity;
import com.entity.view.ScheduletimeView;

import com.service.ScheduletimeService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 课表时间
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-21 16:43:31
 */
@RestController
@RequestMapping("/scheduletime")
public class ScheduletimeController {
    @Autowired
    private ScheduletimeService scheduletimeService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ScheduletimeEntity scheduletime,
                @RequestParam(required = false) Double sectionnumstart,
                @RequestParam(required = false) Double sectionnumend,
		HttpServletRequest request){
        EntityWrapper<ScheduletimeEntity> ew = new EntityWrapper<ScheduletimeEntity>();
                if(sectionnumstart!=null) ew.ge("sectionnum", sectionnumstart);
                if(sectionnumend!=null) ew.le("sectionnum", sectionnumend);

		PageUtils page = scheduletimeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, scheduletime), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ScheduletimeEntity scheduletime, 
                @RequestParam(required = false) Double sectionnumstart,
                @RequestParam(required = false) Double sectionnumend,
		HttpServletRequest request){
        EntityWrapper<ScheduletimeEntity> ew = new EntityWrapper<ScheduletimeEntity>();
                if(sectionnumstart!=null) ew.ge("sectionnum", sectionnumstart);
                if(sectionnumend!=null) ew.le("sectionnum", sectionnumend);

		PageUtils page = scheduletimeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, scheduletime), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ScheduletimeEntity scheduletime){
       	EntityWrapper<ScheduletimeEntity> ew = new EntityWrapper<ScheduletimeEntity>();
      	ew.allEq(MPUtil.allEQMapPre( scheduletime, "scheduletime")); 
        return R.ok().put("data", scheduletimeService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ScheduletimeEntity scheduletime){
        EntityWrapper< ScheduletimeEntity> ew = new EntityWrapper< ScheduletimeEntity>();
 		ew.allEq(MPUtil.allEQMapPre( scheduletime, "scheduletime")); 
		ScheduletimeView scheduletimeView =  scheduletimeService.selectView(ew);
		return R.ok("查询课表时间成功").put("data", scheduletimeView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ScheduletimeEntity scheduletime = scheduletimeService.selectById(id);
        return R.ok().put("data", scheduletime);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ScheduletimeEntity scheduletime = scheduletimeService.selectById(id);
        return R.ok().put("data", scheduletime);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ScheduletimeEntity scheduletime, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(scheduletime);
        scheduletimeService.insert(scheduletime);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ScheduletimeEntity scheduletime, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(scheduletime);
        scheduletimeService.insert(scheduletime);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ScheduletimeEntity scheduletime, HttpServletRequest request){
        //ValidatorUtils.validateEntity(scheduletime);
        scheduletimeService.updateById(scheduletime);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        scheduletimeService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
