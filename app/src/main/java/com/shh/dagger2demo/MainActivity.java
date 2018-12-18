package com.shh.dagger2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.shh.dagger2demo.di.components.DaggerMainComponent;
import com.shh.dagger2demo.di.modules.MainModule;
import com.shh.dagger2demo.di.qulifiers.QualifierRed;
import com.shh.dagger2demo.models.BirdBean;
import com.shh.dagger2demo.models.BookBean;
import com.shh.dagger2demo.models.FlowerBean;
import com.shh.dagger2demo.models.UserBean;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

import dagger.Lazy;


public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Inject
    BirdBean bird;

    @Inject
    FlowerBean flower1;

    @QualifierRed
    @Inject
    FlowerBean flower2;

    @Named("white")
    @Inject
    FlowerBean flower3;

    @Inject
    UserBean user;

    // 对象懒加载，用到该依赖对象时才会去加载，只加载一次
    @Named("book1")
    @Inject
    Lazy<BookBean> book1;

    // 每次用到依赖对象，都会重新加载一次
    @Named("book2")
    @Inject
    Provider<BookBean> book2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainComponent.builder()
                .mainModule(new MainModule())
                .commonComponent(((App) getApplication()).getCommonComponent())
                .build()
                .inject(this);

        Log.e("bird", bird.toString());

        Log.e("flower1", flower1.toString());
        Log.e("flower2", flower2.toString());
        Log.e("flower3", flower3.toString());

        Log.e("user", user.toString());

        Log.e("测试Lazy", book1.get().toString());
        Log.e("测试Lazy", book1.get().toString());
        Log.e("测试Lazy", book1.get().toString());

        Log.e("测试Provider", book2.get().toString());
        Log.e("测试Provider", book2.get().toString());
        Log.e("测试Provider", book2.get().toString());
    }

    public void testScope(View view) {
        DetailActivity.start(this);
    }

    public void testSubcomponent(View view) {
        SubDetailActivity.start(this);
    }
}
