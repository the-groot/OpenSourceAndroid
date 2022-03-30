package com.example.androidpicture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2;
    Switch switch2;
    RadioGroup rGroup1;
    RadioButton q,r,s;
    ImageView imgPet;
    Button exit,reset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진 보기 앱");

        text1 = (TextView) findViewById(R.id.Text1);
        text2 = (TextView) findViewById(R.id.Text2);
        switch2 = (Switch) findViewById(R.id.switch2);
        rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        q = (RadioButton) findViewById(R.id.Q);
        r = (RadioButton) findViewById(R.id.R);
        s = (RadioButton) findViewById(R.id.S);
        imgPet = (ImageView) findViewById(R.id.ImgPet);
        exit = (Button) findViewById(R.id.Exit);
        reset = (Button) findViewById(R.id.Reset);


    switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
            if(isChecked) {
                rGroup1.setVisibility(View.VISIBLE);
                text2.setVisibility(View.VISIBLE);
            }
            else{
                rGroup1.setVisibility(View.INVISIBLE);
                text2.setVisibility(View.INVISIBLE);
            }
        }
    });

    rGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int id) {
            if(id==R.id.Q){
                imgPet.setImageResource(R.drawable.android);
                imgPet.setVisibility(View.VISIBLE);
            }
            else if(id==R.id.R) {
                imgPet.setImageResource(R.drawable.ic_launcher2);
                imgPet.setVisibility(View.VISIBLE);
            }
            else if(id==R.id.S) {
                imgPet.setImageResource(R.drawable.ic_launcher);
                imgPet.setVisibility(View.VISIBLE);
            }
        }
    });


    exit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            System.exit(0);
        }
    });


    reset.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch2.setChecked(false);
        }
    });

    }
}