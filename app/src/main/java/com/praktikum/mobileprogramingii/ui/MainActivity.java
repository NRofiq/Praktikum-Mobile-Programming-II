package com.praktikum.mobileprogramingii.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.praktikum.mobileprogramingii.R;

public class MainActivity extends AppCompatActivity {
    Button btntest,btntoFragmentActivity,btntosharedprefandroomdb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btntest = findViewById(R.id.btntest);
        btntoFragmentActivity = findViewById(R.id.btntoFragmentActivity);
        btntosharedprefandroomdb = findViewById(R.id.btntosharedprefandroomdb);


    }

    @Override
    protected void onResume() {
        super.onResume();

        btntest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getApplicationContext(), com.praktikum.mobileprogramingii.ui.ReciverActivity.class);
                intent.putExtra("welcome", "halo dari Activity");
                startActivity(intent);

            }
        });
        btntoFragmentActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, com.praktikum.mobileprogramingii.ui.WithFragmentActivity.class);
                startActivity(intent);

            }
        });
        btntosharedprefandroomdb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, com.praktikum.mobileprogramingii.ui.HomeActivity.class);
                startActivity(intent);

            }
        });
    }}

