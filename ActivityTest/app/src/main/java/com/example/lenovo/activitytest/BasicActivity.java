package com.example.lenovo.activitytest;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Lenovo on 2018/1/23.
 * 用来查看当前类是哪一个类，每次进入活动，则会将活动的类名打印出来
 */

public class BasicActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //获得当期实例类名，通过Log打印出来
        Log.d("BaseActivity",getClass().getSimpleName());
    }


    @Override
    protected void onDestroy(){
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
