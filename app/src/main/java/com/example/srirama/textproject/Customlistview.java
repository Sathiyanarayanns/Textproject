package com.example.srirama.textproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Customlistview extends AppCompatActivity {
    ListView customview;
    customadapter myadapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customlistview);
        customview=(ListView)findViewById(R.id.lvcustom);
        ArrayList a=new ArrayList();
        a.add(new pojo("sathiya",1));
        a.add(new pojo("ram",2));
        a.add(new pojo("krishna",3));
    myadapter=new customadapter(this,a);
        customview.setAdapter(myadapter);
    }
}
