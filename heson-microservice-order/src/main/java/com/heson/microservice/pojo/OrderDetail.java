package com.heson.microservice.pojo;


public class OrderDetail {
    
    private String orderId;
    
    private Item item = new Item();
    
    public OrderDetail() {
        super();
    }
    public OrderDetail(String orderId, Item item) {
        super();
        this.orderId = orderId;
        this.item = item;
    }
    
    public String getOrderId() {
        return orderId;
    }
    
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    
    public Item getItem() {
        return item;
    }
    
    public void setItem(Item item) {
        this.item = item;
    }
    public String toString() {
        return "OrderDetail [orderId=" + orderId + "]";
    }
    
    
}
