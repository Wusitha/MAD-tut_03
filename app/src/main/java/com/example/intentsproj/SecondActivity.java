package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    int no1, no2;
    float results;
    TextView num1, num2, result;
    Button add, sub, mul, div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);

        no1 = getIntent().getIntExtra("num1", 0);
        no2 = getIntent().getIntExtra("num2", 0);

        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.dev);

        num1.setText(String.valueOf(no1));
        num2.setText(String.valueOf(no2));

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                results = no1 + no2;
                result.setText(String.valueOf(no1) + " + " + no2 + " = " + String.valueOf(results));

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                results = no1 - no2;
                result.setText(String.valueOf(no1) + " - " + no2 + " = " + String.valueOf(results));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                results = no1 * no2;
                result.setText(String.valueOf(no1) + " * "+ no2 + " = " + String.valueOf(results));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                results = (float) no1 / no2;
                result.setText(String.valueOf(no1) + " / " + no2 + " = " + String.valueOf(results));
            }
        });


    }
}