package com.google.distlergrace.cityguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TedDrewesActivity extends AppCompatActivity
{
    //Widget Variables
    Button  buttonReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ted_drewes);

        buttonReturn    = findViewById(R.id.buttonReturn);


        buttonReturn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });
    }
}