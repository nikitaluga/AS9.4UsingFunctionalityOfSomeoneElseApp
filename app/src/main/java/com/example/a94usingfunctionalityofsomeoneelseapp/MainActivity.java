package com.example.a94usingfunctionalityofsomeoneelseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onWebSearch(View view) {
        Intent intentToWebSearch = new Intent(Intent.ACTION_VIEW, Uri.parse("http://skillbox.ru"));
//        startActivity(intentToWebSearch);
        startActivity(Intent.createChooser(intentToWebSearch, "Вы всегда будете выбирать..."));
    }
}
