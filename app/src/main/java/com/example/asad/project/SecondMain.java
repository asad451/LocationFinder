package com.example.asad.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);
    }
    public void nearby(View v)
    {
        Intent i= new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void searchPlaces(View v)
    {
        Intent i= new Intent(this,MapsActivity6.class);
        startActivity(i);
    }
}
