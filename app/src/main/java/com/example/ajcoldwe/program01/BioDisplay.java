package com.example.ajcoldwe.program01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class BioDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio_display);

        Intent callingIntent = getIntent();
        String message = callingIntent.getStringExtra("Message");

        TextView editText = (TextView) findViewById(R.id.editText);
        editText.setText(message);
    }
}
