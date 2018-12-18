package com.itheima.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.pinyougou.BrandService;
import com.itheima.pinyougou.mapper.TbBrandMapper;
import com.itheima.pinyougou.pojo.TbBrand;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: WH
 * @Date: 2018/12/17 16:52
 * @Project: pinyougou-parent
 * @Package: com.itheima.pinyougou.sellergoods.service.impl
 * @Version 1.0
 */
@Service
public class BrandServiceImpl implements BrandService {
  @Autowired
  private TbBrandMapper tbBrandMapper;
  @Override
  public List<TbBrand> findAll() {
    return tbBrandMapper.selectByExample(null);
  }
}
