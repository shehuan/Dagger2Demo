package com.shh.dagger2demo.di.components;

import com.shh.dagger2demo.di.modules.CommonModule;
import com.shh.dagger2demo.di.modules.DetailModule;
import com.shh.dagger2demo.models.UserBean;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {CommonModule.class})
public interface CommonComponent {
    UserBean provideUser();

    // 定义返回子组件的方法，参数为子组件需要的module
    SubDetailComponent getSubDetailComponent(DetailModule module);
}
