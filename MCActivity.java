package com.example.jason.helloworldapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mc);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button buttonSub = (Button)(findViewById(R.id.butt1));
        final EditText choice1 = (EditText)(findViewById(R.id.choice1));
        final EditText choice2 = (EditText)(findViewById(R.id.choice2));
        final EditText choice3 = (EditText)(findViewById(R.id.choice3));
        final TextView label1 = (TextView)(findViewById(R.id.label1));
        final int defaultChoices = 3;
        final int total = defaultChoices;

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String [] array = new String[defaultChoices];

                array[0] = choice1.getText().toString();
                array[1] = choice2.getText().toString();
                array[2] = choice3.getText().toString();

                Random r = new Random();
                int rand = r.nextInt(2)+1;

                label1.setText(array[rand]);
            }
        });
    }

}
