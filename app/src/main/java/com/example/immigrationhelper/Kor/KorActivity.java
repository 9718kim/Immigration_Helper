package com.example.immigrationhelper.Kor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.immigrationhelper.R;

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
                Intent intent = new Intent(getApplicationContext(), KorDocumentActivity.class);
                startActivity(intent);
            }
        });
        krebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KorReservationActivity.class);
                startActivity(intent);
            }
        });
        kgubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KorGuideActivity.class);
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