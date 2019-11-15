package ru.mirea.spichakav.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_avtivity);
        String text = (String) getIntent().getSerializableExtra("key");
        TextView textView = findViewById(R.id.textView1);
        textView.setText(text);

    }
}