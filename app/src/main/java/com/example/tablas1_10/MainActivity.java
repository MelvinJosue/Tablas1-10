package com.example.tablas1_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimerTask etesech=new TimerTask() {
            @Override
            public void run() {
                Intent intent =new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                finish();
            }
        };
        Timer tilin=new Timer();
        tilin.schedule(etesech,5000);

    }
}