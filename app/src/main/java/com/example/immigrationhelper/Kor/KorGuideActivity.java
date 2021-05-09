package com.example.immigrationhelper.Kor;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.immigrationhelper.R;

public class KorGuideActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kor_guide);

        ImageButton kmainbtn = (ImageButton) findViewById(R.id.kormainbtn);
        ImageButton kcall1 = (ImageButton) findViewById(R.id.korcallbtn1);
        ImageButton kcall2 = (ImageButton) findViewById(R.id.korcallbtn2);
        ImageButton kcall3 = (ImageButton) findViewById(R.id.korcallbtn3);

        kmainbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KorActivity.class);
                startActivity(intent);
            }
        });
        kcall1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-2110-3000"));
                startActivity(i);
            }
        });
        kcall2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:1345"));
                startActivity(i2);
            }
        });
        kcall3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:82-2-6908-1345"));
                startActivity(i3);
            }
        });
    }
}