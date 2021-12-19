package com.ss.android.ugc.aweme.power;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class d {

    /* renamed from: c  reason: collision with root package name */
    private static d f115707c;

    /* renamed from: e  reason: collision with root package name */
    private static CopyOnWriteArrayList<b> f115708e = new CopyOnWriteArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    public boolean f115709a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f115710b = true;

    /* renamed from: d  reason: collision with root package name */
    private int f115711d = 6;

    static {
        Covode.recordClassIndex(74654);
    }

    public final void b() {
        if (!this.f115709a) {
            d();
        }
    }

    public final void c() {
        if (this.f115709a) {
            e();
        }
    }

    d() {
        c a2 = c.a();
        if (a2 != null && !f115708e.contains(a2)) {
            f115708e.add(a2);
        }
        a.a();
    }

    public static d a() {
        MethodCollector.i(6766);
        if (f115707c == null) {
            synchronized (d.class) {
                try {
                    if (f115707c == null) {
                        f115707c = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6766);
                    throw th;
                }
            }
        }
        d dVar = f115707c;
        MethodCollector.o(6766);
        return dVar;
    }

    private void d() {
        MethodCollector.i(7072);
        synchronized (d.class) {
            try {
                if (!this.f115709a) {
                    this.f115709a = true;
                    a(2);
                    MethodCollector.o(7072);
                }
            } finally {
                MethodCollector.o(7072);
            }
        }
    }

    private void e() {
        MethodCollector.i(9100);
        synchronized (d.class) {
            try {
                if (this.f115709a) {
                    this.f115709a = false;
                    a(0);
                    MethodCollector.o(9100);
                }
            } finally {
                MethodCollector.o(9100);
            }
        }
    }

    private static void a(int i2) {
        Iterator<b> it = f115708e.iterator();
        while (it.hasNext()) {
            it.next().a(i2);
        }
    }
}
