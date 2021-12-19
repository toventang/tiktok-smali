package com.bytedance.ies.dmt.ui.f;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static int f33484a;

    /* renamed from: b  reason: collision with root package name */
    private static int f33485b;

    static {
        Covode.recordClassIndex(19972);
    }

    public static int c(Context context) {
        int i2 = f33485b;
        if (i2 != 0) {
            return i2;
        }
        int i3 = f33484a;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        f33484a = displayMetrics.widthPixels;
        f33485b = displayMetrics.heightPixels;
        return f33485b;
    }

    public static int a(Context context) {
        int i2 = f33484a;
        if (i2 != 0) {
            return i2;
        }
        WindowManager windowManager = (WindowManager) a(context, "window");
        if (windowManager != null) {
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            f33484a = point.x;
            f33485b = point.y;
        }
        if (f33484a == 0 || f33485b == 0) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f33484a = displayMetrics.widthPixels;
            f33485b = displayMetrics.heightPixels;
        }
        return f33484a;
    }

    public static int b(Context context) {
        int i2 = f33485b;
        if (i2 != 0) {
            return i2;
        }
        WindowManager windowManager = (WindowManager) a(context, "window");
        if (windowManager != null) {
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            f33484a = point.x;
            f33485b = point.y;
        }
        if (f33484a == 0 || f33485b == 0) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f33484a = displayMetrics.widthPixels;
            f33485b = displayMetrics.heightPixels;
        }
        return f33485b;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(8678);
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
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(8678);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
