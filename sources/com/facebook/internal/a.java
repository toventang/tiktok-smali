package com.facebook.internal;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.UUID;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f48482a;

    /* renamed from: b  reason: collision with root package name */
    private UUID f48483b;

    /* renamed from: c  reason: collision with root package name */
    private Intent f48484c;

    /* renamed from: d  reason: collision with root package name */
    private int f48485d;

    static {
        Covode.recordClassIndex(29240);
    }

    public final Intent a() {
        if (com.facebook.internal.a.b.a.a(this)) {
            return null;
        }
        try {
            return this.f48484c;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, this);
            return null;
        }
    }

    public final UUID b() {
        if (com.facebook.internal.a.b.a.a(this)) {
            return null;
        }
        try {
            return this.f48483b;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, this);
            return null;
        }
    }

    public final int c() {
        if (com.facebook.internal.a.b.a.a(this)) {
            return 0;
        }
        try {
            return this.f48485d;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, this);
            return 0;
        }
    }

    private static a e() {
        if (com.facebook.internal.a.b.a.a(a.class)) {
            return null;
        }
        try {
            return f48482a;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, a.class);
            return null;
        }
    }

    public final boolean d() {
        if (com.facebook.internal.a.b.a.a(this)) {
            return false;
        }
        try {
            return a(this);
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, this);
            return false;
        }
    }

    public a(int i2) {
        this(i2, UUID.randomUUID());
    }

    public final void a(Intent intent) {
        if (!com.facebook.internal.a.b.a.a(this)) {
            try {
                this.f48484c = intent;
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, this);
            }
        }
    }

    private static synchronized boolean a(a aVar) {
        synchronized (a.class) {
            MethodCollector.i(10273);
            if (com.facebook.internal.a.b.a.a(a.class)) {
                MethodCollector.o(10273);
                return false;
            }
            try {
                a e2 = e();
                f48482a = aVar;
                if (e2 != null) {
                    MethodCollector.o(10273);
                    return true;
                }
                MethodCollector.o(10273);
                return false;
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, a.class);
                MethodCollector.o(10273);
                return false;
            }
        }
    }

    private a(int i2, UUID uuid) {
        this.f48483b = uuid;
        this.f48485d = i2;
    }

    public static synchronized a a(UUID uuid, int i2) {
        synchronized (a.class) {
            MethodCollector.i(10272);
            if (com.facebook.internal.a.b.a.a(a.class)) {
                MethodCollector.o(10272);
                return null;
            }
            try {
                a e2 = e();
                if (e2 == null || !e2.b().equals(uuid) || e2.c() != i2) {
                    MethodCollector.o(10272);
                    return null;
                }
                a((a) null);
                MethodCollector.o(10272);
                return e2;
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, a.class);
                MethodCollector.o(10272);
                return null;
            }
        }
    }
}
