package com.example.srirama.textproject;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;




/**
 * Created by srirama on 6/15/2018.
 */
public class customadapter extends ArrayAdapter<pojo> {
    private Context mycontext;
    private List<pojo>customlist=new ArrayList<>();

    public customadapter(@NonNull Context context, @LayoutRes ArrayList<pojo> list) {
        super(context,0,list);
        mycontext=context;
        customlist=list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nonnull View convertview, @Nonnull ViewGroup parent) {
        View listname=convertview;
        if(listname==null)
            listname= LayoutInflater.from(mycontext).inflate(R.layout.customview,parent,false);
        pojo currentname=customlist.get(position);
        TextView id=(TextView)listname.findViewById(R.id.tvid);

        id.setText(currentname.getmId());
        TextView name=(TextView)listname.findViewById(R.id.tvname);
        name.setText(currentname.getmName());
        return listname;
    }

    }

