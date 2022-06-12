package com.example.todoapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.firestore.FirebaseFirestore;

public class DetailActivity extends AppCompatActivity {
    private TextView nama,email;

    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        nama = findViewById(R.id.nama);
        email = findViewById(R.id.txtEmail);

        progressDialog = new ProgressDialog(DetailActivity.this);
        progressDialog.setTitle("Loading");
        progressDialog.setMessage("Mengambil data...");

        Intent intent = getIntent();
        if(intent != null){
            nama.setText(intent.getStringExtra("name"));
            email.setText(intent.getStringExtra("email"));
        }


    }
}
