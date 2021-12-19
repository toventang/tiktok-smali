package com.bytedance.ies.common.push.account;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.ss.android.ugc.aweme.lancet.a.a;

public class AccountSyncService extends Service {

    /* renamed from: a  reason: collision with root package name */
    private static d f33137a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f33138b = new Object();

    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }

    static {
        Covode.recordClassIndex(19801);
    }

    public void onCreate() {
        MethodCollector.i(12833);
        synchronized (f33138b) {
            try {
                if (f33137a == null) {
                    Context applicationContext = getApplicationContext();
                    if (a.f107168c) {
                        if (applicationContext == null) {
                            applicationContext = a.f107166a;
                        }
                    }
                    f33137a = new d(applicationContext);
                }
            } finally {
                MethodCollector.o(12833);
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return f33137a.getSyncAdapterBinder();
    }
}
