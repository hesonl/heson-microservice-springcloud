package com.heson.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.heson.microservice.pojo.Order;
import com.heson.microservice.service.OrderService;

@RestController
public class OrderController {
    
    @Autowired
    private OrderService orderService;
    
    @GetMapping(value = "order/{id}")
    public Order queryOrderById(@PathVariable("id") String id){
        return this.orderService.queryOrderById(id);
    }
}
