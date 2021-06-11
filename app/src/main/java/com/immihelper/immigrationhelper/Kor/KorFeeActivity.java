package com.immihelper.immigrationhelper.Kor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.immihelper.immigrationhelper.R;

public class KorFeeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kor_fee);

        ImageButton kmainbtn = (ImageButton) findViewById(R.id.kormainbtn);

        kmainbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KorActivity.class);
                startActivity(intent);
            }
        });
    }
}