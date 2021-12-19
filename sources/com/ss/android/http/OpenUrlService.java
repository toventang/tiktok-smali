package com.ss.android.http;

import android.app.IntentService;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;

public class OpenUrlService extends IntentService {
    static {
        Covode.recordClassIndex(36751);
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }

    public OpenUrlService() {
        super("OpenUrlService");
    }
}
