package com.example.jason.helloworldapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.*;

import java.util.Random;


public class YesNoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yes_no);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button butt = (Button)(findViewById(R.id.butt));
        final TextView label = (TextView)(findViewById(R.id.ynLabel));


        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                label.setVisibility(View.INVISIBLE);

                boolean tF = Math.random() < 0.5;

                if (tF)
                {
                    label.setText("Yes!");
                }
                else
                {
                    label.setText("No.");
                }

                label.setVisibility(View.VISIBLE);

            }
        });

    }

}
