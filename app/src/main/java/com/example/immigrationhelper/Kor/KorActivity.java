package com.example.immigrationhelper.Kor;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.immigrationhelper.Eng.EngActivity;
import com.example.immigrationhelper.R;

public class KorActivity extends AppCompatActivity {
    ImageButton b1;
    ImageButton b2;
    ImageButton b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kor);

        ImageButton kdobtn = (ImageButton) findViewById(R.id.kordobtn);
        ImageButton krebtn = (ImageButton) findViewById(R.id.korrebtn);
        ImageButton kgubtn = (ImageButton) findViewById(R.id.korgubtn);
        ImageButton klabtn = (ImageButton) findViewById(R.id.korlabtn);
        ImageButton b1 = (ImageButton) findViewById(R.id.callbtn);
        ImageButton b2 = (ImageButton) findViewById(R.id.callbtn2);
        ImageButton b3 = (ImageButton) findViewById(R.id.callbtn3);

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
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-2110-3000"));
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:1345"));
                startActivity(i2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:82-2-6908-1345"));
                startActivity(i3);
            }
        });
    }
}