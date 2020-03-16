package com.mafyusuf.flashnight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
//d
    }

    public void Click(View view) {

        startActivity( new Intent(MainActivity.this,Nightmode.class ) );

    }




}
