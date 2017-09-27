package com.example.ajcoldwe.program01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendReport(View view) {
        EditText firstName = (EditText)findViewById(R.id.firstName);
        EditText lastName = (EditText)findViewById(R.id.lastName);
        EditText school = (EditText)findViewById(R.id.school);
        EditText gradYear = (EditText)findViewById(R.id.yearOfGraduate);
        EditText degree = (EditText)findViewById(R.id.degree);
        EditText major = (EditText)findViewById(R.id.major);
        EditText activities = (EditText)findViewById(R.id.activities);

        StringBuilder message = new StringBuilder();

        message.append(firstName.getText() + " ");
        message.append(lastName.getText() + " ");
        message.append("holds a ");
        message.append(degree.getText());
        message.append(" in ");
        message.append(major.getText() + " from ");
        message.append(school.getText() + " in ");
        message.append(gradYear.getText() + ". ");
        message.append("Their interests include ");
        message.append(activities.getText());

        Intent intent = new Intent(this, BioDisplay.class);
        intent.putExtra("Message", message.toString());
        startActivity(intent);
    }
}
