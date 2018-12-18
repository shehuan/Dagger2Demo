package com.shh.dagger2demo.di.modules;

import android.app.Activity;

import com.shh.dagger2demo.MainActivity;
import com.shh.dagger2demo.di.components.MainActivitySubcomponent;
import com.shh.dagger2demo.models.FlowerBean;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {MainActivitySubcomponent.class})
public abstract class MainActivityModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    bindMainActivityInjectorFactory(MainActivitySubcomponent.Builder builder);

    @Provides
    static FlowerBean provideFlower() {
        return new FlowerBean("rose", "red");
    }
}
