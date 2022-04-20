package com.example.ethnomedicinalapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.content.Intent;
import android.view.View;

public class PlantActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant);

        ImageButton home = (ImageButton) findViewById(R.id.home);

        Button leavesButton = (Button) findViewById(R.id.leavesButton);
        Button stemsButton = (Button) findViewById(R.id.stemsButton);
        Button flowersButton = (Button) findViewById(R.id.flowersButton);
        Button rootsButton = (Button) findViewById(R.id.rootsButton);

        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(PlantActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        leavesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(PlantActivity.this, LeavesActivity.class);
                startActivity(intent);
            }
        });

        /*stemsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(PlantActivity.this, EmptyActivity.class);
                startActivity(intent);
            }
        });

        flowersButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(PlantActivity.this, EmptyActivity.class);
                startActivity(intent);
            }
        });

        rootsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(PlantActivity.this, EmptyActivity.class);
                startActivity(intent);
            }
        });*/
    }
}
