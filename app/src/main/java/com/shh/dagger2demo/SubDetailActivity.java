package com.shh.dagger2demo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.shh.dagger2demo.di.modules.DetailModule;
import com.shh.dagger2demo.models.Book;
import com.shh.dagger2demo.models.User;

import javax.inject.Inject;

public class SubDetailActivity extends AppCompatActivity {
    @Inject
    Book book1;

    @Inject
    Book book2;

    @Inject
    User user;

    public static void start(Context context) {
        context.startActivity(new Intent(context, SubDetailActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_detail);

        ((App) getApplication()).getCommonComponent().getSubDetailComponent(new DetailModule()).inject(this);

        Log.e("book1", book1.toString());
        Log.e("book2", book2.toString());

        Log.e("user", user.toString());
    }
}
