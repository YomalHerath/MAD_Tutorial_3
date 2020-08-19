package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String ValueOne = intent.getStringExtra("Value_One");
        String ValueTwo = intent.getStringExtra("Value_Two");

        final EditText editTextFirstValue = findViewById(R.id.et_first_num);
        editTextFirstValue.setText(ValueOne);
        final EditText editTextSecondValue = findViewById(R.id.et_second_num);
        editTextSecondValue.setText(ValueTwo);
        Button buttonAdd = findViewById(R.id.btn_add);
        Button buttonSub = findViewById(R.id.btn_sub);
        Button buttonDiv = findViewById(R.id.btn_div);
        Button buttonMulti = findViewById(R.id.btn_multi);
        final TextView textViewSolution = findViewById(R.id.tv_result);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstValue = editTextFirstValue.getText().toString();
                String secondValue = editTextSecondValue.getText().toString();
                int solution = Integer.valueOf(firstValue) + Integer.valueOf(secondValue);
                textViewSolution.setText(String.valueOf(firstValue+" + "+secondValue+" = "+solution));
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstValue = editTextFirstValue.getText().toString();
                String secondValue = editTextSecondValue.getText().toString();
                int solution = Integer.valueOf(firstValue) - Integer.valueOf(secondValue);
                textViewSolution.setText(String.valueOf(firstValue+" - "+secondValue+" = "+solution));
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstValue = editTextFirstValue.getText().toString();
                String secondValue = editTextSecondValue.getText().toString();
                int solution = Integer.valueOf(firstValue) / Integer.valueOf(secondValue);
                textViewSolution.setText(String.valueOf(firstValue+" / "+secondValue+" = "+solution));
            }
        });

        buttonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstValue = editTextFirstValue.getText().toString();
                String secondValue = editTextSecondValue.getText().toString();
                int solution = Integer.valueOf(firstValue) * Integer.valueOf(secondValue);
                textViewSolution.setText(String.valueOf(firstValue+" * "+secondValue+" = "+solution));
            }
        });
    }
}