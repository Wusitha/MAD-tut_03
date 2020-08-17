package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    EditText number1, number2;
    Button buttonOK;
    int no1, no2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOK = (Button) findViewById(R.id.button);
        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //toast message
                Context context = getApplicationContext();
                CharSequence message = "You just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context,message,duration);
                toast.show();

                number1 = findViewById(R.id.num1);
                number2 = findViewById(R.id.num2);
                no1 = Integer.parseInt(number1.getText().toString());
                no2 = Integer.parseInt(number2.getText().toString());

                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("num1", no1);
                intent.putExtra("num2", no2);
                startActivity(intent);
            }
        });
    }
}