package com.shh.dagger2demo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.shh.dagger2demo.di.components.DaggerDetailComponent;
import com.shh.dagger2demo.di.modules.DetailModule;
import com.shh.dagger2demo.models.Book;

import javax.inject.Inject;

public class DetailActivity extends AppCompatActivity {
    @Inject
    Book book1;

    @Inject
    Book book2;

    public static void start(Context context) {
        context.startActivity(new Intent(context, DetailActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detatil);

        DaggerDetailComponent.builder()
                .detailModule(new DetailModule())
                .build()
                .inject(this);

        Log.e("book1", book1.toString());
        Log.e("book2", book2.toString());
    }
}
