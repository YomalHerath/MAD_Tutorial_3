package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        final EditText editTextFirstValue = findViewById(R.id.et_first_num);
        final EditText editTextSecondValue = findViewById(R.id.et_second_num);
        Button button = findViewById(R.id.btn_ok);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int duration = Toast.LENGTH_SHORT;

                Context context = getApplicationContext();
                //The context to use. Usually your Application or Activity object
                CharSequence message = "You just clicked the OK button";
                //Display string
                int durations = Toast.LENGTH_SHORT; //How long the toast message will lasts
                Toast toast = Toast.makeText(context, message, durations);
                toast.show();

                toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 0);

                String ValueOne = editTextFirstValue.getText().toString();
                String ValueTwo = editTextSecondValue.getText().toString();

                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("Value_One",ValueOne);
                intent.putExtra("Value_Two",ValueTwo);
                startActivity(intent);
            }
        });
    }
}