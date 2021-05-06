package com.example.immigrationhelper.Kor.KorVisa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.immigrationhelper.Kor.KorActivity;
import com.example.immigrationhelper.Kor.KorFeeActivity;
import com.example.immigrationhelper.R;

public class KorC3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.korc3);

        ImageButton kmainbtn = (ImageButton) findViewById(R.id.kormainbtn);
        ImageButton kfeebtn = (ImageButton) findViewById(R.id.korfeebtn);

        kmainbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KorActivity.class);
                startActivity(intent);
            }
        });
        kfeebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KorFeeActivity.class);
                startActivity(intent);
            }
        });
    }
}