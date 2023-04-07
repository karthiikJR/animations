package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean img1 = true;

    public void fade(View view){
        ImageView iv = (ImageView) findViewById(R.id.ivEg1);
        ImageView iv1 = (ImageView) findViewById(R.id.ivEg2);

        if(img1) {
            iv.animate().alpha(0).setDuration(2000);
            iv1.animate().alpha(1).setDuration(2000);
            img1 = false;
        }else {
            iv.animate().alpha(1).setDuration(2000);
            iv1.animate().alpha(0).setDuration(2000);
            img1 = true;
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}