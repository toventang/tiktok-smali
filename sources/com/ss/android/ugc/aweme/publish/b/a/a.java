package com.ss.android.ugc.aweme.publish.b.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.c.a.k;
import com.google.c.h.a.b;
import com.google.c.h.a.g;
import com.ss.android.ugc.tools.utils.q;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public class a<V> extends b<V> {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f118623a = new AtomicInteger();

    /* renamed from: b  reason: collision with root package name */
    private String f118624b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f118625c;

    /* renamed from: i  reason: collision with root package name */
    private final LinkedHashMap<Runnable, Executor> f118626i = new LinkedHashMap<>();

    static {
        Covode.recordClassIndex(77034);
    }

    public a() {
    }

    public a(String str) {
        this.f118624b = str;
        this.f118625c = !TextUtils.isEmpty(str);
    }

    public final void a(int i2) {
        MethodCollector.i(13318);
        if (this.f118625c) {
            q.d(this.f118624b + " ProgressiveFuture.setProgress:" + i2);
        }
        this.f118623a.getAndSet(i2);
        g gVar = new g();
        synchronized (this) {
            try {
                for (Map.Entry<Runnable, Executor> entry : this.f118626i.entrySet()) {
                    Runnable key = entry.getKey();
                    Executor value = entry.getValue();
                    k.a(key, "Runnable was null.");
                    k.a(value, "Executor was null.");
                    synchronized (gVar) {
                        try {
                            if (!gVar.f54227b) {
                                gVar.f54226a = new g.a(key, value, gVar.f54226a);
                            } else {
                                g.a(key, value);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } finally {
                MethodCollector.o(13318);
            }
        }
        gVar.a();
        MethodCollector.o(13318);
    }

    public final synchronized void b(Runnable runnable, Executor executor) {
        MethodCollector.i(13316);
        this.f118626i.put(runnable, executor);
        if (this.f118623a.get() > 0) {
            executor.execute(runnable);
        }
        MethodCollector.o(13316);
    }
}
