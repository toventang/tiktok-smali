package com.bytedance.ies.xelement.pickview.b;

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
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import h.m.a;
import h.m.p;
import h.w;
import java.lang.reflect.Field;

public final class e {
    static {
        Covode.recordClassIndex(22466);
    }

    private static final int a(Context context) {
        Object b2;
        WindowManager windowManager;
        Display display = null;
        if (context instanceof Activity) {
            windowManager = ((Activity) context).getWindowManager();
        } else if (context == null || (b2 = b(context, "window")) == null) {
            throw new w("null cannot be cast to non-null type");
        } else {
            windowManager = (WindowManager) b2;
        }
        if (windowManager != null) {
            display = windowManager.getDefaultDisplay();
        }
        if (display == null) {
            return 0;
        }
        try {
            Point point = new Point();
            display.getSize(point);
            return point.x;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static final Long a(String str) {
        l.c(str, "");
        if (!p.b(str, "#", false)) {
            return null;
        }
        String a2 = p.a(str, "#", "", false);
        if (a2.length() != 8 && a2.length() != 6) {
            return null;
        }
        if (a2.length() == 6) {
            a2 = a2 + "FF";
        }
        try {
            long parseLong = Long.parseLong(a2, a.a(16));
            return Long.valueOf(((parseLong >> 8) & 16777215) | ((parseLong << 24) & 4278190080L));
        } catch (Exception unused) {
            return null;
        }
    }

    public static final int a(Context context, String str) {
        float f2;
        float f3;
        l.c(str, "");
        if (p.c(str, "rpx", false)) {
            try {
                f2 = (Float.parseFloat(p.a(str, "rpx", "", false)) * ((float) a(context))) / 750.0f;
            } catch (Exception unused) {
                return 0;
            }
        } else {
            if (p.c(str, "px", false)) {
                String a2 = p.a(str, "px", "", false);
                if (context == null) {
                    l.a();
                    f3 = 2.0f;
                } else {
                    Resources resources = context.getResources();
                    l.a((Object) resources, "");
                    f3 = resources.getDisplayMetrics().density;
                }
                try {
                    f2 = Float.parseFloat(a2) * f3;
                } catch (Exception unused2) {
                }
            }
            return 0;
        }
        return (int) f2;
    }

    private static Object b(Context context, String str) {
        Object obj;
        MethodCollector.i(3307);
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
                            c.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(3307);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
