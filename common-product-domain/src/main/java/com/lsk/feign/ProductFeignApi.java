package com.lsk.feign;

import com.lsk.domain.Products;
import com.lsk.hystrix.FeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="PRODUCT-SERVER",fallback = FeignHystrix.class) //标志openFeign，其中name的值对应product项目yml中的spring applicationName属性
public interface ProductFeignApi {

    //相当于controller的接口
    @RequestMapping("/sell")
    public Products sell(@RequestParam("id") Integer id, @RequestParam("account") Integer account);
}
