package com.example.dipak.newsapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class NepaliActivity extends AppCompatActivity {

    ImageView img_ratopati,img_setopati,img_onlinekhabar,img_kantipur,img_gorkhapatra,img_annapurna,img_nagarik,img_nepalsamachar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nepali);

        img_ratopati=findViewById(R.id.news_ratopati);
        img_setopati=findViewById(R.id.news_setopati);
        img_onlinekhabar=findViewById(R.id.news_online);
        img_kantipur=findViewById(R.id.news_kantipur);
        img_gorkhapatra=findViewById(R.id.news_gorkha);
        img_annapurna=findViewById(R.id.news_annapurna);
        img_nagarik=findViewById(R.id.news_nagarik);
        img_nepalsamachar=findViewById(R.id.news_nepalsamachar);

        img_ratopati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://ratopati.com/"));
                startActivity(browserIntent);

            }
        });

        img_setopati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://setopati.com"));
                startActivity(browserIntent);
            }
        });

        img_onlinekhabar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://onlinekhabar.com"));
                startActivity(browserIntent);
            }
        });

        img_kantipur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://kantipurdaily.com"));
                startActivity(browserIntent);
            }
        });

        img_gorkhapatra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.gorkhapatraonline.com/"));
                startActivity(browserIntent);
            }
        });

        img_annapurna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://annapurnapost.com"));
                startActivity(browserIntent);
            }
        });
        img_nagarik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://nagariknews.nagariknetwork.com/"));
                startActivity(browserIntent);
            }
        });

        img_nepalsamachar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.newsofnepal.com/"));
                startActivity(browserIntent);
            }
        });
    }
}
