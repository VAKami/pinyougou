package com.itheima.pinyougou;

import com.itheima.pinyougou.pojo.TbBrand;

import java.util.List;

/**
 * @Author: WH
 * @Date: 2018/12/17 16:45
 * @Project: pinyougou-parent
 * @Package: com.itheima.pinyougou
 * @Version 1.0
 */
public interface BrandService {
  public List<TbBrand> findAll();
}