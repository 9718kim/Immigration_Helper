package com.example.immigrationhelper.Kor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.immigrationhelper.R;

public class KorDocumentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kor_document);

        Button kmainbtn = (Button) findViewById(R.id.kormainbtn);
        Button ksafebtn = (Button) findViewById(R.id.korsafebtn);
        Button kfeebtn = (Button) findViewById(R.id.korfeebtn);
        Button ka1btn = (Button) findViewById(R.id.kora1btn);
        Button ka2btn = (Button) findViewById(R.id.kora2btn);
        Button ka3btn = (Button) findViewById(R.id.kora3btn);
        Button kb1btn = (Button) findViewById(R.id.korb1btn);
        Button kb2btn = (Button) findViewById(R.id.korb2btn);
        Button kc1btn = (Button) findViewById(R.id.korc1btn);
        Button kc3btn = (Button) findViewById(R.id.korc3btn);
        Button kc4btn = (Button) findViewById(R.id.korc4btn);
        Button kd1btn = (Button) findViewById(R.id.kord1btn);
        Button kd2btn = (Button) findViewById(R.id.kord2btn);
        Button kd3btn = (Button) findViewById(R.id.kord3btn);
        Button kd4btn = (Button) findViewById(R.id.kord4btn);
        Button kd5btn = (Button) findViewById(R.id.kord5btn);
        Button kd6btn = (Button) findViewById(R.id.kord6btn);
        Button kd7btn = (Button) findViewById(R.id.kord7btn);
        Button kd8btn = (Button) findViewById(R.id.kord8btn);
        Button kd9btn = (Button) findViewById(R.id.kord9btn);
        Button kd10btn = (Button) findViewById(R.id.kord10btn);
        Button ke1btn = (Button) findViewById(R.id.kore1btn);
        Button ke2btn = (Button) findViewById(R.id.kore2btn);
        Button ke3btn = (Button) findViewById(R.id.kore3btn);
        Button ke4btn = (Button) findViewById(R.id.kore4btn);
        Button ke5btn = (Button) findViewById(R.id.kore5btn);
        Button ke6btn = (Button) findViewById(R.id.kore6btn);
        Button ke7btn = (Button) findViewById(R.id.kore7btn);
        Button ke8btn = (Button) findViewById(R.id.kore8btn);
        Button ke9btn = (Button) findViewById(R.id.kore9btn);
        Button ke10btn = (Button) findViewById(R.id.kore10btn);
        Button kf1btn = (Button) findViewById(R.id.korf1btn);
        Button kf2btn = (Button) findViewById(R.id.korf2btn);
        Button kf3btn = (Button) findViewById(R.id.korf3btn);
        Button kf5btn = (Button) findViewById(R.id.korf5btn);
        Button kf6btn = (Button) findViewById(R.id.korf6btn);
        Button kg1btn = (Button) findViewById(R.id.korg1btn);
        Button kh1btn = (Button) findViewById(R.id.korh1btn);

        kmainbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KorActivity.class);
                startActivity(intent);
            }
        });
        ka1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KorA1Activity.class);
                startActivity(intent);
            }
        });
        ka2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KorA2Activity.class);
                startActivity(intent);
            }
        });
        ka3btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KorA3Activity.class);
                startActivity(intent);
            }
        });
        kb1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KorB1Activity.class);
                startActivity(intent);
            }
        });
        kb2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KorB2Activity.class);
                startActivity(intent);
            }
        });
        kc1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KorC1Activity.class);
                startActivity(intent);
            }
        });
        kc3btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KorC3Activity.class);
                startActivity(intent);
            }
        });
        kc4btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KorC4Activity.class);
                startActivity(intent);
            }
        });
        kd1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KorD1Activity.class);
                startActivity(intent);
            }
        });
        kd2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KorD2Activity.class);
                startActivity(intent);
            }
        });
        kd3btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KorD3Activity.class);
                startActivity(intent);
            }
        });
        kd4btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KorD4Activity.class);
                startActivity(intent);
            }
        });
        kd5btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KorD5Activity.class);
                startActivity(intent);
            }
        });
    }
}