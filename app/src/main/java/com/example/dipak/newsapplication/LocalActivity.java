package com.example.dipak.newsapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LocalActivity extends AppCompatActivity {

    ImageView img_dinesh,img_paschim,img_sidharekha,img_doti,img_sugat,img_radiodhangadhi,img_amargadhi,img_dhangadhi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local);

        img_dinesh=findViewById(R.id.news_dinesh);
        img_paschim=findViewById(R.id.news_paschim);
        img_sidharekha=findViewById(R.id.news_sidharekha);
        img_doti=findViewById(R.id.news_radiodoti);
        img_sugat=findViewById(R.id.news_saugat);
        img_radiodhangadhi=findViewById(R.id.news_radiodhan);
        img_amargadhi=findViewById(R.id.news_amargadhi);
        img_dhangadhi=findViewById(R.id.news_dhangadhi);

        img_dinesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://dineshkhabar.com/"));
                startActivity(browserIntent);

            }
        });

        img_paschim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.paschimtoday.com/"));
                startActivity(browserIntent);
            }
        });

        img_sidharekha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://sidharekha.com/"));
                startActivity(browserIntent);
            }
        });

        img_radiodhangadhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.radiodhangadhi.com/"));
                startActivity(browserIntent);
            }
        });

        img_doti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://radiodoti.com.np/"));
                startActivity(browserIntent);
            }
        });

        img_sugat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.saugaatfmbaitadi.org/radio/index.html"));
                startActivity(browserIntent);
            }
        });
        img_amargadhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://radioamargadhi.org/"));
                startActivity(browserIntent);
            }
        });

        img_dhangadhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://dhangadhitimes.com/"));
                startActivity(browserIntent);
            }
        });
    }
}
