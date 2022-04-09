package com.example.project5_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1,edit2;
    Button btn1,btn2,btn3,btn4;
    TextView textresult;
    String num1,num2;
    Integer result;

    Button[] Numbuttons=new Button[10];
    Integer[] newBtnIDs = {R.id.btnnum0, R.id.btnnum1, R.id.btnnum2, R.id.btnnum3, R.id.btnnum4, R.id.btnnum5, R.id.btnnum6, R.id.btnnum7, R.id.btnnum8, R.id.btnnum9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setTitle("테이블 레이아웃 계산기");

        edit1 = (EditText)findViewById(R.id.edit1);
        edit2 = (EditText)findViewById(R.id.edit2);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);


        textresult = (TextView)findViewById(R.id.textresult);


        for(int i=0; i < newBtnIDs.length; i++) {
            Numbuttons[i] = (Button)findViewById(newBtnIDs[i]);
        }

        btn1.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {
                // TODO Auto-generated method stub

                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                result = Integer.parseInt(num1) + Integer.parseInt(num2);
                textresult.setText("계산 결과 :" + result.toString());
                return false;
            }
        });

        btn2.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {
                // TODO Auto-generated method stub

                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                textresult.setText("계산 결과 :" + result.toString());
                return false;
            }
        });

        btn3.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {
                // TODO Auto-generated method stub

                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                result = Integer.parseInt(num1) * Integer.parseInt(num2);
                textresult.setText("계산 결과 :" + result.toString());
                return false;
            }
        });

        btn4.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {
                // TODO Auto-generated method stub

                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                result = Integer.parseInt(num1) / Integer.parseInt(num2);
                textresult.setText("계산 결과 :" + result.toString());
                return false;
            }
        });


        for (int i=0; i < newBtnIDs.length; i++)
        {
            final int index;
            index = i;

            Numbuttons[index].setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    // TODO Auto-generated method stub

                    if (edit1.isFocused()==true)
                    {
                        num1= edit1.getText().toString() + Numbuttons[index].getText().toString();
                        edit1.setText(num1);
                    }
                    else if (edit2.isFocused()==true) {
                        num2 = edit2.getText().toString() + Numbuttons[index].getText().toString();
                        edit2.setText(num2);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "먼저 에디트 텍스트를 선택해주세요", 0).show();
                    }

                }
            });
        }

    }
}