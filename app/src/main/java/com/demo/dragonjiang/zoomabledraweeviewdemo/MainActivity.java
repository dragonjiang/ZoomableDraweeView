package com.demo.dragonjiang.zoomabledraweeviewdemo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ZoomableDraweeView zoomableDraweeView = (ZoomableDraweeView) findViewById(R.id.image);
        zoomableDraweeView.setImageURI(Uri.parse("http://img5q.duitang.com/uploads/item/201112/22/20111222195255_CPCEG.thumb.700_0.jpg"));

    }
}
