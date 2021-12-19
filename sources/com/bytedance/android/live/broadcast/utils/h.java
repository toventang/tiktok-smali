package com.bytedance.android.live.broadcast.utils;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static WindowManager f8644a;

    /* renamed from: b  reason: collision with root package name */
    private static final Point f8645b = new Point();

    static {
        Covode.recordClassIndex(4421);
    }

    public static final int a() {
        Object obj;
        Context a2;
        if (f8644a == null) {
            Context e2 = y.e();
            WindowManager windowManager = null;
            if (e2 == null || (a2 = a(e2)) == null) {
                obj = null;
            } else {
                obj = a(a2, "window");
            }
            if (obj instanceof WindowManager) {
                windowManager = obj;
            }
            f8644a = windowManager;
        }
        WindowManager windowManager2 = f8644a;
        if (windowManager2 == null) {
            return y.c();
        }
        Display defaultDisplay = windowManager2.getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getSize(f8645b);
        }
        return f8645b.x;
    }

    public static final int b() {
        Object obj;
        Context a2;
        if (f8644a == null) {
            Context e2 = y.e();
            WindowManager windowManager = null;
            if (e2 == null || (a2 = a(e2)) == null) {
                obj = null;
            } else {
                obj = a(a2, "window");
            }
            if (obj instanceof WindowManager) {
                windowManager = obj;
            }
            f8644a = windowManager;
        }
        WindowManager windowManager2 = f8644a;
        if (windowManager2 == null) {
            return y.c();
        }
        Display defaultDisplay = windowManager2.getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getSize(f8645b);
        }
        return f8645b.y;
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(6831);
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
                    MethodCollector.o(6831);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
