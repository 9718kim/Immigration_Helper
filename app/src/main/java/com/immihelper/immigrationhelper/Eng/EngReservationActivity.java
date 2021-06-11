package com.immihelper.immigrationhelper.Eng;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.immihelper.immigrationhelper.R;

public class EngReservationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_reservation);

        ImageButton emainbtn = (ImageButton) findViewById(R.id.engmainbtn);

        emainbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EngActivity.class);
                startActivity(intent);
            }
        });
    }
}