package com.bytedance.geckox.policy.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.e;
import java.util.concurrent.atomic.AtomicBoolean;

public class a {

    /* renamed from: b  reason: collision with root package name */
    public static long f29985b;

    /* renamed from: d  reason: collision with root package name */
    private static a f29986d;

    /* renamed from: a  reason: collision with root package name */
    public e f29987a;

    /* renamed from: c  reason: collision with root package name */
    public AtomicBoolean f29988c = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(17400);
    }

    private a() {
    }

    public static a a() {
        MethodCollector.i(10274);
        if (f29986d == null) {
            synchronized (a.class) {
                try {
                    if (f29986d == null) {
                        f29986d = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10274);
                    throw th;
                }
            }
        }
        a aVar = f29986d;
        MethodCollector.o(10274);
        return aVar;
    }
}
