package com.shh.dagger2demo.di.components;

import com.shh.dagger2demo.ShareActivity;
import com.shh.dagger2demo.di.scopes.CommonScope;

import dagger.Component;

@CommonScope
@Component(dependencies = {CommonComponent.class})
public interface ShareComponent {
    void inject(ShareActivity activity);
}
