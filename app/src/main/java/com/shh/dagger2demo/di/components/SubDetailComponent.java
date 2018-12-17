package com.shh.dagger2demo.di.components;

import com.shh.dagger2demo.SubDetailActivity;
import com.shh.dagger2demo.di.modules.DetailModule;
import com.shh.dagger2demo.di.scopes.LocalScope;

import dagger.Subcomponent;

@LocalScope
@Subcomponent(modules = {DetailModule.class})
public interface SubDetailComponent {
    void inject(SubDetailActivity activity);
}
