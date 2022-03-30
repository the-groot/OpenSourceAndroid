package com.example.animalpicture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2;
    CheckBox chkAgree;
    RadioGroup rGroup1;
    RadioButton rdoCat, rdoDog, rdoTiger;
    ImageView imgPet;
    Button btnOK;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기 앱");

        text1 = (TextView) findViewById(R.id.Text1);
        text2 = (TextView) findViewById(R.id.Text2);
        chkAgree = (CheckBox) findViewById(R.id.ChkAgree);
        rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        rdoCat = (RadioButton) findViewById(R.id.RdoCat);
        rdoDog = (RadioButton) findViewById(R.id.RdoDog);
        rdoTiger = (RadioButton) findViewById(R.id.RdoTiger);
        imgPet = (ImageView) findViewById(R.id.ImgPet);
        btnOK = (Button) findViewById(R.id.BtnOK);


        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (chkAgree.isChecked() == true) {
                    text2.setVisibility(android.view.View.VISIBLE);
                    rGroup1.setVisibility(android.view.View.VISIBLE);
                    btnOK.setVisibility(android.view.View.VISIBLE);
                } else {
                    text2.setVisibility(android.view.View.INVISIBLE);
                    rGroup1.setVisibility(android.view.View.INVISIBLE);
                    btnOK.setVisibility(android.view.View.INVISIBLE);
                }
            }
        });


        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (rGroup1.getCheckedRadioButtonId()) {
                    case R.id.RdoDog:
                        imgPet.setImageResource(R.drawable.dog);
                        imgPet.setVisibility(android.view.View.VISIBLE);
                        break;
                    case R.id.RdoCat:
                        imgPet.setImageResource(R.drawable.cat);
                        imgPet.setVisibility(android.view.View.VISIBLE);
                        break;
                    case R.id.RdoTiger:
                        imgPet.setImageResource(R.drawable.tiger);
                        imgPet.setVisibility(android.view.View.VISIBLE);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "동물 먼저 선택하세요",
                                Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}