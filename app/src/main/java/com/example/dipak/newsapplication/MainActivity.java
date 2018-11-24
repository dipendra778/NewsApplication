package com.example.dipak.newsapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper viewFlipper;
    ImageView img_nepali,img_local,img_hindi,img_english,img_about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_nepali=findViewById(R.id.news_nepali);
        img_local=findViewById(R.id.news_local);
        img_english=findViewById(R.id.news_english);
        img_hindi=findViewById(R.id.news_hindi);
        img_about=findViewById(R.id.imageView_c);
        viewFlipper=findViewById(R.id.photo_fliper);

        int images[] = {R.drawable.nepali, R.drawable.hindi, R.drawable.englishnews,
                R.drawable.local, R.drawable.jayphoto, R.drawable.news};

        for (int image : images) {
            flipperImages(image);
        }

        img_nepali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,NepaliActivity.class);
                startActivity(intent);
            }
        });

        img_local.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,LocalActivity.class);
                startActivity(intent);
            }
        });

        img_hindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,HindiActivity.class);
                startActivity(intent);
            }
        });

        img_english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,EnglishActivity.class);
                startActivity(intent);
            }
        });

        img_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,AboutActivity.class);
                startActivity(intent);
            }
        });

    }

    public void flipperImages(int images) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(images);

        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(4000);
        viewFlipper.setAutoStart(true);

        //Animation
        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }
}
