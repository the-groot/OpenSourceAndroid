package com.example.twoimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageview5;
    ImageView imageview7;
    Button button6;
    Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         imageview5=(ImageView)findViewById(R.id.imageView5);
         imageview7=(ImageView)findViewById(R.id.imageView7);
         button6=(Button)findViewById(R.id.Button6);
         button7=(Button)findViewById(R.id.Button7);



        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageview5.setImageResource(R.drawable.sangwoo);
                imageview7.setImageResource(0);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageview7.setImageResource(R.drawable.sangwoo);
                imageview5.setImageResource(0);
            }
        });


    }
}





