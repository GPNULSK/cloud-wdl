package com.lsk.hystrix;

import com.lsk.domain.Products;
import com.lsk.feign.ProductFeignApi;
import org.springframework.stereotype.Component;

@Component
public class FeignHystrix implements ProductFeignApi {
    @Override
    public Products sell(Integer id, Integer account) {
        System.out.println("兜底数据");
        return new Products();
    }
}
