package com.example.immigrationhelper.Eng;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.immigrationhelper.R;

import java.util.HashMap;
import java.util.Map;

public class EngDocumentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_document);

        ImageButton emainbtn = (ImageButton) findViewById(R.id.engmainbtn);
        ImageButton esafebtn = (ImageButton) findViewById(R.id.engsafebtn);

        Map<Integer, Integer> buttonLayoutMap = initializeButtonLayoutMap();
        initializeButtons(buttonLayoutMap);

        emainbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EngActivity.class);
                startActivity(intent);
            }
        });
        esafebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EngSafetyActivity.class);
                startActivity(intent);
            }
        });
    }

    private Map<Integer, Integer> initializeButtonLayoutMap() {
        Map<Integer, Integer> buttonLayoutMap = new HashMap<>();

        buttonLayoutMap.put(R.id.enga1btn, R.layout.enga1);
        buttonLayoutMap.put(R.id.enga2btn, R.layout.enga2);
        buttonLayoutMap.put(R.id.enga3btn, R.layout.enga3);
        buttonLayoutMap.put(R.id.engb1btn, R.layout.engb1);
        buttonLayoutMap.put(R.id.engb2btn, R.layout.engb2);
        buttonLayoutMap.put(R.id.engc1btn, R.layout.engc1);
        buttonLayoutMap.put(R.id.engc3btn, R.layout.engc3);
        buttonLayoutMap.put(R.id.engc4btn, R.layout.engc4);
        buttonLayoutMap.put(R.id.engd1btn, R.layout.engd1);
        buttonLayoutMap.put(R.id.engd2btn, R.layout.engd2);
        buttonLayoutMap.put(R.id.engd3btn, R.layout.engd3);
        buttonLayoutMap.put(R.id.engd4btn, R.layout.engd4);
        buttonLayoutMap.put(R.id.engd5btn, R.layout.engd5);
        buttonLayoutMap.put(R.id.engd6btn, R.layout.engd6);
        buttonLayoutMap.put(R.id.engd7btn, R.layout.engd7);
        buttonLayoutMap.put(R.id.engd8btn, R.layout.engd8);
        buttonLayoutMap.put(R.id.engd9btn, R.layout.engd9);
        buttonLayoutMap.put(R.id.engd10btn, R.layout.engd10);
        buttonLayoutMap.put(R.id.enge1btn, R.layout.enge1);
        buttonLayoutMap.put(R.id.enge2btn, R.layout.enge2);
        buttonLayoutMap.put(R.id.enge3btn, R.layout.enge3);
        buttonLayoutMap.put(R.id.enge4btn, R.layout.enge4);
        buttonLayoutMap.put(R.id.enge5btn, R.layout.enge5);
        buttonLayoutMap.put(R.id.enge6btn, R.layout.enge6);
        buttonLayoutMap.put(R.id.enge7btn, R.layout.enge7);
        buttonLayoutMap.put(R.id.enge8btn, R.layout.enge8);
        buttonLayoutMap.put(R.id.enge9btn, R.layout.enge9);
        buttonLayoutMap.put(R.id.enge10btn, R.layout.enge10);
        buttonLayoutMap.put(R.id.engf1btn, R.layout.engf1);
        buttonLayoutMap.put(R.id.engf2btn, R.layout.engf2);
        buttonLayoutMap.put(R.id.engf3btn, R.layout.engf3);
        buttonLayoutMap.put(R.id.engf5btn, R.layout.engf5);
        buttonLayoutMap.put(R.id.engf6btn, R.layout.engf6);
        buttonLayoutMap.put(R.id.engg1btn, R.layout.engg1);
        buttonLayoutMap.put(R.id.engh1btn, R.layout.engh1);

        return buttonLayoutMap;
    }

    private void initializeButtons(Map<Integer, Integer> buttonLayoutMap) {
        for (Integer key : buttonLayoutMap.keySet()) {
            ImageButton baseButton = (ImageButton) findViewById(key);
            baseButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), EngVisaActivity.class);
                    intent.putExtra("layout", buttonLayoutMap.get(key));
                    startActivity(intent);
                }
            });
        }
    }
}