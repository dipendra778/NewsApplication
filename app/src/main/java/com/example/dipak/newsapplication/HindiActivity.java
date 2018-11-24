package com.example.dipak.newsapplication;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HindiActivity extends AppCompatActivity {

    ImageView img_bhaskar,img_indianexpress,img_jagaran,img_zeenews,img_panchjanya,img_aajtak,img_firstpost,img_oneindia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi);
        img_bhaskar=findViewById(R.id.news_bhaskar);
        img_indianexpress=findViewById(R.id.news_indian);
        img_jagaran=findViewById(R.id.news_jagaran);
        img_zeenews=findViewById(R.id.news_zeenews);
        img_panchjanya=findViewById(R.id.news_panchjanya);
        img_aajtak=findViewById(R.id.news_aajtak);
        img_firstpost=findViewById(R.id.news_firstpost);
        img_oneindia=findViewById(R.id.news_oneindia);

        img_bhaskar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.bhaskar.com/"));
                startActivity(browserIntent);

            }
        });

        img_indianexpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://indianexpress.com/"));
                startActivity(browserIntent);
            }
        });

        img_jagaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.jagran.com/"));
                startActivity(browserIntent);
            }
        });

        img_zeenews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://zeenews.india.com/"));
                startActivity(browserIntent);
            }
        });

        img_panchjanya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://rss.org/"));
                startActivity(browserIntent);
            }
        });

        img_aajtak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://aajtak.intoday.in/"));
                startActivity(browserIntent);
            }
        });
        img_firstpost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.firstpost.com/"));
                startActivity(browserIntent);
            }
        });

        img_oneindia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.oneindia.com/"));
                startActivity(browserIntent);
            }
        });

    }
}
