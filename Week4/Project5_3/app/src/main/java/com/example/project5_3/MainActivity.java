package com.example.project5_3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        LinearLayout baseLayout=new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        //baseLayout.setBackgroundColor(Color.rgb(0,255,0));
        setContentView(baseLayout,params);

        EditText text=new EditText(this);
        text.setText("IT Cookbook.Android.");

        baseLayout.addView(text);

        Button btn=new Button(this);
        btn.setText("버튼입니다");
        btn.setBackgroundColor(Color.YELLOW);
        baseLayout.addView(btn);

        TextView textview=new TextView(this);
        textview.setText("IT Cookbook.Android.");
        textview.setTextColor(Color.MAGENTA);
        textview.setTextSize(30);

        CheckBox check=new CheckBox(this);
        check.setText("2018038072 임상우");
        check.setTextSize(25);
        baseLayout.addView(check);


        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                baseLayout.addView(textview);
            }
        });


    }
}