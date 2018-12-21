package com.shh.dagger2demo.di.modules;

import com.shh.dagger2demo.di.qulifiers.QualifierBlue;
import com.shh.dagger2demo.models.Book;
import com.shh.dagger2demo.models.Flower;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    @Named("red")
    @Provides
    public Flower provideRedRose() {
        return new Flower("玫瑰", "红色");
    }

    @Named("white")
    @Provides
    public Flower provideWhiteRose() {
        return new Flower("玫瑰", "白色");
    }

    @QualifierBlue
    @Provides
    public Flower provideBlueRose() {
        return new Flower("玫瑰", "蓝色");
    }

//    @Named("book1")
//    @Provides
//    public Book provideBook1() {
//        return new Book("大话设计模式", 50f);
//    }
//
//    @Named("book2")
//    @Provides
//    public Book provideBook2() {
//        return new Book("图解算法", 30f);
//    }
}
