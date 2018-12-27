package com.heson.microservice.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.heson.microservice.pojo.Item;

@Service
public class ItemService {
    
    private static final Map<Long, Item> MAP = new HashMap<Long, Item>();
    
    static{
        MAP.put(1L,new Item(1L,"商品标题1","http://图片1","图片描述1",1000L));
        MAP.put(2L,new Item(2L,"商品标题2","http://图片2","图片描述2",2000L));
        MAP.put(3L,new Item(3L,"商品标题3","http://图片3","图片描述3",3000L));
        MAP.put(4L,new Item(4L,"商品标题4","http://图片4","图片描述4",4000L));
        MAP.put(5L,new Item(5L,"商品标题5","http://图片5","图片描述5",5000L));
        MAP.put(6L,new Item(6L,"商品标题6","http://图片6","图片描述6",6000L));
    }
    /**
     * 商品查询
     * @param id
     * @return
     */
    public Item queryItemById(Long id) {
        return MAP.get(id);
    }
}
