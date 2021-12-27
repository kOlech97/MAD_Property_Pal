package com.example.madpropertypal3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_addProperty, btn_showDetails, btn_addReport, btn_search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_addProperty = findViewById(R.id.btn_addProperty);
        btn_showDetails = findViewById(R.id.btn_showDetails);
        btn_addReport = findViewById(R.id.btn_addReport);
        btn_search = findViewById(R.id.btn_search);

        btn_addProperty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddProperty();

            }
        });

        btn_showDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShowDetails();
            }
        });
        btn_addReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSelectProperty();
            }
        });
        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSearching();
            }
        });
    }
    public void openAddProperty()
    {
         Intent intent1 = new Intent(this, AddProperty.class);
         startActivity(intent1);
    }
    public void openShowDetails()
    {
        Intent intent2 = new Intent(this, ShowDetails.class);
        startActivity(intent2);
    }
    public void openSelectProperty()
    {
        Intent intent3 = new Intent(this, SelectProperty.class);
        startActivity(intent3);
    }
    public void openSearching()
    {
        Intent intent6 = new Intent(this, Searching.class);
        startActivity(intent6);
    }
}