package com.example.registration.medipast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView mFirstCardfView,mSecondCardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirstCardfView = findViewById(R.id.firstcardview);
        mSecondCardView = findViewById(R.id.secondcardview);

        mFirstCardfView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent adddoctorintent = new Intent(MainActivity.this,AddDoctorActivity.class);
                startActivity(adddoctorintent);
            }
        });

        mSecondCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showdoctorintent = new Intent(MainActivity.this,ShowDoctorActivity.class);
                startActivity(showdoctorintent);
            }
        });
    }
}
