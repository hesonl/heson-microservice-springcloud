package com.heson.microservice.pojo;


public class Item {
    
    private Long id;
    
    private String title;
    
    private String pic;
    
    private String desc;
    
    private Long price;
    
    public Item() {
        super();
    }

    public Item(long id, String title, String pic, String desc, long price) {
        super();
        this.id = id;
        this.title = title;
        this.pic = pic;
        this.desc = desc;
        this.price = price;
    }

    
    public String getTitle() {
        return title;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }

    
    public String getPic() {
        return pic;
    }

    
    public void setPic(String pic) {
        this.pic = pic;
    }

    
    public String getDesc() {
        return desc;
    }

    
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }


    
    public long getPrice() {
        return price;
    }


    
    public void setPrice(long price) {
        this.price = price;
    }


    public String toString() {
        return "Item [id=" + id + ", title=" + title + ", pic=" + pic
                + ", desc=" + desc + ", price=" + price + "]";
    }
    
    
}
