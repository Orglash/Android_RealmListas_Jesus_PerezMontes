package com.example.realmlistas.views.activities;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.realmlistas.R;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    EditText input_lugar;
    EditText input_provincia;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        input_lugar=findViewById(R.id.input_text_lugar);
        input_provincia=findViewById(R.id.input_text_provincia);
        final Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String lugar = input_lugar.getText().toString();
        String provincia = input_provincia.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("lugar", lugar);
        intent.putExtra("provincia", provincia);
        setResult(2, intent);
        finish();
    }
}
