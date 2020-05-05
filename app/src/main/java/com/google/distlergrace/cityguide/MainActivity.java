package com.google.distlergrace.cityguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    //Program Constants

    //Widget Variables
    Button  buttonArch;
    Button  buttonForestPark;
    Button  buttonTheLoop;
    Button  buttonCityMuseum;
    Button  buttonTedDrewes;
    Button  buttonTheHill;
    Button  buttonMomsDeli;

    //Non-Widget Variables


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonArch       = findViewById(R.id.buttonArch);
        buttonForestPark = findViewById(R.id.buttonForestPark);
        buttonTheLoop    = findViewById(R.id.buttonTheLoop);
        buttonCityMuseum = findViewById(R.id.buttonCityMuseum);
        buttonTedDrewes  = findViewById(R.id.buttonTedDrewes);
        buttonTheHill    = findViewById(R.id.buttonTheHill);
        buttonMomsDeli   = findViewById(R.id.buttonMomsDeli);

        buttonArch.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent (getApplicationContext(), TheArchActivity.class);
                startActivity(intent);
            }
        });

        buttonForestPark.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent (getApplicationContext(), ForestParkActivity.class);
                startActivity(intent);
            }
        });

        buttonTheLoop.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent (getApplicationContext(), TheLoopActivity.class);
                startActivity(intent);
            }
        });

        buttonCityMuseum.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent (getApplicationContext(), CityMuseumActivity.class);
                startActivity(intent);
            }
        });

        buttonTedDrewes.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent (getApplicationContext(), TedDrewesActivity.class);
                startActivity(intent);
            }
        });

        buttonTheHill.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent (getApplicationContext(), TheHillActivity.class);
                startActivity(intent);
            }
        });

        buttonMomsDeli.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent (getApplicationContext(), MomsDeliActivity.class);
                startActivity(intent);
            }
        });
    }
}
