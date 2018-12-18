package com.itheima.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.pinyougou.BrandService;
import com.itheima.pinyougou.pojo.TbBrand;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @Author: WH
 * @Date: 2018/12/17 16:54
 * @Project: pinyougou-parent
 * @Package: com.itheima.pinyougou.manager.controller
 * @Version 1.0
 */
@RestController
@RequestMapping("/brand")
public class BrandController {

  @Reference
  private BrandService brandService;

  @RequestMapping("/findAll")
  @ResponseBody
  public List<TbBrand> findAll(){
    return brandService.findAll();
  }
}
