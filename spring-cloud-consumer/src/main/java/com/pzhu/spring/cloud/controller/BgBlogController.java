package com.pzhu.spring.cloud.controller;

import com.pzhu.spring.cloud.domain.BgBlog;
import com.pzhu.spring.cloud.service.BgBlogServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Guo Huaijian
 * @Date 2020/3/15 17:42
 */
@RestController
public class BgBlogController {

    @Autowired
    private BgBlogServiceFeign serviceFeign;

    /**
     * 获取列表
     * @return
     */
    @GetMapping("list")
    public List<BgBlog> list(){
        return serviceFeign.selectList();
    }
}
