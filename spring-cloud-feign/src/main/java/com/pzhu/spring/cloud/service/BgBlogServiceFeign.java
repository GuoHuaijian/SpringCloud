package com.pzhu.spring.cloud.service;

import com.pzhu.spring.cloud.domain.BgBlog;
import com.pzhu.spring.cloud.service.hystrix.BgBlogServiceFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Author Guo Huaijian
 * @Date 2020/3/15 16:18
 */
@FeignClient(value = "spring-cloud-provider",fallback = BgBlogServiceFeignHystrix.class)
public interface BgBlogServiceFeign {

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    @GetMapping("/list")
    List<BgBlog> selectList();
}
