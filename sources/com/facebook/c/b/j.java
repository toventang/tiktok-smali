package com.facebook.c.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.c.a.c;
import com.facebook.c.a.d;
import com.facebook.c.a.e;
import java.io.IOException;

public final class j implements c {

    /* renamed from: h  reason: collision with root package name */
    private static final Object f47032h = new Object();

    /* renamed from: i  reason: collision with root package name */
    private static j f47033i;

    /* renamed from: j  reason: collision with root package name */
    private static int f47034j;

    /* renamed from: a  reason: collision with root package name */
    e f47035a;

    /* renamed from: b  reason: collision with root package name */
    String f47036b;

    /* renamed from: c  reason: collision with root package name */
    long f47037c;

    /* renamed from: d  reason: collision with root package name */
    long f47038d;

    /* renamed from: e  reason: collision with root package name */
    long f47039e;

    /* renamed from: f  reason: collision with root package name */
    IOException f47040f;

    /* renamed from: g  reason: collision with root package name */
    d.a f47041g;

    /* renamed from: k  reason: collision with root package name */
    private j f47042k;

    private j() {
    }

    @Override // com.facebook.c.a.c
    public final e a() {
        return this.f47035a;
    }

    static {
        Covode.recordClassIndex(28603);
    }

    private void d() {
        this.f47035a = null;
        this.f47036b = null;
        this.f47037c = 0;
        this.f47038d = 0;
        this.f47039e = 0;
        this.f47040f = null;
        this.f47041g = null;
    }

    public static j b() {
        MethodCollector.i(1124);
        synchronized (f47032h) {
            try {
                j jVar = f47033i;
                if (jVar != null) {
                    f47033i = jVar.f47042k;
                    jVar.f47042k = null;
                    f47034j--;
                    return jVar;
                }
                j jVar2 = new j();
                MethodCollector.o(1124);
                return jVar2;
            } finally {
                MethodCollector.o(1124);
            }
        }
    }

    public final void c() {
        MethodCollector.i(1146);
        synchronized (f47032h) {
            try {
                if (f47034j < 5) {
                    d();
                    f47034j++;
                    j jVar = f47033i;
                    if (jVar != null) {
                        this.f47042k = jVar;
                    }
                    f47033i = this;
                }
            } finally {
                MethodCollector.o(1146);
            }
        }
    }
}
