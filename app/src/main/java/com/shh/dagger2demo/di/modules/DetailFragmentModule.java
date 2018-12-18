package com.shh.dagger2demo.di.modules;

import android.support.v4.app.Fragment;

import com.shh.dagger2demo.DetailFragment;
import com.shh.dagger2demo.di.components.DetailFragmentSubcomponent;
import com.shh.dagger2demo.models.BookBean;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {DetailFragmentSubcomponent.class})
public abstract class DetailFragmentModule {
    @Binds
    @IntoMap
    @FragmentKey(DetailFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment>
    bindDetailFragmentInjectorFactory(DetailFragmentSubcomponent.Builder builder);

    @Provides
    static BookBean provideBook() {
        return new BookBean("Kotlin 指南", 55.5f);
    }
}
