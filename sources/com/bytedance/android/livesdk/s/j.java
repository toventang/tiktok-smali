package com.bytedance.android.livesdk.s;

import android.animation.TimeInterpolator;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, b> f21143a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static String f21144b = "live_default_window";

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        Context f21145a;

        /* renamed from: b  reason: collision with root package name */
        public View f21146b;

        /* renamed from: c  reason: collision with root package name */
        int f21147c;

        /* renamed from: d  reason: collision with root package name */
        public int f21148d = -2;

        /* renamed from: e  reason: collision with root package name */
        public int f21149e = -2;

        /* renamed from: f  reason: collision with root package name */
        int f21150f = 8388659;

        /* renamed from: g  reason: collision with root package name */
        int f21151g;

        /* renamed from: h  reason: collision with root package name */
        int f21152h;

        /* renamed from: i  reason: collision with root package name */
        boolean f21153i = true;

        /* renamed from: j  reason: collision with root package name */
        Class[] f21154j;

        /* renamed from: k  reason: collision with root package name */
        public int f21155k = 3;

        /* renamed from: l  reason: collision with root package name */
        int f21156l;

        /* renamed from: m  reason: collision with root package name */
        int f21157m;
        int n;
        int o;
        long p = 300;
        TimeInterpolator q;
        public String r = j.f21144b;
        public boolean s;
        public f t;
        boolean u;
        long v;
        TimeInterpolator w;

        static {
            Covode.recordClassIndex(12479);
        }

        public final a a() {
            this.f21156l = 0;
            this.f21157m = 0;
            return this;
        }

        private a() {
        }

        public final void b() {
            MethodCollector.i(10431);
            if (j.f21143a.containsKey(this.r)) {
                com.bytedance.android.live.core.c.a.a(6, "LiveFloatWindowManager", "Float window has been added!");
                MethodCollector.o(10431);
                return;
            }
            if (this.f21146b == null) {
                if (this.f21147c == 0) {
                    com.bytedance.android.live.core.c.a.a(6, "LiveFloatWindowManager", "view can not be null!");
                    MethodCollector.o(10431);
                    return;
                }
                this.f21146b = ((LayoutInflater) a(this.f21145a, "layout_inflater")).inflate(this.f21147c, (ViewGroup) null);
            }
            j.f21143a.put(this.r, new h(this));
            MethodCollector.o(10431);
        }

        public final a a(TimeInterpolator timeInterpolator) {
            this.p = 300;
            this.q = timeInterpolator;
            return this;
        }

        a(Context context) {
            this.f21145a = context;
        }

        private static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(10433);
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
                        MethodCollector.o(10433);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    static {
        Covode.recordClassIndex(12478);
    }

    public static a a(Context context) {
        return new a(context);
    }

    public static void a(String str) {
        f21143a.remove(str);
    }

    public static b b(String str) {
        if (m.a(str)) {
            return null;
        }
        return f21143a.get(str);
    }
}
