package com.shh.dagger2demo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.shh.dagger2demo.di.components.DaggerDetailComponent;
import com.shh.dagger2demo.di.modules.DetailModule;
import com.shh.dagger2demo.model.BookBean;
import com.shh.dagger2demo.model.UserBean;

import javax.inject.Inject;

public class DetailActivity extends AppCompatActivity {

    public static final String TAG = "DetailActivity";

    @Inject
    BookBean book1;

    @Inject
    BookBean book2;

    @Inject
    UserBean user;

    public static void start(Context context) {
        context.startActivity(new Intent(context, DetailActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detatil);

        DaggerDetailComponent.builder()
                .detailModule(new DetailModule())
                .commonComponent(((App) getApplication()).getCommonComponent())
                .build()
                .inject(this);

        Log.e("book1", book1.toString());
        Log.e("book2", book2.toString());

        Log.e("user", user.toString());
    }
}
