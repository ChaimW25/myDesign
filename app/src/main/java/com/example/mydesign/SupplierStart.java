package com.example.mydesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SupplierStart extends AppCompatActivity {

    private Button sign_up; // for new user
    private Button sign_in; // for exist user

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.supplier_start);
        sign_up = findViewById(R.id.sign_up);
        sign_in = findViewById(R.id.sign_in);
        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SupplierStart.this, SupplierSignIn.class));
            }
        });
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SupplierStart.this, SupplierSignUp.class));
            }
        });

    }
}