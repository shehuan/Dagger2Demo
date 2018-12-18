package com.shh.dagger2demo.di.modules;

import com.shh.dagger2demo.di.scopes.LocalScope;
import com.shh.dagger2demo.models.BookBean;

import dagger.Module;
import dagger.Provides;

@Module
public class DetailModule {

    @LocalScope
    @Provides
    public BookBean provideBook() {
        return new BookBean("Kotlin 指南", 66.8f);
    }
}
