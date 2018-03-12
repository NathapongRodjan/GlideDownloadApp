package com.example.nathapong.glidedownloadapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView imgDownload;
    Button btnDownload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgDownload = (ImageView)findViewById(R.id.imgDownload);
        btnDownload = (Button)findViewById(R.id.btnDownload);


        btnDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "https://firebasestorage.googleapis.com/v0/b/app80uploadinganimagetofirebas.appspot.com/o/Images%2F25112?alt=media&token=aa675939-3af5-4475-a72b-7257139b3d33";

                GlideApp
                        .with(MainActivity.this)
                        .load(url)
                        .fitCenter()
                        .into(imgDownload);


            }
        });
    }
}
