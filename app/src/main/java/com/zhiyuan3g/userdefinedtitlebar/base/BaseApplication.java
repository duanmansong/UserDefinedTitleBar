package com.zhiyuan3g.userdefinedtitlebar.base;

import android.app.Application;
import android.content.Context;

import com.zhiyuan3g.userdefinedtitlebar.MainActivity;

/**用来初始化数据
 * Created by Administrator on 2016/8/11.
 */
public class BaseApplication extends Application {
    private static BaseApplication mApp;
    private static MainActivity mainActivity = null;

    @Override
    public void onCreate() {
        super.onCreate();
        mApp = (BaseApplication) getApplicationContext();

    }

    public static BaseApplication getSelf(){
        return mApp;
    }

    public static MainActivity getMainActivity() {
        return mainActivity;
    }

    public static void setMainActivity(MainActivity mainActivity) {
        BaseApplication.mainActivity = mainActivity;
    }
}
