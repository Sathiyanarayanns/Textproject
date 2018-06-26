package com.example.srirama.textproject;

import java.util.Scanner;

/**
 * Created by srirama on 6/15/2018.
 */

public class pojo {

    private String mName;
    private int mId;
public pojo(String mName,int mId){
    this.mName=mName;
    this.mId=mId;
}
    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }


    public String getmId() {
        String id=String.valueOf(mId);
        return id;
    }

    public void setId(int mId) {

        this.mId = mId;
    }
}