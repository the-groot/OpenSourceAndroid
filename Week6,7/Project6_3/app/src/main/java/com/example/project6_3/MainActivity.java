package com.example.project6_3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost=getTabHost();
        TabHost.TabSpec tabSpecdog=tabHost.newTabSpec("dog").setIndicator("강아지");
        tabSpecdog.setContent(R.id.DOG);
        tabHost.addTab(tabSpecdog);
        TabHost.TabSpec tabSpeccat=tabHost.newTabSpec("cat").setIndicator("고양이");
        tabSpeccat.setContent(R.id.CAT);
        tabHost.addTab(tabSpeccat);
        TabHost.TabSpec tabSpecrab=tabHost.newTabSpec("rab").setIndicator("토끼");
        tabSpecrab.setContent(R.id.RAB);
        tabHost.addTab(tabSpecrab);
        TabHost.TabSpec tabSpeclion=tabHost.newTabSpec("lion").setIndicator("호랑이");
        tabSpeclion.setContent(R.id.LION);
        tabHost.addTab(tabSpeclion);
        tabHost.setCurrentTab(0);
    }
}