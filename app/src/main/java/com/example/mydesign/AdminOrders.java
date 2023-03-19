package com.example.mydesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class AdminOrders extends AppCompatActivity {
private FirebaseFirestore db= FirebaseFirestore.getInstance();
    private FirebaseAuth auth=  FirebaseAuth.getInstance();
//    auth =  FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        DocumentReference docRef = db.collection("Orders").document(auth.getUid());

        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_orders);
    }
}