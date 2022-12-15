package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView num1,num2,sign,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        sign=findViewById(R.id.sign);
        result=findViewById(R.id.result);

        String s1=getIntent().getStringExtra("num1");
        String s2=getIntent().getStringExtra("num2");
        String op=getIntent().getStringExtra("sign");

        int n1=Integer.parseInt(s1);
        int n2=Integer.parseInt(s2);
        int ans=0;
        if(op.equals("+")){
            ans=n1+n2;
        }
        else if(op.equals("-")){
            ans=n1-n2;
        }
        else if(op.equals("*")){
            ans=n1*n2;
        }
        else if(op.equals("/")){
            ans=n1/n2;
        }

        num1.setText(s1);
        num2.setText(s2);
        sign.setText(op);
        String answer=String.valueOf(ans);
        result.setText(answer);
    }
}