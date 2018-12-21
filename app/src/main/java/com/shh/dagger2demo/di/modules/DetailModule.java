package com.shh.dagger2demo.di.modules;

import com.shh.dagger2demo.di.scopes.DetailActivityScope;
import com.shh.dagger2demo.models.Book;

import dagger.Module;
import dagger.Provides;

@Module
public class DetailModule {

    @DetailActivityScope
    @Provides
    public Book provideBook() {
        return new Book("Kotlin 指南", 66.8f);
    }
}
