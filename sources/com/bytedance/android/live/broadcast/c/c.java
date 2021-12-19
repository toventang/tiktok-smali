package com.bytedance.android.live.broadcast.c;

import com.bytedance.android.live.broadcast.c.a.a.b;
import com.bytedance.android.live.effect.api.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class c {

    /* renamed from: c  reason: collision with root package name */
    private static volatile c f7828c;

    /* renamed from: a  reason: collision with root package name */
    public b f7829a;

    /* renamed from: b  reason: collision with root package name */
    public e f7830b;

    static {
        Covode.recordClassIndex(3873);
    }

    private c() {
    }

    public final b b() {
        if (this.f7829a == null) {
            this.f7829a = new b();
        }
        return this.f7829a;
    }

    public static c a() {
        MethodCollector.i(6041);
        if (f7828c == null) {
            synchronized (c.class) {
                try {
                    if (f7828c == null) {
                        f7828c = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6041);
                    throw th;
                }
            }
        }
        c cVar = f7828c;
        MethodCollector.o(6041);
        return cVar;
    }
}
