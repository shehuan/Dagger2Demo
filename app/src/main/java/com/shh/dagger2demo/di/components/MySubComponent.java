package com.shh.dagger2demo.di.components;

import com.shh.dagger2demo.SubActivity;
import com.shh.dagger2demo.di.modules.SubModule;

import dagger.Subcomponent;

@Subcomponent(modules = {SubModule.class})
public interface MySubComponent {
    void inject(SubActivity activity);
}
