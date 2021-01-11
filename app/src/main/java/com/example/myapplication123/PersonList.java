package com.example.myapplication123;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PersonList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personlist);
        MyDBHelper dbHelper = new MyDBHelper(this, "Patient.db", null, 1);
        dbHelper.getWritableDatabase();
    }
}
