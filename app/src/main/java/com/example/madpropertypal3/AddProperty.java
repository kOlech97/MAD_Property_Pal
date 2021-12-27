package com.example.madpropertypal3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddProperty extends AppCompatActivity {
    EditText et_propertyName, et_propertyType, et_propertyLeaseType, et_propertyLocation, et_propertySize, et_propertyAmenities, et_propertyDescription;
    EditText et_propertyBedrooms, et_propertyBathrooms, et_propertyPrice, et_propertyDoors, et_propertyWindows;
    Button btn_add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_property);
        et_propertyName = findViewById(R.id.et_propertyName);
        et_propertyType = findViewById(R.id.et_propertyType);
        et_propertyLeaseType = findViewById(R.id.et_propertyLeaseType);
        et_propertyLocation = findViewById(R.id.et_propertyLocation);
        et_propertySize = findViewById(R.id.et_propertySize);
        et_propertyAmenities = findViewById(R.id.et_propertyAmenities);
        et_propertyDescription = findViewById(R.id.et_propertyDescription);
        et_propertyBedrooms = findViewById(R.id.et_propertyBedrooms);
        et_propertyBathrooms = findViewById(R.id.et_propertyBathrooms);
        et_propertyPrice = findViewById(R.id.et_propertyPrice);
        et_propertyDoors = findViewById(R.id.et_propertyDoors);
        et_propertyWindows = findViewById(R.id.et_propertyWindows);
        btn_add = findViewById(R.id.btn_add);


        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // PropertyModel propertymodel = new PropertyModel(0,et_propertyName.getText().toString(), et_propertyType.getText().toString(), et_propertyLeaseType.getText().toString(), et_propertyLocation.getText().toString(), et_propertySize.getText().toString(), et_propertyAmenities.getText().toString(), et_propertyDescription.getText().toString(), Integer.parseInt(et_propertyBedrooms.getText().toString()), Integer.parseInt(et_propertyBathrooms.getText().toString()), Integer.parseInt(et_propertyPrice.getText().toString()), Integer.parseInt(et_propertyDoors.getText().toString()), Integer.parseInt(et_propertyWindows.getText().toString()) );

                PropertyModel propertymodel = new PropertyModel();
                try {


                    propertymodel = new PropertyModel(-1, et_propertyName.getText().toString(), et_propertyType.getText().toString(), et_propertyLeaseType.getText().toString(), et_propertyLocation.getText().toString(), et_propertySize.getText().toString(), et_propertyAmenities.getText().toString(), et_propertyDescription.getText().toString(), et_propertyBedrooms.getText().toString(), et_propertyBathrooms.getText().toString(), et_propertyPrice.getText().toString(), et_propertyDoors.getText().toString(), et_propertyWindows.getText().toString());
                    Toast.makeText(AddProperty.this, propertymodel.toString(), Toast.LENGTH_LONG).show();
                }
                catch (Exception e)
                {
                    Toast.makeText(AddProperty.this, "Error", Toast.LENGTH_SHORT).show();

                }
                DataBaseHelper dataBaseHelper = new DataBaseHelper(AddProperty.this);

                dataBaseHelper.addOne(propertymodel);


            }
        });



    }
}