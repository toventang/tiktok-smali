package com.ss.android.socialbase.downloader.downloader;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.ss.android.socialbase.downloader.impls.d;
import com.ss.android.ugc.aweme.lancet.a.a;

public class SqlDownloadCacheService extends Service {

    /* renamed from: a  reason: collision with root package name */
    private static final String f60416a = SqlDownloadCacheService.class.getSimpleName();

    static {
        Covode.recordClassIndex(37335);
    }

    public void onCreate() {
        super.onCreate();
        Context applicationContext = getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        c.a(applicationContext);
    }

    public IBinder onBind(Intent intent) {
        v vVar;
        l q = c.q();
        if (q instanceof d) {
            vVar = ((d) q).f60617b;
        } else if (q instanceof v) {
            vVar = (v) q;
        } else {
            vVar = null;
        }
        if (vVar instanceof IBinder) {
            return (IBinder) vVar;
        }
        return new Binder();
    }

    public static void a(Context context, ServiceConnection serviceConnection) {
        if (context != null) {
            try {
                Intent intent = new Intent(context, SqlDownloadCacheService.class);
                if (serviceConnection != null) {
                    a(context, intent, serviceConnection);
                }
                a(context, intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.downloader.SqlDownloadCacheService.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        int onStartCommand = super.onStartCommand(intent, i2, i3);
        if (c.e()) {
            return 2;
        }
        return onStartCommand;
    }

    private static boolean a(Context context, Intent intent, ServiceConnection serviceConnection) {
        if (context == null || !(context instanceof Context)) {
            return context.bindService(intent, serviceConnection, 1);
        }
        if (com.ss.android.ugc.aweme.push.downgrade.d.a(context, intent)) {
            return true;
        }
        return context.bindService(intent, serviceConnection, 1);
    }
}
