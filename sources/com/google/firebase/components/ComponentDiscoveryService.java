package com.google.firebase.components;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;

public class ComponentDiscoveryService extends Service {
    static {
        Covode.recordClassIndex(33715);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }
}
