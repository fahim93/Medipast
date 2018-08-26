package com.example.registration.medipast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.shashank.sony.fancytoastlib.FancyToast;

public class AddDoctorActivity extends AppCompatActivity {

    EditText mDoctorName,mDegree,mSpecialization,mOfficeLocation,mEmail,mMobileNumber;
    Button mAddDoctor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_doctor);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mAddDoctor = findViewById(R.id.btn_add_doctor);
        mDoctorName = findViewById(R.id.et_doctor_name);
        mDegree = findViewById(R.id.et_degree);
        mSpecialization = findViewById(R.id.et_specialization);
        mOfficeLocation = findViewById(R.id.et_office_location);
        mEmail = findViewById(R.id.et_email);
        mMobileNumber = findViewById(R.id.et_mobile_Number);




        mAddDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              FancyToast.makeText(getApplicationContext(), "Doctor added Successfully", FancyToast.LENGTH_LONG, FancyToast.SUCCESS, false).show();
            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id ==android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
