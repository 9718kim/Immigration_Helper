package com.immihelper.immigrationhelper.Eng;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.immihelper.immigrationhelper.Kor.KorActivity;
import com.immihelper.immigrationhelper.R;

public class EngActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng);

        ImageButton edobtn = (ImageButton) findViewById(R.id.engdobtn);
        ImageButton erebtn = (ImageButton) findViewById(R.id.engrebtn);
        ImageButton egubtn = (ImageButton) findViewById(R.id.enggubtn);
        ImageButton elabtn = (ImageButton) findViewById(R.id.englabtn);

        edobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EngDocumentActivity.class);
                startActivity(intent);
            }
        });
        erebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EngReservationActivity.class);
                startActivity(intent);
            }
        });
        egubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EngGuideActivity.class);
                startActivity(intent);
            }
        });
        elabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KorActivity.class);
                startActivity(intent);
            }
        });
    }
}