package com.bytedance.crash.runtime;

import android.os.Looper;
import android.os.SystemClock;
import android.util.Printer;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.m;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public static Printer f27922a;

    /* renamed from: e  reason: collision with root package name */
    public static final Printer f27923e = new Printer() {
        /* class com.bytedance.crash.runtime.k.AnonymousClass1 */

        static {
            Covode.recordClassIndex(16343);
        }

        public final void println(String str) {
            if (str != null) {
                if (str.charAt(0) == '>') {
                    k a2 = k.a();
                    a2.f27925b = -1;
                    try {
                        k.a(a2.f27926c, str);
                    } catch (Exception unused) {
                        m.f27730g.isDebugMode();
                    }
                } else if (str.charAt(0) == '<') {
                    k a3 = k.a();
                    a3.f27925b = SystemClock.uptimeMillis();
                    try {
                        k.a(a3.f27927d, str);
                    } catch (Exception unused2) {
                        m.f27730g.isDebugMode();
                    }
                }
                if (k.f27922a != null && k.f27922a != k.f27923e) {
                    k.f27922a.println(str);
                }
            }
        }
    };

    /* renamed from: g  reason: collision with root package name */
    private static k f27924g;

    /* renamed from: b  reason: collision with root package name */
    long f27925b = -1;

    /* renamed from: c  reason: collision with root package name */
    final List<Printer> f27926c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final List<Printer> f27927d = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public boolean f27928f;

    static {
        Covode.recordClassIndex(16342);
    }

    private k() {
    }

    public final boolean c() {
        if (this.f27925b == -1 || SystemClock.uptimeMillis() - this.f27925b <= 5000) {
            return false;
        }
        return true;
    }

    public static k a() {
        MethodCollector.i(10459);
        if (f27924g == null) {
            synchronized (k.class) {
                try {
                    if (f27924g == null) {
                        f27924g = new k();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10459);
                    throw th;
                }
            }
        }
        k kVar = f27924g;
        MethodCollector.o(10459);
        return kVar;
    }

    public static Printer b() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            m.f27730g.isDebugMode();
            return null;
        }
    }

    public final synchronized void a(Printer printer) {
        MethodCollector.i(10617);
        this.f27926c.add(printer);
        MethodCollector.o(10617);
    }

    static void a(List<? extends Printer> list, String str) {
        if (list != null && !list.isEmpty()) {
            try {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Printer printer = (Printer) list.get(i2);
                    if (printer != null) {
                        printer.println(str);
                    } else {
                        return;
                    }
                }
            } catch (Throwable unused) {
                m.f27730g.isDebugMode();
            }
        }
    }
}
