package com.shh.dagger2demo.di.modules;

import com.shh.dagger2demo.models.Flower;

import dagger.Module;
import dagger.Provides;

@Module
public class SubModule {
    @Provides
    public Flower provideFlower() {
        return new Flower("腊梅", "红色");
    }
}
