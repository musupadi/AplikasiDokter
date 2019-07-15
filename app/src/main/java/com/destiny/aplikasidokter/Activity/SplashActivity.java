package com.destiny.aplikasidokter.Activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.destiny.aplikasidokter.R;

public class SplashActivity extends AppCompatActivity {
    private int waktu_loading=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent Home=new Intent(SplashActivity.this, MainActivity.class);
                startActivity(Home);
                finish();
            }
        }, waktu_loading);
    }
}
