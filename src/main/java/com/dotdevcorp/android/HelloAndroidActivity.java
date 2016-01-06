package com.dotdevcorp.android;

import android.view.Menu;
import com.blunderer.materialdesignlibrary.activities.Activity;
import com.blunderer.materialdesignlibrary.handlers.ActionBarDefaultHandler;
import com.blunderer.materialdesignlibrary.handlers.ActionBarHandler;

public class HelloAndroidActivity extends Activity {

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected boolean enableActionBarShadow() {
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(com.dotdevcorp.android.R.menu.main, menu);
        return true;
    }

    @Override
    protected ActionBarHandler getActionBarHandler() {
        return new ActionBarDefaultHandler(this);
    }
}