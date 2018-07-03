package com.alcgooleafrica.com.chellenge20;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Welcome extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intant = new Intent(Welcome.this, MyDiary.class);
                startActivity(intant);
                finish();
            }


        }, SPLASH_TIME_OUT);
    }
}

