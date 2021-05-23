package com.example.asad.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1;
        b1=(Button)findViewById(R.id.button2);


    }
    public void Restaurants(View v)
    {
        Intent i= new Intent(this,MapsActivity.class);
        startActivity(i);
    }
//    public void findPlacesNearBy(View v)
//    {
//        Intent i= new Intent(this,GooglePlacesActivity.class);
//        startActivity(i);
//    }
    public void Banks(View v)
    {
        Intent i= new Intent(this,MapsActivity2.class);
        startActivity(i);
    }
    public void ATMs(View v)
    {
        Intent i= new Intent(this,MapsActivity3.class);
        startActivity(i);
    }
    public void Hotels(View v)
    {
        Intent i= new Intent(this,MapsActivity4.class);
        startActivity(i);
    }
    public void Hospitals(View v)
    {
        Intent i= new Intent(this,MapsActivity5.class);
        startActivity(i);
    }
//    public void onSearch(View v)
//    {
//        Intent i= new Intent(this,MapsActivity6.class);
//        startActivity(i);
//    }

}
