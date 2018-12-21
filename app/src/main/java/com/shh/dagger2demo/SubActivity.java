package com.shh.dagger2demo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.shh.dagger2demo.di.components.DaggerDetailComponent;
import com.shh.dagger2demo.di.components.DetailComponent;
import com.shh.dagger2demo.di.modules.DetailModule;
import com.shh.dagger2demo.di.modules.SubModule;
import com.shh.dagger2demo.models.Book;
import com.shh.dagger2demo.models.Flower;

import javax.inject.Inject;

public class SubActivity extends AppCompatActivity {
    @Inject
    Book book;

    @Inject
    Flower flower;

    public static void start(Context context) {
        context.startActivity(new Intent(context, SubActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        DetailComponent detailComponent = DaggerDetailComponent.builder().detailModule(new DetailModule()).build();
        detailComponent.getSubComponent(new SubModule()).inject(this);

//        ((App) getApplication()).getCommonComponent().getSubComponent(new SubModule()).inject(this);

        Log.e("SubActivity-book", book.toString());
        Log.e("flower", flower.toString());
    }
}
