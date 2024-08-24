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

import com.entity.XuankexinxiEntity;
import com.entity.view.XuankexinxiView;

import com.service.XuankexinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 选课信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-21 16:43:32
 */
@RestController
@RequestMapping("/xuankexinxi")
public class XuankexinxiController {
    @Autowired
    private XuankexinxiService xuankexinxiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XuankexinxiEntity xuankexinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			xuankexinxi.setZhigonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			xuankexinxi.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XuankexinxiEntity> ew = new EntityWrapper<XuankexinxiEntity>();

		PageUtils page = xuankexinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuankexinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XuankexinxiEntity xuankexinxi, 
		HttpServletRequest request){
        EntityWrapper<XuankexinxiEntity> ew = new EntityWrapper<XuankexinxiEntity>();

		PageUtils page = xuankexinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuankexinxi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XuankexinxiEntity xuankexinxi){
       	EntityWrapper<XuankexinxiEntity> ew = new EntityWrapper<XuankexinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xuankexinxi, "xuankexinxi")); 
        return R.ok().put("data", xuankexinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XuankexinxiEntity xuankexinxi){
        EntityWrapper< XuankexinxiEntity> ew = new EntityWrapper< XuankexinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xuankexinxi, "xuankexinxi")); 
		XuankexinxiView xuankexinxiView =  xuankexinxiService.selectView(ew);
		return R.ok("查询选课信息成功").put("data", xuankexinxiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XuankexinxiEntity xuankexinxi = xuankexinxiService.selectById(id);
        return R.ok().put("data", xuankexinxi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XuankexinxiEntity xuankexinxi = xuankexinxiService.selectById(id);
        return R.ok().put("data", xuankexinxi);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XuankexinxiEntity xuankexinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(xuankexinxi);
        xuankexinxiService.insert(xuankexinxi);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XuankexinxiEntity xuankexinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(xuankexinxi);
        xuankexinxiService.insert(xuankexinxi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XuankexinxiEntity xuankexinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xuankexinxi);
        xuankexinxiService.updateById(xuankexinxi);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<XuankexinxiEntity> list = new ArrayList<XuankexinxiEntity>();
        for(Long id : ids) {
            XuankexinxiEntity xuankexinxi = xuankexinxiService.selectById(id);
            xuankexinxi.setSfsh(sfsh);
            xuankexinxi.setShhf(shhf);
            list.add(xuankexinxi);
        }
        xuankexinxiService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xuankexinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
