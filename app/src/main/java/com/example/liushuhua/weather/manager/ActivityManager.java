package com.example.liushuhua.weather.manager;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiuShuHua on 2017/5/23.
 * description：
 */

public class ActivityManager {

    private static ActivityManager activityManager;
    private static List<Activity> list;

    private ActivityManager() {
    }

    public static ActivityManager getInstance() {
        if (activityManager == null) {
            activityManager = new ActivityManager();
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        return activityManager;
    }

    public void finishAllActivity() {
        for (Activity activity : list) {
            if (activity != null) {
                activity.finish();
            }
        }
        list.clear();
    }

    public void addActivityList(Activity activity) {
        if (activity == null) return;
        list.add(activity);
    }

    public void removeActivityList(Activity activity) {
        if (activity == null) return;
        list.remove(activity);
    }
}
