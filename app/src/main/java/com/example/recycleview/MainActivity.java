package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Chapter c1 = new Chapter(R.drawable.android_image_1,"Chapter 1", "Android overview");
        Chapter c2 = new Chapter(R.drawable.android_image_2,"Chapter 2", "Android overview");
        Chapter c3 = new Chapter(R.drawable.android_image_3,"Chapter 3", "Android overview");
        Chapter c4 = new Chapter(R.drawable.android_image_4,"Chapter 4", "Android overview");
        Chapter c5 = new Chapter(R.drawable.android_image_5,"Chapter 5", "Android overview");
        Chapter c6 = new Chapter(R.drawable.android_image_5,"Chapter 6", "Android overview");

        List<Chapter> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);
        list.add(c6);
    }
}