package com.shh.dagger2demo.di.modules;

import com.shh.dagger2demo.models.User;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CommonModule {
    @Singleton
    @Provides
    public User provideUser() {
        return new User("张三");
    }
}
