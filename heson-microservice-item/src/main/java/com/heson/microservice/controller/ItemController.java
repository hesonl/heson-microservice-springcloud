package com.heson.microservice.controller;

import java.awt.ItemSelectable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.heson.microservice.pojo.Item;
import com.heson.microservice.service.ItemService;

@RestController
public class ItemController {
    
    @Autowired
    private ItemService itemService;
    
    @GetMapping(value = "item/{id}")
    public Item queryItemById(@PathVariable("id") Long id){
        return this.itemService.queryItemById(id);
    }
}
