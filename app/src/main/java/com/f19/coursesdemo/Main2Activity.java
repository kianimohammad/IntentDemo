package com.f19.coursesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText db = findViewById(R.id.db2);
        EditText java = findViewById(R.id.java2);
        EditText swift = findViewById(R.id.swift2);
        EditText ios = findViewById(R.id.ios2);
        EditText android = findViewById(R.id.android2);

        TextView textView = findViewById(R.id.avg);


        Intent intent = getIntent();
        double avg = intent.getExtras().getDouble("average");
        ArrayList<Double> courses = (ArrayList<Double>) intent.getSerializableExtra("courses");

//        double[] courses = intent.getExtras().getDoubleArray("courses");
//        double[] courses = intent.getDoubleArrayExtra("courses");

//        db.setText(String.valueOf(courses[0]));
//        java.setText(String.valueOf(courses[1]));
//        swift.setText(String.valueOf(courses[2]));
//        ios.setText(String.valueOf(courses[3]));
//        android.setText(String.valueOf(courses[4]));


        db.setText(String.valueOf(courses.get(0)));
        java.setText(String.valueOf(courses.get(1)));
        swift.setText(String.valueOf(courses.get(2)));
        ios.setText(String.valueOf(courses.get(3)));
        android.setText(String.valueOf(courses.get(4)));

        textView.setText(String.valueOf(avg));

    }
}
