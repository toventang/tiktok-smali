package com.ss.android.ugc.asve.f;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import java.lang.reflect.Field;
import java.util.Objects;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f62085a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(38160);
    }

    public static final boolean a(Context context) {
        l.d(context, "");
        int i2 = Build.VERSION.SDK_INT;
        Resources resources = context.getResources();
        l.b(resources, "");
        Configuration configuration = resources.getConfiguration();
        l.b(configuration, "");
        if (configuration.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public static final int b(Context context) {
        l.d(context, "");
        Object a2 = a(context, "window");
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) a2).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x;
    }

    public static final int c(Context context) {
        WindowManager windowManager;
        l.d(context, "");
        if (context instanceof Activity) {
            windowManager = ((Activity) context).getWindowManager();
            l.b(windowManager, "");
        } else {
            Object a2 = a(context, "window");
            Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.WindowManager");
            windowManager = (WindowManager) a2;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        int i2 = Build.VERSION.SDK_INT;
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(9296);
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
                    MethodCollector.o(9296);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
