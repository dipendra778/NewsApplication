package com.example.dipak.newsapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class AboutActivity extends AppCompatActivity {

    ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        getSupportActionBar().setTitle("About Developer");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewFlipper=findViewById(R.id.photo_fliper);
         int img[]={R.drawable.jayphoto,R.drawable.tapephoto,R.drawable.bharatphoto,R.drawable.nirajanphoto,R.drawable.news};

        for (int image : img) {
            flipperImages(image);
        }

    }

    private void flipperImages(int image_a) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image_a);

        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(4000);
        viewFlipper.setAutoStart(true);

        //Animation
        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }
}
