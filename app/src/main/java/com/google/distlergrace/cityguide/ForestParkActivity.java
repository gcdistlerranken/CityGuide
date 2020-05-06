package com.google.distlergrace.cityguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ForestParkActivity extends AppCompatActivity
{
    //Widget Variables
    TextView        textViewStuffToDo;
    TextView        textViewLink;
    ImageButton     imageButtonMap;
    Button          buttonReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forest_park);

        textViewStuffToDo   = findViewById(R.id.textViewStuffToDo);
        textViewLink        = findViewById(R.id.textViewLink);
        imageButtonMap      = findViewById(R.id.imageButtonMap);
        buttonReturn        = findViewById(R.id.buttonReturn);

        textViewLink.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forestparkmap.org/"));
                startActivity(browserIntent);
            }
        });

        imageButtonMap.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Forest+Park/@38.6380983,-90.2959875,14.29z/data=!4m5!3m4!1s0x87d8b5469178c4c9:0x9d27c5026db294aa!8m2!3d38.644081!4d-90.283466"));
                startActivity(browserIntent);
            }
        });

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
