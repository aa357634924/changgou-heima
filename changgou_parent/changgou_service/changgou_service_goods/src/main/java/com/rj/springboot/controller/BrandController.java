package com.rj.springboot.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.rj.springboot.entitiy.PageResult;
import com.rj.springboot.entitiy.Result;
import com.rj.springboot.entitiy.StatusCode;
import com.rj.springboot.entity.Brand;
import com.rj.springboot.handler.BaseExceptionHandler;
import com.rj.springboot.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Author: rj
 * @Date: 2020-04-02 11:43
 * @Version: 1.0
 */
@RestController
@RequestMapping("/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @GetMapping("/findAll")
    public Result findAll() {
        List<Brand> brandList = brandService.findAll();
        return new Result(true, StatusCode.OK, "查询成功", brandList);
    }

    @GetMapping("/{id}")
    public Result findById(@PathVariable Integer id) {
        Brand brand = brandService.findById(id);
        return new Result(true, StatusCode.OK, "查询成功", brand);
    }

    @PostMapping("/add")
    public Result add(@RequestBody Brand brand) {
        brandService.add(brand);
        return new Result(true, StatusCode.OK, "添加成功");
    }

    @PutMapping(value = "/{id}")
    public Result update(@RequestBody Brand brand, @PathVariable Integer id) {
        brand.setId(id);
        brandService.update(brand);
        return new Result(true, StatusCode.OK, "修改成功");
    }

    @DeleteMapping(value = "/{id}")
    public Result delete(@PathVariable Integer id) {
        brandService.delete(id);
        return new Result(true, StatusCode.OK, "删除成功");
    }
    /**
     * @Author: rj
     * @Date: 2020-04-02
     * @Description: 条件 查询
     * @Param:
     * @Return:
     * @Version 1.0
     */
    @GetMapping(value = "/search")
    public Result findList(@RequestParam Map searchMap) {
        List<Brand> list = brandService.findList(searchMap);
        return new Result(true, StatusCode.OK, "查询成功", list);
    }

    /**
     * @Author: rj
     * @Date: 2020-04-02
     * @Description: 分页查询
     * @Param:
     * @Return:
     * @Version 1.0
     */
    @GetMapping(value = "/search/{page}/{size}")
    public Result<PageInfo<Brand>> findPage(@PathVariable int page, @PathVariable int size) {
        PageInfo<Brand> pageInfo = brandService.findPage(page, size);
        return new Result<PageInfo<Brand>>(true, StatusCode.OK, "查询成功", pageInfo);
    }
    /**
     * @Author: rj
     * @Date: 2020-04-02
     * @Description:  分页+搜索 查询
     * @Param:
     * @Return:
     * @Version 1.0
     */
    @PostMapping(value = "/searchPlus/{page}/{size}")
    public Result<PageInfo<Brand>> findPage(@RequestParam Map searchMap, @PathVariable int page, @PathVariable int size) {

        PageInfo<Brand> pageInfo = brandService.findPage(searchMap,page, size);
        return new Result<PageInfo<Brand>>(true, StatusCode.OK, "查询成功", pageInfo);
    }
}
