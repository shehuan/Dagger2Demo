package com.shh.dagger2demo.di.components;

import com.shh.dagger2demo.MainActivity;
import com.shh.dagger2demo.di.modules.MainModule;
import com.shh.dagger2demo.di.scopes.LocalScope;

import dagger.Component;

@LocalScope
@Component(modules = {MainModule.class}, dependencies = {CommonComponent.class})
public interface MainComponent {
    void inject(MainActivity activity);
}
