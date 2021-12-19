package com.bytedance.helios.sdk.utils;

import android.app.Service;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;

public class ServiceLifecycle {
    static {
        Covode.recordClassIndex(18001);
    }

    public static void onStartCommand(Service service, Intent intent, int i2, int i3) {
        a.a(service, new Object[]{intent, Integer.valueOf(i2), Integer.valueOf(i3)}, 102701, service.getClass().getName());
    }
}
