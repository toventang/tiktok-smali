package com.bytedance.geckox.policy.v4;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.e;
import com.bytedance.geckox.f.a;
import com.bytedance.geckox.policy.v4.model.V4RequestModel;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class b {

    /* renamed from: e  reason: collision with root package name */
    private static b f30018e;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, V4RequestModel> f30019a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public e f30020b;

    /* renamed from: c  reason: collision with root package name */
    public Map<a, Set<String>> f30021c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    public AtomicBoolean f30022d = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private AtomicInteger f30023f = new AtomicInteger(0);

    /* renamed from: g  reason: collision with root package name */
    private AtomicBoolean f30024g = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(17417);
    }

    private b() {
    }

    public static b a() {
        MethodCollector.i(10207);
        if (f30018e == null) {
            synchronized (b.class) {
                try {
                    if (f30018e == null) {
                        f30018e = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10207);
                    throw th;
                }
            }
        }
        b bVar = f30018e;
        MethodCollector.o(10207);
        return bVar;
    }
}
