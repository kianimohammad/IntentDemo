package com.f19.coursesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText db;
    EditText swift;
    EditText java;
    EditText ios;
    EditText android;

    double[] courses;
    ArrayList<Double> newCourses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = findViewById(R.id.db);
        swift = findViewById(R.id.swift);
        java = findViewById(R.id.java);
        android = findViewById(R.id.android);
        ios = findViewById(R.id.ios);

        courses = new double[5];
        newCourses = new ArrayList<>();

        Button btn = findViewById(R.id.calculate);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);

//                intent.putExtra("courses", getCourses());
//                intent.putExtra("average", average());
//                startActivity(intent);

                intent.putExtra("courses", getNewCourses());
                intent.putExtra("average", getAverage());
                startActivity(intent);
            }
        });
    }

    private double average() {
        double[] courses = getCourses();
        double sum = 0;
        for (int i=0; i < courses.length; i++)
            sum += courses[i];
        return sum / courses.length;
    }

    private double[] getCourses() {
        courses[0] = Double.valueOf(db.getText().toString());
        courses[1] = Double.valueOf(java.getText().toString());
        courses[2] = Double.valueOf(swift.getText().toString());
        courses[3] = Double.valueOf(ios.getText().toString());
        courses[4] = Double.valueOf(android.getText().toString());
        return courses;
    }

    private ArrayList<Double> getNewCourses() {
        newCourses.add(Double.valueOf(db.getText().toString()));
        newCourses.add(Double.valueOf(java.getText().toString()));
        newCourses.add(Double.valueOf(swift.getText().toString()));
        newCourses.add(Double.valueOf(ios.getText().toString()));
        newCourses.add(Double.valueOf(android.getText().toString()));
        return newCourses;
    }

    private double getAverage() {
        ArrayList<Double> newCourses = getNewCourses();
        double sum = 0;
        for(double course : newCourses) {
            sum += course;
        }
        return sum / newCourses.size();
    }
}
