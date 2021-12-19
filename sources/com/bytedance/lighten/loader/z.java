package com.bytedance.lighten.loader;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.e;
import com.bytedance.platform.godzilla.b.b.b;
import com.facebook.drawee.f.e;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
public final class z {
    static {
        Covode.recordClassIndex(24688);
    }

    static e.a a(e.c cVar) {
        if (cVar == e.c.OVERLAY_COLOR) {
            return e.a.OVERLAY_COLOR;
        }
        return e.a.BITMAP_ONLY;
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(11865);
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
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(11865);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
