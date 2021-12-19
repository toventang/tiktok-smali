package com.bytedance.common.utility;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f26920a;

    /* renamed from: b  reason: collision with root package name */
    private static int f26921b;

    /* renamed from: c  reason: collision with root package name */
    private static int f26922c = -1;

    /* renamed from: d  reason: collision with root package name */
    private static int f26923d = -1;

    /* renamed from: e  reason: collision with root package name */
    private static final Map<String, String> f26924e = new HashMap();

    static {
        Covode.recordClassIndex(15885);
    }

    private static boolean a() {
        Boolean bool = f26920a;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        try {
            Method declaredMethod = Build.class.getDeclaredMethod("getString", String.class);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, "ro.build.version.emui");
            if ((invoke instanceof String) && !m.a((String) invoke) && !"unknown".equals((String) invoke)) {
                z = true;
            }
        } catch (Throwable unused) {
        }
        f26920a = Boolean.valueOf(z);
        return z;
    }

    public static int a(Context context) {
        int i2;
        int i3 = f26921b;
        if (i3 > 0) {
            return i3;
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0 || (i2 = context.getResources().getDimensionPixelSize(identifier)) == 0) {
            i2 = (int) n.b(context, 25.0f);
        }
        f26921b = i2;
        return i2;
    }

    public static int c(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) a(context, "window");
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int orientation = windowManager.getDefaultDisplay().getOrientation();
        if (orientation == 1 || orientation == 3) {
            return displayMetrics.heightPixels;
        }
        return displayMetrics.widthPixels;
    }

    public static void a(Window window) {
        try {
            Class<?> cls = window.getClass();
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i2 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            cls.getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE).invoke(window, Integer.valueOf(i2), Integer.valueOf(i2));
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(android.content.Context r6) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.c.b(android.content.Context):int");
    }

    private static int b(Context context, String str) {
        try {
            int identifier = Resources.getSystem().getIdentifier(str, "dimen", "android");
            if (identifier > 0) {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
                int dimensionPixelSize2 = Resources.getSystem().getDimensionPixelSize(identifier);
                if (dimensionPixelSize2 >= dimensionPixelSize) {
                    return dimensionPixelSize2;
                }
                return Math.round((((float) dimensionPixelSize) * Resources.getSystem().getDisplayMetrics().density) / context.getResources().getDisplayMetrics().density);
            }
        } catch (Resources.NotFoundException unused) {
        }
        return 0;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(4942);
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
                    MethodCollector.o(4942);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
