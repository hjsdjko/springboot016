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

import com.entity.KebiaoxinixEntity;
import com.entity.view.KebiaoxinixView;

import com.service.KebiaoxinixService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 课表信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-21 16:43:31
 */
@RestController
@RequestMapping("/kebiaoxinix")
public class KebiaoxinixController {
    @Autowired
    private KebiaoxinixService kebiaoxinixService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KebiaoxinixEntity kebiaoxinix,
		HttpServletRequest request){
        EntityWrapper<KebiaoxinixEntity> ew = new EntityWrapper<KebiaoxinixEntity>();

		PageUtils page = kebiaoxinixService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kebiaoxinix), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KebiaoxinixEntity kebiaoxinix, 
		HttpServletRequest request){
        EntityWrapper<KebiaoxinixEntity> ew = new EntityWrapper<KebiaoxinixEntity>();

		PageUtils page = kebiaoxinixService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kebiaoxinix), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KebiaoxinixEntity kebiaoxinix){
       	EntityWrapper<KebiaoxinixEntity> ew = new EntityWrapper<KebiaoxinixEntity>();
      	ew.allEq(MPUtil.allEQMapPre( kebiaoxinix, "kebiaoxinix")); 
        return R.ok().put("data", kebiaoxinixService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KebiaoxinixEntity kebiaoxinix){
        EntityWrapper< KebiaoxinixEntity> ew = new EntityWrapper< KebiaoxinixEntity>();
 		ew.allEq(MPUtil.allEQMapPre( kebiaoxinix, "kebiaoxinix")); 
		KebiaoxinixView kebiaoxinixView =  kebiaoxinixService.selectView(ew);
		return R.ok("查询课表信息成功").put("data", kebiaoxinixView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KebiaoxinixEntity kebiaoxinix = kebiaoxinixService.selectById(id);
        return R.ok().put("data", kebiaoxinix);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KebiaoxinixEntity kebiaoxinix = kebiaoxinixService.selectById(id);
        return R.ok().put("data", kebiaoxinix);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KebiaoxinixEntity kebiaoxinix, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(kebiaoxinix);
        kebiaoxinixService.insert(kebiaoxinix);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KebiaoxinixEntity kebiaoxinix, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(kebiaoxinix);
        kebiaoxinixService.insert(kebiaoxinix);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody KebiaoxinixEntity kebiaoxinix, HttpServletRequest request){
        //ValidatorUtils.validateEntity(kebiaoxinix);
        kebiaoxinixService.updateById(kebiaoxinix);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        kebiaoxinixService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
