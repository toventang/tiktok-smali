package com.ss.android.ugc.aweme.setting.utils;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.di.push.a;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.Objects;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f123043a = new k();

    private k() {
    }

    static {
        Covode.recordClassIndex(80800);
    }

    public static boolean a(String str) {
        NotificationChannel notificationChannel;
        String realChannelId = a.a().getRealChannelId(str);
        Object a2 = a(d.a(), "notification");
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) a2;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = notificationManager.getNotificationChannel(realChannelId)) == null || notificationChannel.getImportance() != 0) {
            return true;
        }
        return false;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(7280);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
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
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(7280);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
