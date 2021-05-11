package com.example.immigrationhelper.Kor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.immigrationhelper.Eng.EngActivity;
import com.example.immigrationhelper.R;

public class KorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kor);

        ImageButton kdobtn = (ImageButton) findViewById(R.id.kordobtn);
        ImageButton krebtn = (ImageButton) findViewById(R.id.korrebtn);
        ImageButton kgubtn = (ImageButton) findViewById(R.id.korgubtn);
        ImageButton klabtn = (ImageButton) findViewById(R.id.korlabtn);

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
                Intent intent = new Intent(getApplicationContext(), EngActivity.class);
                startActivity(intent);
            }
        });
    }
}