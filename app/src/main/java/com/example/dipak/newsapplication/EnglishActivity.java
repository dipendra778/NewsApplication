package com.example.dipak.newsapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class EnglishActivity extends AppCompatActivity {

    ImageView img_cnn,img_bbc,img_ruptly,img_washinton,img_newyork,img_russian,img_gurdian,img_china;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);

        img_cnn=findViewById(R.id.news_cnn);
        img_bbc=findViewById(R.id.news_bbc);
        img_ruptly=findViewById(R.id.news_ruptly);
        img_washinton=findViewById(R.id.news_washington);
        img_newyork=findViewById(R.id.news_newyork);
        img_russian=findViewById(R.id.news_russian);
        img_gurdian=findViewById(R.id.news_guardian);
        img_china=findViewById(R.id.news_china);

        img_cnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://edition.cnn.com/"));
                startActivity(browserIntent);

            }
        });

        img_bbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.bbc.com/"));
                startActivity(browserIntent);
            }
        });

        img_ruptly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://ruptly.tv/"));
                startActivity(browserIntent);
            }
        });

        img_washinton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.washingtonpost.com/"));
                startActivity(browserIntent);
            }
        });

        img_newyork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.nytimes.com"));
                startActivity(browserIntent);
            }
        });

        img_russian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://russia-insider.com/en"));
                startActivity(browserIntent);
            }
        });
        img_gurdian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.theguardian.com/international"));
                startActivity(browserIntent);
            }
        });

        img_china.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://english.cctv.com/"));
                startActivity(browserIntent);
            }
        });
    }
}
