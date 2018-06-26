package com.example.srirama.textproject;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView department;
    float s=50;
    String [] depart={"ece","me","cse","civil","aero","list1","list2","list3","4"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scroll);
    department=(ListView)findViewById(R.id.lvdpept);

        //noinspection deprecation
        ArrayAdapter list = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,depart){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                TextView textView = (TextView) super.getView(position, convertView, parent);
 textView.setTextColor(Color.GREEN);
                textView.setTextSize(s);

                return textView;
            }
        };
        department.setAdapter(list);
       department.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Toast.makeText(getApplicationContext(),depart[position].toString(),Toast.LENGTH_SHORT).show();
             //  Intent i1=new Intent(getApplicationContext(),text2.class);
             //  startActivity(i1);
           }
       });
    }


}
