package com.google.distlergrace.cityguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MomsDeliActivity extends AppCompatActivity
{
    //Widget Variables
    TextView textViewStuffToDo;
    TextView        textViewLink;
    ImageButton imageButtonMap;
    Button          buttonReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moms_deli);

        textViewStuffToDo   = findViewById(R.id.textViewStuffToDo);
        textViewLink        = findViewById(R.id.textViewLink);
        imageButtonMap      = findViewById(R.id.imageButtonMap);
        buttonReturn        = findViewById(R.id.buttonReturn);

        textViewLink.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.momsdeli.com/"));
                startActivity(browserIntent);
            }
        });

        imageButtonMap.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Mom's+Deli/@38.591131,-90.3139999,15.7z/data=!4m5!3m4!1s0x87d8ca6d70b03375:0x2be9391dfe1933c6!8m2!3d38.5918064!4d-90.3094344"));
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
