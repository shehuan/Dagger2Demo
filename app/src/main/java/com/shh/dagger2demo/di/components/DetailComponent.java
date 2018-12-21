package com.shh.dagger2demo.di.components;

import com.shh.dagger2demo.DetailActivity;
import com.shh.dagger2demo.di.modules.DetailModule;
import com.shh.dagger2demo.di.modules.SubModule;
import com.shh.dagger2demo.di.scopes.DetailActivityScope;

import dagger.Component;

@DetailActivityScope
@Component(modules = {DetailModule.class})
public interface DetailComponent {
    void inject(DetailActivity activity);

    // 定义返回子组件的方法，参数为子组件需要的module
    MySubComponent getSubComponent(SubModule module);
}
