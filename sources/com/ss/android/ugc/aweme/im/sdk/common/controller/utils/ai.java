package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import java.lang.reflect.Field;
import java.util.Objects;

public final class ai {

    /* renamed from: a  reason: collision with root package name */
    public static final ai f102395a = new ai();

    private ai() {
    }

    static {
        Covode.recordClassIndex(65539);
    }

    private static int f(Context context) {
        l.d(context, "");
        return c(context) - b(context);
    }

    public static final int a(Context context) {
        l.d(context, "");
        if (!d(context) || e(context)) {
            return 0;
        }
        return f(context);
    }

    private static boolean d(Context context) {
        l.d(context, "");
        if (c(context) != b(context)) {
            return true;
        }
        return false;
    }

    private static int b(Context context) {
        l.d(context, "");
        Object a2 = a(context, "window");
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) a2).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    private static int c(Context context) {
        l.d(context, "");
        Object a2 = a(context, "window");
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) a2).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    private static boolean e(Context context) {
        l.d(context, "");
        int i2 = Settings.Secure.getInt(context.getContentResolver(), "navigation_gesture_on", 0);
        int i3 = Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0);
        if (i2 == 0 && i3 == 0) {
            return false;
        }
        return true;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(4602);
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
                    MethodCollector.o(4602);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
