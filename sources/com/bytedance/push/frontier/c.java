package com.bytedance.push.frontier;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.frontier.a.a;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static volatile c f42149a;

    /* renamed from: b  reason: collision with root package name */
    private volatile com.bytedance.push.frontier.a.c f42150b;

    /* renamed from: c  reason: collision with root package name */
    private volatile a f42151c;

    static {
        Covode.recordClassIndex(25756);
    }

    private c() {
    }

    public static c a() {
        MethodCollector.i(8962);
        if (f42149a == null) {
            synchronized (c.class) {
                try {
                    if (f42149a == null) {
                        f42149a = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8962);
                    throw th;
                }
            }
        }
        c cVar = f42149a;
        MethodCollector.o(8962);
        return cVar;
    }

    public final com.bytedance.push.frontier.a.c b() {
        MethodCollector.i(9165);
        if (this.f42150b == null) {
            synchronized (this) {
                try {
                    if (this.f42150b == null) {
                        this.f42150b = new com.bytedance.push.frontier.setting.c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9165);
                    throw th;
                }
            }
        }
        com.bytedance.push.frontier.a.c cVar = this.f42150b;
        MethodCollector.o(9165);
        return cVar;
    }

    public final a c() {
        MethodCollector.i(9360);
        if (this.f42151c == null) {
            synchronized (this) {
                try {
                    if (this.f42151c == null) {
                        this.f42151c = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9360);
                    throw th;
                }
            }
        }
        a aVar = this.f42151c;
        MethodCollector.o(9360);
        return aVar;
    }
}
