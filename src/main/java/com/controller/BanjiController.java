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

import com.entity.BanjiEntity;
import com.entity.view.BanjiView;

import com.service.BanjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 班级
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-21 16:43:31
 */
@RestController
@RequestMapping("/banji")
public class BanjiController {
    @Autowired
    private BanjiService banjiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BanjiEntity banji,
		HttpServletRequest request){
        EntityWrapper<BanjiEntity> ew = new EntityWrapper<BanjiEntity>();

		PageUtils page = banjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, banji), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BanjiEntity banji, 
		HttpServletRequest request){
        EntityWrapper<BanjiEntity> ew = new EntityWrapper<BanjiEntity>();

		PageUtils page = banjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, banji), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BanjiEntity banji){
       	EntityWrapper<BanjiEntity> ew = new EntityWrapper<BanjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( banji, "banji")); 
        return R.ok().put("data", banjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BanjiEntity banji){
        EntityWrapper< BanjiEntity> ew = new EntityWrapper< BanjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( banji, "banji")); 
		BanjiView banjiView =  banjiService.selectView(ew);
		return R.ok("查询班级成功").put("data", banjiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BanjiEntity banji = banjiService.selectById(id);
        return R.ok().put("data", banji);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BanjiEntity banji = banjiService.selectById(id);
        return R.ok().put("data", banji);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BanjiEntity banji, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(banji);
        banjiService.insert(banji);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BanjiEntity banji, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(banji);
        banjiService.insert(banji);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody BanjiEntity banji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(banji);
        banjiService.updateById(banji);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        banjiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
