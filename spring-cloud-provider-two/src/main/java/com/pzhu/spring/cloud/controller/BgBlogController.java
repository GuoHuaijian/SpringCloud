package com.pzhu.spring.cloud.controller;

import com.pzhu.spring.cloud.domain.BgBlog;
import com.pzhu.spring.cloud.service.BgBlogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 博客(BgBlog)表控制层
 *
 * @author Guo Huaijian
 * @since 2020-03-15 15:30:20
 */
@RestController
public class BgBlogController {
    /**
     * 服务对象
     */
    @Resource
    private BgBlogService bgBlogService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BgBlog selectOne(Integer id) {
        return this.bgBlogService.queryById(id);
    }

    /**
     * 查询列表
     * @return
     */
    @GetMapping("list")
    public List<BgBlog> selectList(){
        System.out.println(2);
        return bgBlogService.queryAllByLimit(1,10);
    }

}
