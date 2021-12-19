package com.ss.android.ugc.aweme.live.livehostimpl;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.core.app.i;
import com.bytedance.android.livesdkapi.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.ies.livehost_impl.R$drawable;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;

public class BgBroadcastService extends Service {
    private NotificationManager mNotificationManager;
    private a mService;

    static {
        Covode.recordClassIndex(69475);
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }

    public void onDestroy() {
        stopForeground(true);
        super.onDestroy();
        this.mService.onDestroy();
        this.mService.unBindService(this);
    }

    public void onCreate() {
        super.onCreate();
        this.mNotificationManager = (NotificationManager) com_ss_android_ugc_aweme_live_livehostimpl_BgBroadcastService_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(this, "notification");
        startForeground(R.id.cwu, buildNotification(this));
        a aVar = (a) com.bytedance.common.utility.reflect.a.a("com.bytedance.android.live.broadcast.bgbroadcast.BgBroadcastServiceImpl", new Object[0]);
        this.mService = aVar;
        aVar.bindService(this);
        this.mService.onCreate();
    }

    public IBinder onBind(Intent intent) {
        return this.mService;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mService.onConfigurationChanged(configuration);
    }

    private Notification buildNotification(Context context) {
        i.e eVar;
        if (Build.VERSION.SDK_INT >= 26 && this.mNotificationManager.getNotificationChannel("BgBroadcastService.notification") == null) {
            NotificationChannel notificationChannel = new NotificationChannel("BgBroadcastService.notification", getString(R.string.cxv), 3);
            notificationChannel.enableVibration(false);
            this.mNotificationManager.createNotificationChannel(notificationChannel);
        }
        Intent intent = new Intent();
        intent.setClassName("com.ss.android.ugc.aweme.live", "LiveBgBroadcastActivity");
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 134217728);
        if (Build.VERSION.SDK_INT >= 26) {
            eVar = new i.e(context, "BgBroadcastService.notification");
        } else {
            eVar = new i.e(context);
        }
        i.e a2 = eVar.a((CharSequence) getString(R.string.cy3)).a(R$drawable.icon);
        a2.a(2, true);
        i.e a3 = a2.a(System.currentTimeMillis());
        a3.f2183f = activity;
        a3.B = "service";
        a3.a(8, true);
        a3.b(true).a(2, true);
        if (Build.VERSION.SDK_INT >= 21) {
            eVar.E = 1;
        }
        return eVar.d();
    }

    public static Object com_ss_android_ugc_aweme_live_livehostimpl_BgBroadcastService_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(BgBroadcastService bgBroadcastService, String str) {
        Object obj;
        MethodCollector.i(825);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = bgBroadcastService.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = bgBroadcastService.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = bgBroadcastService.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(825);
                }
            }
        } else {
            obj = bgBroadcastService.getSystemService(str);
        }
        return obj;
    }
}
