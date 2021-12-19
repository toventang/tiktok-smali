package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.google.android.play.core.b.b;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public class AssetPackExtractionService extends Service {

    /* renamed from: a  reason: collision with root package name */
    Context f52754a;

    /* renamed from: b  reason: collision with root package name */
    cw f52755b;

    /* renamed from: c  reason: collision with root package name */
    ac f52756c;

    /* renamed from: d  reason: collision with root package name */
    private final b f52757d = new b("AssetPackExtractionService");

    /* renamed from: e  reason: collision with root package name */
    private aa f52758e;

    /* renamed from: f  reason: collision with root package name */
    private NotificationManager f52759f;

    static {
        Covode.recordClassIndex(32661);
    }

    private final synchronized void b(Bundle bundle) {
        MethodCollector.i(6147);
        String string = bundle.getString("notification_title");
        String string2 = bundle.getString("notification_subtext");
        long j2 = bundle.getLong("notification_timeout");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("notification_on_click_intent");
        Notification.Builder timeoutAfter = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(this.f52754a, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j2) : new Notification.Builder(this.f52754a).setPriority(-2);
        if (pendingIntent != null) {
            timeoutAfter.setContentIntent(pendingIntent);
        }
        timeoutAfter.setSmallIcon(17301633).setOngoing(false).setContentTitle(string).setSubText(string2);
        if (Build.VERSION.SDK_INT >= 21) {
            timeoutAfter.setColor(bundle.getInt("notification_color")).setVisibility(-1);
        }
        Notification build = timeoutAfter.build();
        this.f52757d.d("Starting foreground service.", new Object[0]);
        this.f52755b.a(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f52759f.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", bundle.getString("notification_channel_name"), 2));
        }
        startForeground(-1883842196, build);
        MethodCollector.o(6147);
    }

    public final synchronized Bundle a(Bundle bundle) {
        Bundle bundle2;
        MethodCollector.i(6136);
        int i2 = bundle.getInt("action_type");
        b bVar = this.f52757d;
        Integer valueOf = Integer.valueOf(i2);
        bVar.a("updateServiceState: %d", valueOf);
        if (i2 == 1) {
            b(bundle);
        } else if (i2 == 2) {
            a();
        } else {
            this.f52757d.b("Unknown action type received: %d", valueOf);
        }
        bundle2 = new Bundle();
        MethodCollector.o(6136);
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        MethodCollector.i(6151);
        this.f52757d.d("Stopping service.", new Object[0]);
        this.f52755b.a(false);
        stopForeground(true);
        stopSelf();
        MethodCollector.o(6151);
    }

    public final IBinder onBind(Intent intent) {
        return this.f52758e;
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(6130);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(6130);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public final void onCreate() {
        super.onCreate();
        this.f52757d.a("onCreate", new Object[0]);
        Context applicationContext = getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        bw.a(applicationContext).a(this);
        this.f52758e = new aa(this.f52754a, this, this.f52756c);
        this.f52759f = (NotificationManager) a(this.f52754a, "notification");
    }
}
