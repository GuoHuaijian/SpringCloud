package com.pzhu.spring.cloud.service.hystrix;

import com.pzhu.spring.cloud.domain.BgBlog;
import com.pzhu.spring.cloud.service.BgBlogServiceFeign;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * BgBlogServiceFeign的熔断器
 * @Author Guo Huaijian
 * @Date 2020/3/15 18:05
 */
@Component
public class BgBlogServiceFeignHystrix implements BgBlogServiceFeign {
    @Override
    public List<BgBlog> selectList() {
        ArrayList list = new ArrayList<BgBlog>();
        BgBlog blog = new BgBlog();
        blog.setTitle("hello Hystrix");
        list.add(blog);
        return list;
    }
}
