package com.ss.android.ugc.aweme.profile.f;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class af {

    /* renamed from: a  reason: collision with root package name */
    public static final af f116392a = new af();

    private af() {
    }

    static {
        Covode.recordClassIndex(75146);
    }

    public static final int a(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            Object a2 = a(context, "window");
            if (!(a2 instanceof WindowManager)) {
                a2 = null;
            }
            WindowManager windowManager = (WindowManager) a2;
            if (windowManager == null) {
                return i.b(context);
            }
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            if (defaultDisplay == null) {
                return 0;
            }
            defaultDisplay.getSize(point);
            return point.x;
        } catch (Exception unused) {
            return 0;
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(9666);
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
                    MethodCollector.o(9666);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
