package com.example.immigrationhelper.Kor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.immigrationhelper.R;

import java.util.HashMap;
import java.util.Map;

public class KorDocumentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kor_document);

        ImageButton kmainbtn = (ImageButton) findViewById(R.id.kormainbtn);
        ImageButton ksafebtn = (ImageButton) findViewById(R.id.korsafebtn);

        Map<Integer, Integer> buttonLayoutMap = initializeButtonLayoutMap();
        initializeButtons(buttonLayoutMap);

        kmainbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KorActivity.class);
                startActivity(intent);
            }
        });
        ksafebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KorSafetyActivity.class);
                startActivity(intent);
            }
        });
    }

    private Map<Integer, Integer> initializeButtonLayoutMap() {
        Map<Integer, Integer> buttonLayoutMap = new HashMap<>();

        buttonLayoutMap.put(R.id.kora1btn, R.layout.kora1);
        buttonLayoutMap.put(R.id.kora2btn, R.layout.kora2);
        buttonLayoutMap.put(R.id.kora3btn, R.layout.kora3);
        buttonLayoutMap.put(R.id.korb1btn, R.layout.korb1);
        buttonLayoutMap.put(R.id.korb2btn, R.layout.korb2);
        buttonLayoutMap.put(R.id.korc1btn, R.layout.korc1);
        buttonLayoutMap.put(R.id.korc3btn, R.layout.korc3);
        buttonLayoutMap.put(R.id.korc4btn, R.layout.korc4);
        buttonLayoutMap.put(R.id.kord1btn, R.layout.kord1);
        buttonLayoutMap.put(R.id.kord2btn, R.layout.kord2);
        buttonLayoutMap.put(R.id.kord3btn, R.layout.kord3);
        buttonLayoutMap.put(R.id.kord4btn, R.layout.kord4);
        buttonLayoutMap.put(R.id.kord5btn, R.layout.kord5);
        buttonLayoutMap.put(R.id.kord6btn, R.layout.kord6);
        buttonLayoutMap.put(R.id.kord7btn, R.layout.kord7);
        buttonLayoutMap.put(R.id.kord8btn, R.layout.kord8);
        buttonLayoutMap.put(R.id.kord9btn, R.layout.kord9);
        buttonLayoutMap.put(R.id.kord10btn, R.layout.kord10);
        buttonLayoutMap.put(R.id.kore1btn, R.layout.kore1);
        buttonLayoutMap.put(R.id.kore2btn, R.layout.kore2);
        buttonLayoutMap.put(R.id.kore3btn, R.layout.kore3);
        buttonLayoutMap.put(R.id.kore4btn, R.layout.kore4);
        buttonLayoutMap.put(R.id.kore5btn, R.layout.kore5);
        buttonLayoutMap.put(R.id.kore6btn, R.layout.kore6);
        buttonLayoutMap.put(R.id.kore7btn, R.layout.kore7);
        buttonLayoutMap.put(R.id.kore8btn, R.layout.kore8);
        buttonLayoutMap.put(R.id.kore9btn, R.layout.kore9);
        buttonLayoutMap.put(R.id.kore10btn, R.layout.kore10);
        buttonLayoutMap.put(R.id.korf1btn, R.layout.korf1);
        buttonLayoutMap.put(R.id.korf2btn, R.layout.korf2);
        buttonLayoutMap.put(R.id.korf3btn, R.layout.korf3);
        buttonLayoutMap.put(R.id.korf5btn, R.layout.korf5);
        buttonLayoutMap.put(R.id.korf6btn, R.layout.korf6);
        buttonLayoutMap.put(R.id.korg1btn, R.layout.korg1);
        buttonLayoutMap.put(R.id.korh1btn, R.layout.korh1);

        return buttonLayoutMap;
    }

    private void initializeButtons(Map<Integer, Integer> buttonLayoutMap) {
        for (Integer key : buttonLayoutMap.keySet()) {
            ImageButton baseButton = (ImageButton) findViewById(key);
            baseButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), KorVisaActivity.class);
                    intent.putExtra("layout", buttonLayoutMap.get(key));
                    startActivity(intent);
                }
            });
        }
    }
}