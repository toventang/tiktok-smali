package com.ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
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
import com.ss.android.ugc.aweme.utils.i;
import java.lang.reflect.Field;

public final class dh {

    /* renamed from: a  reason: collision with root package name */
    private static int f126457a;

    static {
        Covode.recordClassIndex(82953);
    }

    public static int a(Context context) {
        if (context == null) {
            return 0;
        }
        return a(h(context));
    }

    public static int b(Context context) {
        if (context == null) {
            return 0;
        }
        return b(h(context));
    }

    public static int e(Context context) {
        if (context == null) {
            return 0;
        }
        return c(h(context));
    }

    private static int a(Display display) {
        if (display == null) {
            return 0;
        }
        Point point = new Point();
        display.getSize(point);
        return point.y;
    }

    private static int b(Display display) {
        if (display == null) {
            return 0;
        }
        Point point = new Point();
        display.getSize(point);
        return point.x;
    }

    public static int c(Context context) {
        int i2 = f126457a;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = context.getResources();
        int i3 = 0;
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i3 = resources.getDimensionPixelSize(identifier);
        }
        f126457a = i3;
        return i3;
    }

    public static boolean f(Context context) {
        try {
            int e2 = e(context);
            if (((double) (((float) e2) / context.getResources().getDisplayMetrics().density)) < 690.5d) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    private static Display h(Context context) {
        WindowManager windowManager;
        if (context instanceof Activity) {
            windowManager = ((Activity) context).getWindowManager();
        } else {
            windowManager = (WindowManager) a(context, "window");
        }
        return windowManager.getDefaultDisplay();
    }

    private static int c(Display display) {
        if (display == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        int i2 = Build.VERSION.SDK_INT;
        display.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int d(Context context) {
        int i2;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            i2 = resources.getDimensionPixelSize(identifier);
        } else {
            i2 = 0;
        }
        Rect rect = new Rect();
        Activity a2 = i.a(context);
        if (a2 != null) {
            a2.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            return Math.min(Math.max((e(context) - c(context)) - rect.height(), 0), i2);
        } else if (!g(context)) {
            return 0;
        } else {
            return i2;
        }
    }

    private static boolean g(Context context) {
        boolean z;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        if (identifier <= 0 || !resources.getBoolean(identifier)) {
            z = false;
        } else {
            z = true;
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", String.class).invoke(cls, "qemu.hw.mainkeys");
            if ("0".equals(str)) {
                return true;
            }
            if ("1".equals(str)) {
                return false;
            }
            return z;
        } catch (Exception unused) {
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(6259);
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
                    MethodCollector.o(6259);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
