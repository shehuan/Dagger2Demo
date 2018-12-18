package com.shh.dagger2demo.models;

public class BookBean {
    private String name;
    private float price;

    public BookBean(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookBean{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
