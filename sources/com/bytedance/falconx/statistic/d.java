package com.bytedance.falconx.statistic;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

public class d {

    /* renamed from: c  reason: collision with root package name */
    private static volatile d f28808c;

    /* renamed from: a  reason: collision with root package name */
    public Executor f28809a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.falconx.d f28810b;

    static {
        Covode.recordClassIndex(16936);
    }

    private d() {
        AnonymousClass1 r2 = new ThreadFactory() {
            /* class com.bytedance.falconx.statistic.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(16937);
            }

            public final Thread newThread(Runnable runnable) {
                MethodCollector.i(4123);
                Thread thread = new Thread(runnable);
                thread.setName("falconx-io-thread");
                thread.setPriority(3);
                MethodCollector.o(4123);
                return thread;
            }
        };
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        a2.f79178g = r2;
        this.f28809a = g.a(a2.a());
    }

    public static d a() {
        MethodCollector.i(5088);
        if (f28808c == null) {
            synchronized (d.class) {
                try {
                    if (f28808c == null) {
                        f28808c = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5088);
                    throw th;
                }
            }
        }
        d dVar = f28808c;
        MethodCollector.o(5088);
        return dVar;
    }
}
