package com.bytedance.ies.common.push.account;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;

public class AuthenticatorService extends Service {

    /* renamed from: a  reason: collision with root package name */
    private b f33139a;

    static {
        Covode.recordClassIndex(19802);
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }

    public void onCreate() {
        this.f33139a = new b(this);
    }

    public IBinder onBind(Intent intent) {
        return this.f33139a.getIBinder();
    }
}
