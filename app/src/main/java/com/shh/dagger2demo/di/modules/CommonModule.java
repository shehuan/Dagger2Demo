package com.shh.dagger2demo.di.modules;

import com.shh.dagger2demo.model.UserBean;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CommonModule {
    @Singleton
    @Provides
    public UserBean provideUser() {
        return new UserBean("张三");
    }
}
