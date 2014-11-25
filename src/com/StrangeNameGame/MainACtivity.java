package com.StrangeNameGame;

import android.app.Activity;
import android.os.Bundle;

import android.os.Bundle;
import android.widget.ImageView;
import android.view.View;

public class MainACtivity extends Activity {


    ImageView image;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        image = (ImageView) findViewById(R.id.imageView1);
        image.setImageResource(R.drawable.putin);

        image = (ImageView) findViewById(R.id.imageView2);
        image.setImageResource(R.drawable.putin);

        image = (ImageView) findViewById(R.id.imageView3);
        image.setImageResource(R.drawable.putin);

        image = (ImageView) findViewById(R.id.imageView4);
        image.setImageResource(R.drawable.putin);
    }
}
