package com.shh.dagger2demo.di.components;

import com.shh.dagger2demo.App;
import com.shh.dagger2demo.di.modules.DetailFragmentModule;
import com.shh.dagger2demo.di.modules.MainActivityModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        MainActivityModule.class,
        DetailFragmentModule.class
})
public interface AppComponent {
    void inject(App app);
}
