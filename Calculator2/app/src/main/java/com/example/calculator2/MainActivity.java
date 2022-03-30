package com.example.calculator2;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv,btnSur;
    TextView textResult;
    String num1, num2;
    Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기(수정)");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnDiv = (Button) findViewById(R.id.BtnDiv);
        btnSur=(Button)findViewById(R.id.BtnSur);
        textResult = (TextView) findViewById(R.id.TextResult);



        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();

                if(num1.equals("")|| num2.equals("")) {
                   Toast.makeText(getApplicationContext(),"수를 입력하세요",Toast.LENGTH_SHORT).show();
                }

               else{
                result=Double.parseDouble(num1)+Double.parseDouble(num2);
                textResult.setText("계산 결과 : "+result.toString());
            }}
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                if(num1.length()==0 || num2.length()==0) {
                    Toast.makeText(getApplicationContext(),"수를 입력하세요",Toast.LENGTH_SHORT).show();
                }
                else{
                result=Double.parseDouble(num1)-Double.parseDouble(num2);
                textResult.setText("계산 결과 : "+result.toString());
            }}
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                if(num1.length()==0 || num2.length()== 0) {
                    Toast.makeText(getApplicationContext(),"수를 입력하세요",Toast.LENGTH_SHORT).show();
                }
              else{
                result=Double.parseDouble(num1)*Double.parseDouble(num2);
                textResult.setText("계산 결과 : "+result.toString());
            }}
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                if(num1.length()==0 || num2.length()==0) {
                    Toast.makeText(getApplicationContext(),"수를 입력하세요",Toast.LENGTH_SHORT).show();
                }
                else if(num2.equals("0")) {
                    Toast.makeText(getApplicationContext(),"0으로는 나눌 수 없어요",Toast.LENGTH_SHORT).show();
                }
              else{
                result=Double.parseDouble(num1)/Double.parseDouble(num2);
                textResult.setText("계산 결과 : "+result.toString());
            }}
        });
        btnSur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                if(num1.length()==0 || num2.length()==0) {
                    Toast.makeText(getApplicationContext(),"수를 입력하세요",Toast.LENGTH_SHORT).show();
                }

                else if(num2.equals("0")) {
                    Toast.makeText(getApplicationContext(),"0으로는 나눌 수 없어요",Toast.LENGTH_SHORT).show();
                }

              else{
                result=Double.parseDouble(num1)%Double.parseDouble(num2);
                textResult.setText("계산 결과 : "+result.toString());
            }}
        });

    }



    }
