package com.ss.android.ugc.aweme.sticker.view.internal.pager.pages;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.tools.utils.r;
import h.f.b.l;
import java.lang.reflect.Field;
import java.util.Objects;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f136447a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(89111);
    }

    public static final float a(Context context) {
        l.d(context, "");
        return b(context) + c(context);
    }

    private static float c(Context context) {
        l.d(context, "");
        return r.a(context, 12.0f);
    }

    private static float b(Context context) {
        l.d(context, "");
        l.d(context, "");
        Object a2 = a(context, "window");
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) a2).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i2 = point.x;
        float c2 = c(context);
        l.d(context, "");
        float a3 = r.a(context, 20.0f);
        l.d(context, "");
        float a4 = r.a(context, 52.0f);
        l.d(context, "");
        float a5 = r.a(context, 80.0f);
        double d2 = (double) ((((float) i2) - a3) - (c2 * 5.0f));
        Double.isNaN(d2);
        float f2 = (float) (d2 / 5.3d);
        if (f2 < a4) {
            return a4;
        }
        return f2 > a5 ? a5 : f2;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(13023);
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
                    MethodCollector.o(13023);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
