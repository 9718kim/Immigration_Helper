package com.example.immigrationhelper.Eng;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.immigrationhelper.R;

public class EngActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng);
        ImageButton be = (ImageButton) findViewById(R.id.callbtn_e);

        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:82-2-6908-1345"));
                startActivity(i4);
            }
        });
    }
}