package com.lynx.tasm.utils;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public class DisplayMetricsHolder {

    /* renamed from: a  reason: collision with root package name */
    public static DisplayMetrics f57022a;

    /* renamed from: b  reason: collision with root package name */
    public static DisplayMetrics f57023b;

    /* renamed from: c  reason: collision with root package name */
    public static int f57024c = -1;

    /* renamed from: d  reason: collision with root package name */
    public static float f57025d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f57026e;

    public static native void nativeUpdateDevice(int i2, int i3, float f2, String str);

    static {
        Covode.recordClassIndex(35467);
    }

    public static synchronized DisplayMetrics a() {
        DisplayMetrics displayMetrics;
        synchronized (DisplayMetricsHolder.class) {
            MethodCollector.i(13026);
            displayMetrics = f57023b;
            MethodCollector.o(13026);
        }
        return displayMetrics;
    }

    public static DisplayMetrics a(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.setTo(f57022a);
        WindowManager windowManager = (WindowManager) a(context, "window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            int i2 = Build.VERSION.SDK_INT;
            defaultDisplay.getRealMetrics(displayMetrics);
            return displayMetrics;
        }
        throw new AssertionError("WindowManager is null!");
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(13025);
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
                    MethodCollector.o(13025);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
