package com.lsk.feign;

import com.lsk.domain.Products;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="PRODUCT-SERVER")
public interface ProductFeignApi {

    @RequestMapping("/sell")
    public Products sell(@RequestParam("id") Integer id, @RequestParam("account") Integer account);
}
