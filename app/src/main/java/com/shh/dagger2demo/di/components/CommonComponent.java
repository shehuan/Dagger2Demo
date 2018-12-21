package com.shh.dagger2demo.di.components;

import com.shh.dagger2demo.di.modules.CommonModule;
import com.shh.dagger2demo.di.modules.SubModule;
import com.shh.dagger2demo.models.Book;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {CommonModule.class})
public interface CommonComponent {
    Book provideBook();

//    MySubComponent getSubComponent(SubModule module);
}
