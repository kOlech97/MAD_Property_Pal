package com.example.madpropertypal3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class Searching extends AppCompatActivity  {
    Button btn_searchProp;
    EditText et_enterName;
    ListView lv_prp;
    public String queryString2;
  //  public String proName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searching);
        btn_searchProp=findViewById(R.id.btn_searchProp);
        et_enterName=findViewById(R.id.et_enterName);
        lv_prp=findViewById(R.id.lv_prp);



        btn_searchProp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //proName= et_enterName.toString();
                 //queryString2 = "SELECT * FROM PROPERTIES WHERE PROPERTY_NAME MATCH " + proName;
                 //String name=et_enterName.getText().toString();
                //PropertyModel propertyModel = new PropertyModel();
                DataBaseHelper dataBaseHelper = new DataBaseHelper(Searching.this);
                List<PropertyModel>getOne = dataBaseHelper.getOne();
                Toast.makeText(Searching.this, getOne.toString(), Toast.LENGTH_SHORT).show();
                //Toast.makeText(Searching.this, getOne.toString(), Toast.LENGTH_SHORT).show();
                ArrayAdapter propertyArrayAdapter = new ArrayAdapter<PropertyModel>(Searching.this, android.R.layout.simple_list_item_1, dataBaseHelper.getOne());
                //Toast.makeText(Searching.this, getOne.toString(), Toast.LENGTH_SHORT).show();
                lv_prp.setAdapter(propertyArrayAdapter);



              // Toast.makeText(Searching.this, "works" + propertyModel, Toast.LENGTH_SHORT).show();
                //String query="SELECT * FROM PROPERTIES WHERE COLUMN_PROPERTY_NAME == " + et_enterName.getText().toString();


            }
        });
    }
    //private void ShowCustomersOnListView(DataBaseHelper dataBaseHelper2) {
       // customerArrayAdapter = new ArrayAdapter<CustomerModel>(MainActivity.this, android.R.layout.simple_list_item_1, dataBaseHelper2.getEveryone());
        //lv_customerList.setAdapter(customerArrayAdapter);
   // }
}