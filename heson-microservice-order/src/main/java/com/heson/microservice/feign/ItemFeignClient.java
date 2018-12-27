package com.heson.microservice.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.heson.microservice.pojo.Item;

@FeignClient(value = "heson-microservice-item")//申明这是一个feign客户端并指明服务id
public interface ItemFeignClient {
    
    @RequestMapping(value="/item/{id}", method=RequestMethod.GET )
    public Item queryItemByid(@PathVariable("id") Long id);
}
