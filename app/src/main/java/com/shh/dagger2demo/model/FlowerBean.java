package com.shh.dagger2demo.model;

public class FlowerBean {
    private String name;
    private String color;

    public FlowerBean(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "FlowerBean{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
