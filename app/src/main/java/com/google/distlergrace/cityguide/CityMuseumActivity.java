package com.google.distlergrace.cityguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class CityMuseumActivity extends AppCompatActivity
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
        setContentView(R.layout.activity_city_museum);

        textViewStuffToDo   = findViewById(R.id.textViewStuffToDo);
        textViewLink        = findViewById(R.id.textViewLink);
        imageButtonMap      = findViewById(R.id.imageButtonMap);
        buttonReturn        = findViewById(R.id.buttonReturn);

        textViewLink.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.citymuseum.org/"));
                startActivity(browserIntent);
            }
        });

        imageButtonMap.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/City+Museum/@38.6329355,-90.2044496,15.7z/data=!4m5!3m4!1s0x87d8b33dc2801e55:0xc97c4420308aca04!8m2!3d38.6336407!4d-90.2002909"));
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
