package com.ss.ttvideoengine.s;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class g {
    static {
        Covode.recordClassIndex(101782);
    }

    public static int a() {
        return Resources.getSystem().getDisplayMetrics().densityDpi;
    }

    public static float b() {
        return Resources.getSystem().getDisplayMetrics().xdpi;
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().ydpi;
    }

    public static Point a(Context context) {
        Point point = new Point();
        Display defaultDisplay = ((WindowManager) a(context, "window")).getDefaultDisplay();
        int i2 = Build.VERSION.SDK_INT;
        defaultDisplay.getRealSize(point);
        return point;
    }

    public static int b(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(13556);
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
                    MethodCollector.o(13556);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
