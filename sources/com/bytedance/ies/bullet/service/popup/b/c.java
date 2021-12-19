package com.bytedance.ies.bullet.service.popup.b;

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
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import h.w;
import java.lang.reflect.Field;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f32919a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static float f32920b = -1.0f;

    /* renamed from: c  reason: collision with root package name */
    private static int f32921c = -1;

    /* renamed from: d  reason: collision with root package name */
    private static int f32922d = -1;

    private c() {
    }

    static {
        Covode.recordClassIndex(19653);
    }

    public static final a a(Context context) {
        l.c(context, "");
        int i2 = f32921c;
        int i3 = f32922d;
        if (i2 > 0 && i3 > 0 && i3 >= i2) {
            return new a(i2, i3);
        }
        try {
            Object a2 = a(context, "window");
            if (a2 != null) {
                WindowManager windowManager = (WindowManager) a2;
                if (windowManager != null) {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    if (defaultDisplay == null) {
                        return new a(i2, i3);
                    }
                    int i4 = Build.VERSION.SDK_INT;
                    defaultDisplay.getRealSize(point);
                    i2 = b(point.x, context);
                    i3 = b(point.y, context);
                } else {
                    Resources resources = context.getResources();
                    l.a((Object) resources, "");
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i2 = b(displayMetrics.widthPixels, context);
                    i3 = b(displayMetrics.heightPixels, context);
                }
                return new a(i2, i3);
            }
            throw new w("null cannot be cast to non-null type");
        } catch (Exception unused) {
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f32923a;

        /* renamed from: b  reason: collision with root package name */
        public final int f32924b;

        static {
            Covode.recordClassIndex(19654);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f32923a == aVar.f32923a && this.f32924b == aVar.f32924b;
        }

        public final int hashCode() {
            return (this.f32923a * 31) + this.f32924b;
        }

        public final String toString() {
            return "DisplayMetric(width=" + this.f32923a + ", height=" + this.f32924b + ")";
        }

        public a(int i2, int i3) {
            this.f32923a = i2;
            this.f32924b = i3;
        }
    }

    public static final int a(int i2, Context context) {
        l.c(context, "");
        if (f32920b < 0.0f) {
            Resources resources = context.getResources();
            l.a((Object) resources, "");
            f32920b = resources.getDisplayMetrics().density;
        }
        return h.g.a.a((((float) i2) * f32920b) + 0.5f);
    }

    public static final int b(int i2, Context context) {
        l.c(context, "");
        if (f32920b < 0.0f) {
            Resources resources = context.getResources();
            l.a((Object) resources, "");
            f32920b = resources.getDisplayMetrics().density;
        }
        return (int) ((((float) i2) / f32920b) + 0.5f);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(9498);
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
                            com.bytedance.crash.c.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(9498);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
