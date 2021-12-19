package com.bytedance.android.live.u;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static int f12834a = 1000;

    /* renamed from: b  reason: collision with root package name */
    public static int f12835b = 60;

    /* renamed from: c  reason: collision with root package name */
    public static float f12836c = 16.666668f;

    /* renamed from: d  reason: collision with root package name */
    static long f12837d = -1;

    /* renamed from: e  reason: collision with root package name */
    static long f12838e = -1;

    static {
        Covode.recordClassIndex(7137);
    }

    public static float a() {
        if (b() > 0.0f) {
            return ((float) f12834a) / b();
        }
        return f12836c;
    }

    private static float b() {
        int i2;
        WindowManager windowManager = (WindowManager) a(y.e(), "window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            if (defaultDisplay != null) {
                return defaultDisplay.getRefreshRate();
            }
            i2 = f12835b;
        } else {
            i2 = f12835b;
        }
        return (float) i2;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(11118);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
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
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(11118);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
