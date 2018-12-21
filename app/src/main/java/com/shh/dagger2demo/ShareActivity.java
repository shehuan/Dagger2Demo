package com.shh.dagger2demo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.shh.dagger2demo.di.components.DaggerShareComponent;
import com.shh.dagger2demo.models.Book;

import javax.inject.Inject;

public class ShareActivity extends AppCompatActivity {
    @Inject
    Book book;

    public static void start(Context context) {
        context.startActivity(new Intent(context, ShareActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        DaggerShareComponent.builder()
                .commonComponent(((App) getApplication()).getCommonComponent())
                .build()
                .inject(this);

        Log.e("ShareActivity-book", book.toString());
    }
}
