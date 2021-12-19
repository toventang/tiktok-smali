package com.ss.android.push;

import android.app.IntentService;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;

public class DefaultService extends IntentService {
    static {
        Covode.recordClassIndex(37114);
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }

    public DefaultService() {
        super("DefaultService");
    }

    public IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }
}
