package com.example.sigbalinesekuliner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splashscreen2 extends AppCompatActivity {

    private final int panjang_splash2=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent tampil2 = new Intent(Splashscreen2.this,MainActivity.class);
                Splashscreen2.this.startActivity(tampil2);
                Splashscreen2.this.finish();
            }
        }, panjang_splash2);
    }
}
