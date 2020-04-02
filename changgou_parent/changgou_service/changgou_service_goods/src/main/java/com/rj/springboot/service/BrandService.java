package com.rj.springboot.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.rj.springboot.entity.Brand;

import java.util.List;
import java.util.Map;

/**
 * @Author: rj
 * @Date: 2020-04-02 11:39
 * @Version: 1.0
 */
public interface BrandService {
    public List<Brand> findAll();

    public Brand findById(Integer id);

    public void add(Brand brand);

    public void update(Brand brand);

    public void delete(Integer id);

    public List<Brand> findList(Map<String,Object> searchMap);

    public PageInfo<Brand> findPage(int page, int size);

    public PageInfo<Brand> findPage(Map<String, Object> searchMap, int page, int size);

}