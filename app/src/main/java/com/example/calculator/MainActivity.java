package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText number1,number2,operator;
    private Button Button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1=findViewById(R.id.num1);
        number2=findViewById(R.id.num2);
        operator=findViewById(R.id.sign);
        Button=findViewById(R.id.button);
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=number1.getText().toString();
                String num2=number2.getText().toString();
                String sign=operator.getText().toString();
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("num1",num1);
                intent.putExtra("num2",num2);
                intent.putExtra("sign",sign);
                startActivity(intent);
            }
        });
    }
}