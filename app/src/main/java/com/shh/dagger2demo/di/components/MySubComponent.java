package com.shh.dagger2demo.di.components;

import com.shh.dagger2demo.SubActivity;
import com.shh.dagger2demo.di.modules.SubModule;
import com.shh.dagger2demo.di.scopes.CommonScope;

import dagger.Subcomponent;

@CommonScope
@Subcomponent(modules = {SubModule.class})
public interface MySubComponent {
    void inject(SubActivity activity);
}
