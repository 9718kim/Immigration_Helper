package com.example.immigrationhelper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class KorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kor);

        Button kdobtn = (Button) findViewById(R.id.kordobtn);
        Button krebtn = (Button) findViewById(R.id.korrebtn);
        Button kgubtn = (Button) findViewById(R.id.korgubtn);
        Button klabtn = (Button) findViewById(R.id.korlabtn);

        kdobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DocumentBtnActivity.class);
                startActivity(intent);
            }
        });
        krebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ReservationBtnActivity.class);
                startActivity(intent);
            }
        });
        kgubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GuideBtnActivity.class);
                startActivity(intent);
            }
        });
        klabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KorEngBtnActivity.class);
                startActivity(intent);
            }
        });
    }
}