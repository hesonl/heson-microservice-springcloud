package com.heson.microservice.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heson.microservice.pojo.Item;
import com.heson.microservice.pojo.Order;
import com.heson.microservice.pojo.OrderDetail;

@Service
public class OrderService {
    
    private static final Map<String, Order> MAP = new HashMap<String, Order>();
    
    static{
        Order order = new Order();
        order.setCreateDate(new  Date());
        order.setOrderId("8");
        order.setUserId(1L);
        order.setUpdateDate(order.getCreateDate());
        
        List<OrderDetail> orderDetails = new ArrayList<OrderDetail>();
        
        Item item = new Item();
        item.setId(1L);
        orderDetails.add(new OrderDetail(order.getOrderId(),item));
        
        item = new Item();
        item.setId(2L);
        orderDetails.add(new OrderDetail(order.getOrderId(),item));
        
        order.setOrderDetails(orderDetails);
        
        MAP.put(order.getOrderId(), order);
    }
    
    @Autowired
    private ItemService itemService;
    
    public Order queryOrderById(String orderId){
        Order order = MAP.get(orderId);
        if (null == order){
            return null;
        }
        
        List<OrderDetail> orderDetails = order.getOrderDetails();
        for (OrderDetail orderDetail : orderDetails) {
            Item item = this.itemService.queryItemById(orderDetail.getItem()
                    .getId());
            if (null == item){
                continue;
            }
            orderDetail.setItem(item);
        }
        return order;
    }
}
