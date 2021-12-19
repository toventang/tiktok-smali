package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.google.android.gms.auth.api.signin.internal.u;

public final class RevocationBoundService extends Service {
    static {
        Covode.recordClassIndex(31102);
    }

    public final int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }

    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) || "com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
            if (Log.isLoggable("RevocationService", 2)) {
                String valueOf = String.valueOf(intent.getAction());
                if (valueOf.length() != 0) {
                    "RevocationBoundService handling ".concat(valueOf);
                } else {
                    new String("RevocationBoundService handling ");
                }
            }
            return new u(this);
        }
        String valueOf2 = String.valueOf(intent.getAction());
        if (valueOf2.length() != 0) {
            "Unknown action sent to RevocationBoundService: ".concat(valueOf2);
            return null;
        }
        new String("Unknown action sent to RevocationBoundService: ");
        return null;
    }
}
