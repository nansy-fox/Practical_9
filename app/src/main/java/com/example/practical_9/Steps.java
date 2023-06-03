package com.example.practical_9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Steps extends AppCompatActivity {
    private Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steps);
        but = findViewById(R.id.button16);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com"));
            startActivity(browserIntent);
            }
        });
    }
}