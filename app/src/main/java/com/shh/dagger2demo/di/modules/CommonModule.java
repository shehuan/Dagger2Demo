package com.shh.dagger2demo.di.modules;

import com.shh.dagger2demo.models.Book;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CommonModule {
    @Singleton
    @Provides
    public Book provideBook() {
        return new Book("Flutter 指南", 68.8f);
    }
}
