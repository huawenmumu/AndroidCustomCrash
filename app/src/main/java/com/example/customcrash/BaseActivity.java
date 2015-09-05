package com.example.customcrash;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by linyt on 2015/9/5.
 */
public class BaseActivity  extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ExitAppUtils.getInstance().addActivity(this);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        ExitAppUtils.getInstance().delActivity(this);
    }
}
