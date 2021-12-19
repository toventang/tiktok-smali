package com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.common;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.b;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.lang.reflect.Field;
import java.util.Objects;

public final class a implements b {
    static {
        Covode.recordClassIndex(52196);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.b
    public final boolean a() {
        return ActivityStack.isAppBackGround();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.b
    public final void b() {
        boolean z = f.f34637l;
        String.valueOf("pullAppToForeground: isAppBackground(" + z + ')');
        if (z) {
            Context a2 = d.a();
            Object a3 = a(a2, "activity");
            Objects.requireNonNull(a3, "null cannot be cast to non-null type android.app.ActivityManager");
            ActivityManager activityManager = (ActivityManager) a3;
            Activity topActivity = ActivityStack.getTopActivity();
            if (topActivity != null) {
                activityManager.moveTaskToFront(topActivity.getTaskId(), 0);
                return;
            }
            Intent launchIntentForPackage = a2.getPackageManager().getLaunchIntentForPackage(a2.getPackageName());
            if (launchIntentForPackage != null) {
                com.ss.android.ugc.tiktok.security.a.a.a(launchIntentForPackage, a2);
                a2.startActivity(launchIntentForPackage);
            }
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(2029);
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
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(2029);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
