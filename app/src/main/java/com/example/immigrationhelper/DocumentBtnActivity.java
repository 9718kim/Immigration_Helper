package com.example.immigrationhelper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DocumentBtnActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kor_document);

        Button kmainbtn = (Button) findViewById(R.id.kormainbtn);
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