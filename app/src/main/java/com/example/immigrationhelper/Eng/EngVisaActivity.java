package com.example.immigrationhelper.Eng;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.immigrationhelper.R;

public class EngVisaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle extras = getIntent().getExtras();
        int layout = extras.getInt("layout");
        setContentView(layout);

        ImageButton emainbtn = (ImageButton) findViewById(R.id.engmainbtn);
        ImageButton efeebtn = (ImageButton) findViewById(R.id.engfeebtn);

        emainbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EngActivity.class);
                startActivity(intent);
            }
        });
        efeebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EngFeeActivity.class);
                startActivity(intent);
            }
        });
    }
}