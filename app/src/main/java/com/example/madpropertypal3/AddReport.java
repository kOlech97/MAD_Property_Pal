package com.example.madpropertypal3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddReport extends AppCompatActivity {
    EditText et_day, et_month, et_year, et_interest, et_offerPrice, et_expiryDay, et_expiryMonth, et_expiryYear, et_conditions, et_comments;
    Button btn_saveReport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_report);
        et_day = findViewById(R.id.et_day);
        et_month = findViewById(R.id.et_month);
        et_year=findViewById(R.id.et_year);
        et_interest=findViewById(R.id.et_interest);
        et_offerPrice=findViewById(R.id.et_offerPrice);
        et_expiryDay=findViewById(R.id.et_expiryDay);
        et_expiryMonth=findViewById(R.id.et_expiryMonth);
        et_expiryYear=findViewById(R.id.et_expiryYear);
        et_conditions=findViewById(R.id.et_conditions);
        et_comments=findViewById(R.id.et_comments);
        btn_saveReport=findViewById(R.id.btn_saveReport);

        btn_saveReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ReportModel reportmodel= new ReportModel();
                SelectProperty name1 = new SelectProperty();
                String proName = name1.proName;

                try {



                    reportmodel = new ReportModel(-1, et_day.getText().toString(), et_month.getText().toString(), et_year.getText().toString(), et_interest.getText().toString(), et_offerPrice.getText().toString(), et_expiryDay.getText().toString(), et_expiryMonth.getText().toString(), et_expiryYear.getText().toString(), et_conditions.getText().toString(), et_comments.getText().toString());
                   // reportmodel = new ReportModel(-1, et_day.getText().toString(), et_month.getText().toString(), et_year.getText().toString(), et_interest.getText().toString(), et_offerPrice.getText().toString(), et_expiryDay.getText().toString(), et_expiryMonth.getText().toString(), et_expiryYear.getText().toString(), et_conditions.getText().toString(), proName)

                    Toast.makeText(AddReport.this, reportmodel.toString(), Toast.LENGTH_SHORT).show();


                }catch (Exception e)
                {
                    Toast.makeText(AddReport.this, "FAIL", Toast.LENGTH_SHORT).show();
                }
                DataBaseHelper databasehelper = new DataBaseHelper(AddReport.this);
                boolean success = databasehelper.addRep(reportmodel);
                Toast.makeText(name1, "WORKS" + success, Toast.LENGTH_SHORT).show();

            }
        });

    }
}