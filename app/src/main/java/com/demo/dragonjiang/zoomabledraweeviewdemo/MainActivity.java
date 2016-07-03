package com.demo.dragonjiang.zoomabledraweeviewdemo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ZoomableDraweeView zoomableDraweeView = (ZoomableDraweeView) findViewById(R.id.zdv_image);
        zoomableDraweeView.setImageURI(Uri.parse("http://pic.58pic.com/58pic/17/76/75/65V58PIC3uf_1024.jpg"));

    }
}
