package com.ss.android.ugc.trill.account;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;

public class TiktokAuthService extends Service {
    static {
        Covode.recordClassIndex(98954);
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }

    public IBinder onBind(Intent intent) {
        return new a(this).getIBinder();
    }
}
