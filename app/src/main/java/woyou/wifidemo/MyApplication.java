package woyou.wifidemo;

import android.app.Application;

import woyou.wifidemo.utils.WifiAdminUtils;

/**
 * Created by Xiho on 2016/2/1.
 */
public class MyApplication extends Application {
    protected static final String TAG = "MyApplication";

    private WifiAdminUtils mWifiAdmin;
    @Override
    public void onCreate() {
        super.onCreate();
        mWifiAdmin = new WifiAdminUtils(getApplicationContext());
    }

}
