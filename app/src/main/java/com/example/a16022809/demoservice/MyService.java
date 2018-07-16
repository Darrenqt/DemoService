package com.example.a16022809.demoservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int statId) {
        boolean started = false;
        if (started == false) {
            Log.d("Service", "Service started");
        }
        return super.onStartCommand(intent, flags, statId);
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
    }
}
