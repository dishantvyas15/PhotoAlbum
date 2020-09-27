package com.dishant.photoalbum;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    public void prev(View view) {
        if(findViewById(R.id.img_1).getVisibility() == View.VISIBLE) {
            findViewById(R.id.img_1).setVisibility(View.INVISIBLE);
            findViewById(R.id.img_4).setVisibility(View.VISIBLE);
        }
        else if(findViewById(R.id.img_2).getVisibility() == View.VISIBLE) {
            findViewById(R.id.img_2).setVisibility(View.INVISIBLE);
            findViewById(R.id.img_1).setVisibility(View.VISIBLE);
        }
        else if(findViewById(R.id.img_3).getVisibility() == View.VISIBLE) {
            findViewById(R.id.img_3).setVisibility(View.INVISIBLE);
            findViewById(R.id.img_2).setVisibility(View.VISIBLE);
        }
        else if(findViewById(R.id.img_4).getVisibility() == View.VISIBLE) {
            findViewById(R.id.img_4).setVisibility(View.INVISIBLE);
            findViewById(R.id.img_3).setVisibility(View.VISIBLE);
        }
    }


    public void next(View view) {
        if(findViewById(R.id.img_1).getVisibility() == View.VISIBLE) {
            findViewById(R.id.img_1).setVisibility(View.INVISIBLE);
            findViewById(R.id.img_2).setVisibility(View.VISIBLE);
        }
        else if(findViewById(R.id.img_2).getVisibility() == View.VISIBLE) {
            findViewById(R.id.img_2).setVisibility(View.INVISIBLE);
            findViewById(R.id.img_3).setVisibility(View.VISIBLE);
        }
        else if(findViewById(R.id.img_3).getVisibility() == View.VISIBLE) {
            findViewById(R.id.img_3).setVisibility(View.INVISIBLE);
            findViewById(R.id.img_4).setVisibility(View.VISIBLE);
        }
        else if(findViewById(R.id.img_4).getVisibility() == View.VISIBLE) {
            findViewById(R.id.img_4).setVisibility(View.INVISIBLE);
            findViewById(R.id.img_1).setVisibility(View.VISIBLE);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
