package com.ss.android.newmedia.redbadge;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.ss.android.message.d;
import com.ss.android.pushmanager.a.b;

public class RedBadgePushProcessService extends Service {
    static {
        Covode.recordClassIndex(37065);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        final Bundle bundle;
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        if (intent != null) {
            bundle = a(intent);
        } else {
            bundle = null;
        }
        final b.AbstractC1307b a2 = b.a();
        d.a().a(new Runnable() {
            /* class com.ss.android.newmedia.redbadge.RedBadgePushProcessService.AnonymousClass1 */

            static {
                Covode.recordClassIndex(37066);
            }

            public final void run() {
                b.AbstractC1307b bVar;
                com.ss.android.pushmanager.b a2;
                if (bundle != null && (bVar = a2) != null && (a2 = bVar.a()) != null) {
                    if (bundle.getBoolean("app_entrance")) {
                        Logger.debug();
                        c a3 = c.a(a2);
                        if (a3.f60023e) {
                            a3.f60022d.sendEmptyMessage(1);
                        }
                    } else if (bundle.getBoolean("app_exit")) {
                        Logger.debug();
                        c a4 = c.a(a2);
                        if (a4.f60023e) {
                            a4.f60022d.sendEmptyMessage(2);
                        }
                    }
                }
            }
        }, 0);
        int onStartCommand = super.onStartCommand(intent, i2, i3);
        if (a2 == null || a2.g()) {
            return 2;
        }
        return onStartCommand;
    }
}
