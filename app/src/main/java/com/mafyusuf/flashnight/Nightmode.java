package com.mafyusuf.flashnight;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Nightmode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_nightmode );
    }

    public void Lightmode(View view) {
        AppCompatDelegate.setDefaultNightMode( AppCompatDelegate.MODE_NIGHT_NO );
        startActivity( new Intent( getApplicationContext(),Nightmode.class ) );
        finish();
    }

    public void DarkMode(View view) {
        AppCompatDelegate.setDefaultNightMode( AppCompatDelegate.MODE_NIGHT_YES );
        startActivity( new Intent( getApplicationContext(),Nightmode.class ) );
        finish();
    }
}
