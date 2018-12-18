package com.shh.dagger2demo.di.components;

import com.shh.dagger2demo.DetailFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {AndroidInjectionModule.class})
public interface DetailFragmentSubcomponent extends AndroidInjector<DetailFragment>{

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DetailFragment> {

    }
}
