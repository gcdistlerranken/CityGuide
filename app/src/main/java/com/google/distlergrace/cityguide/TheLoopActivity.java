package com.google.distlergrace.cityguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class TheLoopActivity extends AppCompatActivity
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
        setContentView(R.layout.activity_the_loop);

        textViewStuffToDo   = findViewById(R.id.textViewStuffToDo);
        textViewLink        = findViewById(R.id.textViewLink);
        imageButtonMap      = findViewById(R.id.imageButtonMap);
        buttonReturn        = findViewById(R.id.buttonReturn);

        textViewLink.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://visittheloop.com/"));
                startActivity(browserIntent);
            }
        });

        imageButtonMap.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Delmar+Loop,+University+City,+MO/@38.6555093,-90.3098347,15.48z/data=!4m12!1m6!3m5!1s0x87df355390687aa5:0xc791cde087891dcd!2sThe+Delmar+Loop!8m2!3d38.6551319!4d-90.2980005!3m4!1s0x87df355470c8edeb:0x9b5d777446a7dcbd!8m2!3d38.6561919!4d-90.3051603"));
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
