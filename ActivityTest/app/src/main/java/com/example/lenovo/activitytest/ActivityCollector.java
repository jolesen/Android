package com.example.lenovo.activitytest;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 2018/1/23.
 * 活动管理器
 */

public class ActivityCollector {
    //List暂存活动
    public static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity) {
        activities.add(activity);
    }
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    public static void finishAll(){
        for(Activity activity:activities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
