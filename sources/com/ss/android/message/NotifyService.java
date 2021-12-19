package com.ss.android.message;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.push.a.a;
import com.bytedance.push.third.g;
import com.ss.android.pushmanager.a.b;

public class NotifyService extends Service {
    static {
        Covode.recordClassIndex(36970);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        a.a(a(this)).a();
        d.a().a(new Runnable() {
            /* class com.ss.android.message.NotifyService.AnonymousClass1 */

            static {
                Covode.recordClassIndex(36971);
            }

            public final void run() {
                try {
                    g.a().a(NotifyService.a(NotifyService.this));
                } catch (Throwable unused) {
                }
            }
        }, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        try {
            g.a().b();
        } catch (Exception e2) {
            try {
                e2.printStackTrace();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    public static Context a(NotifyService notifyService) {
        Context applicationContext = notifyService.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public int onStartCommand(final Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        int onStartCommand = super.onStartCommand(intent, i2, i3);
        Logger.debug();
        d.a().a(new Runnable() {
            /* class com.ss.android.message.NotifyService.AnonymousClass2 */

            static {
                Covode.recordClassIndex(36972);
            }

            public final void run() {
                try {
                    g.a().a(intent);
                } catch (Throwable unused) {
                }
            }
        }, 0);
        b.AbstractC1307b bVar = (b.AbstractC1307b) com.ss.android.ug.bus.b.a(b.AbstractC1307b.class);
        if (bVar == null || bVar.g()) {
            return 2;
        }
        return onStartCommand;
    }
}
