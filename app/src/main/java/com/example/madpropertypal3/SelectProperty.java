package com.example.madpropertypal3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class SelectProperty extends AppCompatActivity {
    ListView lv_showProperties;
     public String proName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_property);
        lv_showProperties=findViewById(R.id.lv_showProperties);
        DataBaseHelper dataBaseHelper = new DataBaseHelper(SelectProperty.this);
        List<PropertyModel> everyone= dataBaseHelper.getEveryone();

        ArrayAdapter propertyArrayAdapter = new ArrayAdapter<PropertyModel>(SelectProperty.this, android.R.layout.simple_list_item_1, everyone);
        lv_showProperties.setAdapter(propertyArrayAdapter);

        lv_showProperties.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                PropertyModel clickedpropertyModel= (PropertyModel) parent.getItemAtPosition(position);
                proName = clickedpropertyModel.getPropertyName().toString();
                Toast.makeText(SelectProperty.this, "selected: " + proName, Toast.LENGTH_SHORT).show();
                openAddReport();

            }
        });
    }

    public void openAddReport()
    {
        Intent intent4 = new Intent(this, AddReport.class);
        startActivity(intent4);
    }


}