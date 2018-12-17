package com.shh.dagger2demo;

import android.app.Application;

import com.shh.dagger2demo.di.components.CommonComponent;
import com.shh.dagger2demo.di.components.DaggerCommonComponent;
import com.shh.dagger2demo.di.modules.CommonModule;

public class App extends Application {
    private CommonComponent commonComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        commonComponent = DaggerCommonComponent.builder().commonModule(new CommonModule()).build();
    }

    public CommonComponent getCommonComponent() {
        return commonComponent;
    }
}
