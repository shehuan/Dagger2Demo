package com.shh.dagger2demo.models;

import javax.inject.Inject;

public class Cat {
    @Inject
    public Cat() {
    }

    @Override
    public String toString() {
        return "喵星人来了!";
    }
}
