package com.ss.android.ugc.aweme.utils;

import android.app.KeyguardManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class gs {
    static {
        Covode.recordClassIndex(93606);
    }

    public static boolean a() {
        try {
            KeyguardManager keyguardManager = (KeyguardManager) a(d.a(), "keyguard");
            if (keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode()) {
                return false;
            }
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(564);
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
                    MethodCollector.o(564);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
