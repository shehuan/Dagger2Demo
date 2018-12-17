package com.shh.dagger2demo.di.modules;

import com.shh.dagger2demo.di.qulifiers.QualifierRed;
import com.shh.dagger2demo.model.BookBean;
import com.shh.dagger2demo.model.FlowerBean;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    @Provides
    public FlowerBean provideBlueFlower() {
        return new FlowerBean("rose", "blue");
    }

    @QualifierRed
    @Provides
    public FlowerBean provideRedFlower() {
        return new FlowerBean("rose", "red");
    }

    @Named("white")
    @Provides
    public FlowerBean provideWhiteFlower() {
        return new FlowerBean("rose", "white");
    }

    @Named("book1")
    @Provides
    public BookBean provideBook1() {
        return new BookBean("大话设计模式", 50f);
    }

    @Named("book2")
    @Provides
    public BookBean provideBook2() {
        return new BookBean("图解算法", 30f);
    }
}
