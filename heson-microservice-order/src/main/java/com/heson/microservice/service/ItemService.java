package com.heson.microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.heson.microservice.feign.ItemFeignClient;
import com.heson.microservice.pojo.Item;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ItemService {
    
    @Autowired
    private RestTemplate restTemplate;
    
    @Autowired
    private ItemFeignClient itemFeignClient;
    
    @HystrixCommand(fallbackMethod = "queryItemByIdFallBackMethod")
    public Item queryItemById(Long id){
       return this.itemFeignClient.queryItemByid(id);
    }
   /* @HystrixCommand(fallbackMethod = "queryItemByIdFallBackMethod")
    public Item queryItemById(Long id){
        String serviceId="heson-microservice-item";
       return this.restTemplate.getForObject("http://" + serviceId + "/item/"+id, Item.class);
    }*/
    
    public Item queryItemByIdFallBackMethod(Long id) {
        return new Item(id,"查询商品信息出错",null,null,null);
    }
}
