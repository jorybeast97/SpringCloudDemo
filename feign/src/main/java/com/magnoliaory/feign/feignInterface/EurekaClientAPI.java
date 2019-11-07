package com.magnoliaory.feign.feignInterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client")
public interface EurekaClientAPI {

    @GetMapping("/dc")
    String useApi();
}
