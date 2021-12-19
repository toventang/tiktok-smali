package com.ss.android.ugc.aweme.base.utils;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static int f68432a = -1;

    /* renamed from: b  reason: collision with root package name */
    private static int f68433b = -1;

    /* renamed from: c  reason: collision with root package name */
    private static int f68434c = -1;

    /* renamed from: d  reason: collision with root package name */
    private static int f68435d = -1;

    static {
        Covode.recordClassIndex(42135);
    }

    public static int b() {
        Resources resources = d.a().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int c() {
        Resources resources = d.a().getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int[] a() {
        DisplayMetrics displayMetrics = d.a().getResources().getDisplayMetrics();
        return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
    }

    public static int c(Context context) {
        int b2 = b(context);
        int a2 = a(context);
        return b2 > a2 ? a2 : b2;
    }

    public static int a(Context context) {
        int i2 = f68433b;
        if (i2 > 0) {
            return i2;
        }
        if (context == null) {
            return 0;
        }
        g(context);
        int i3 = f68433b;
        if (i3 > 0) {
            return i3;
        }
        return 0;
    }

    public static int e(Context context) {
        Resources resources;
        int identifier;
        if (h(context) && (identifier = (resources = context.getResources()).getIdentifier("navigation_bar_height", "dimen", "android")) > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int b(Context context) {
        int i2 = f68432a;
        if (i2 > 0) {
            return i2;
        }
        if (context == null) {
            return 0;
        }
        g(context);
        int i3 = f68432a;
        if (i3 > 0) {
            return i3;
        }
        return 0;
    }

    public static int d(Context context) {
        if (context == null) {
            return 0;
        }
        int i2 = Build.VERSION.SDK_INT;
        WindowManager windowManager = (WindowManager) a(context, "window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            int i3 = displayMetrics.widthPixels;
            int i4 = displayMetrics.heightPixels;
            if (i3 > i4) {
                i3 = i4;
            }
            if (i3 != 0) {
                return i3;
            }
        }
        return b(context);
    }

    private static void g(Context context) {
        if (context != null) {
            try {
                WindowManager windowManager = (WindowManager) a(context, "window");
                if (windowManager != null) {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    if (defaultDisplay != null) {
                        int i2 = Build.VERSION.SDK_INT;
                        defaultDisplay.getRealSize(point);
                        f68433b = point.y;
                        f68432a = point.x;
                        return;
                    }
                    return;
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                f68433b = displayMetrics.heightPixels;
                f68432a = displayMetrics.widthPixels;
            } catch (Exception unused) {
            }
        }
    }

    public static int f(Context context) {
        WindowManager windowManager;
        if (context instanceof Activity) {
            windowManager = ((Activity) context).getWindowManager();
        } else {
            windowManager = (WindowManager) a(context, "window");
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            return displayMetrics.heightPixels;
        } catch (Exception e2) {
            int a2 = a(context);
            e2.printStackTrace();
            return a2;
        }
    }

    private static boolean h(Context context) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", String.class).invoke(cls, "qemu.hw.mainkeys");
            if ("1".equals(str)) {
                return false;
            }
            if ("0".equals(str)) {
                return true;
            }
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
            if (identifier > 0) {
                return resources.getBoolean(identifier);
            }
            return false;
        } catch (Exception unused) {
        }
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(879);
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
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(879);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
