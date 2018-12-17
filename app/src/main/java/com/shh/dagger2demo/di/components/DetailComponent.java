package com.shh.dagger2demo.di.components;

import com.shh.dagger2demo.DetailActivity;
import com.shh.dagger2demo.di.modules.DetailModule;
import com.shh.dagger2demo.di.scopes.LocalScope;

import dagger.Component;

@LocalScope
@Component(modules = {DetailModule.class}, dependencies = {CommonComponent.class})
public interface DetailComponent {
    void inject(DetailActivity activity);
}
