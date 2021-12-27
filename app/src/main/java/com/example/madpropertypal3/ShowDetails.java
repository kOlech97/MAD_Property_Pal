package com.example.madpropertypal3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class ShowDetails extends AppCompatActivity {
    Button btn_viewDetails, btn_reset;
    ListView lv_propertyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_details);
        btn_viewDetails = findViewById(R.id.btn_viewDetails);
        btn_reset = findViewById(R.id.btn_reset);
        lv_propertyList = findViewById(R.id.lv_propertyList);
        btn_viewDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataBaseHelper dataBaseHelper = new DataBaseHelper(ShowDetails.this);
                List<PropertyModel>everyone= dataBaseHelper.getEveryone();
                //Toast.makeText(ShowDetails.this, everyone.toString(), Toast.LENGTH_SHORT).show();
                ArrayAdapter propertyArrayAdapter = new ArrayAdapter<PropertyModel>(ShowDetails.this, android.R.layout.simple_list_item_1, everyone);
                lv_propertyList.setAdapter(propertyArrayAdapter);
            }
        });
        lv_propertyList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                PropertyModel clickedpropertyModel= (PropertyModel) parent.getItemAtPosition(position);
                DataBaseHelper dataBaseHelper = new DataBaseHelper(ShowDetails.this);
                dataBaseHelper.deleteOne(clickedpropertyModel);
                List<PropertyModel>everyone= dataBaseHelper.getEveryone();
                ArrayAdapter propertyArrayAdapter = new ArrayAdapter<PropertyModel>(ShowDetails.this, android.R.layout.simple_list_item_1, everyone);
                lv_propertyList.setAdapter(propertyArrayAdapter);

            }
        });

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PropertyModel propertymodel = new PropertyModel();
                DataBaseHelper dataBaseHelper = new DataBaseHelper(ShowDetails.this);
                dataBaseHelper.deleteAll(propertymodel);

                List<PropertyModel>everyone= dataBaseHelper.getEveryone();
                ArrayAdapter propertyArrayAdapter = new ArrayAdapter<PropertyModel>(ShowDetails.this, android.R.layout.simple_list_item_1, everyone);
                lv_propertyList.setAdapter(propertyArrayAdapter);
                Toast.makeText(ShowDetails.this, "Database Cleared. ", Toast.LENGTH_SHORT).show();
            }
        });
    }
}