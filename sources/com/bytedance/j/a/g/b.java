package com.bytedance.j.a.g;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.LLog;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import h.w;
import java.lang.reflect.Field;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static int f39057a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f39058b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(23911);
    }

    public static int a(Context context) {
        l.c(context, "");
        Display c2 = c(context);
        int i2 = 0;
        if (c2 == null) {
            return 0;
        }
        try {
            Point point = new Point();
            c2.getSize(point);
            i2 = point.y;
            return i2;
        } catch (Exception e2) {
            LLog.d("DevicesUtil", e2.getMessage());
            return i2;
        }
    }

    public static int b(Context context) {
        l.c(context, "");
        Display c2 = c(context);
        int i2 = 0;
        if (c2 == null) {
            return 0;
        }
        try {
            Point point = new Point();
            c2.getSize(point);
            i2 = point.x;
            return i2;
        } catch (Exception e2) {
            LLog.d("DevicesUtil", e2.getMessage());
            return i2;
        }
    }

    private static Display c(Context context) {
        WindowManager windowManager;
        if (context instanceof Activity) {
            windowManager = ((Activity) context).getWindowManager();
        } else {
            Object a2 = a(context, "window");
            if (a2 != null) {
                windowManager = (WindowManager) a2;
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        }
        if (windowManager != null) {
            return windowManager.getDefaultDisplay();
        }
        return null;
    }

    public static int a(double d2, Context context) {
        l.c(context, "");
        Resources resources = context.getResources();
        l.a((Object) resources, "");
        double d3 = (double) resources.getDisplayMetrics().density;
        Double.isNaN(d3);
        return (int) ((d2 / d3) + 0.5d);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(3169);
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
                            c.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(3169);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
