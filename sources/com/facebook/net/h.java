package com.facebook.net;

import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.q;
import com.bytedance.ttnet.utils.RetrofitUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class h {

    /* renamed from: d  reason: collision with root package name */
    private static volatile h f48993d;

    /* renamed from: a  reason: collision with root package name */
    public volatile ArrayList<Integer> f48994a;

    /* renamed from: b  reason: collision with root package name */
    public volatile ArrayList<Integer> f48995b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f48996c;

    /* renamed from: e  reason: collision with root package name */
    private final int f48997e = 1;

    /* renamed from: f  reason: collision with root package name */
    private final int f48998f = 2;

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f48999g;

    /* renamed from: h  reason: collision with root package name */
    private volatile HashMap<String, q> f49000h;

    /* renamed from: i  reason: collision with root package name */
    private volatile List<com.bytedance.retrofit2.c.a> f49001i;

    static {
        Covode.recordClassIndex(29520);
    }

    private h() {
    }

    public final synchronized boolean b() {
        boolean z;
        MethodCollector.i(3795);
        z = this.f48999g;
        MethodCollector.o(3795);
        return z;
    }

    public static h a() {
        MethodCollector.i(3559);
        if (f48993d == null) {
            synchronized (h.class) {
                try {
                    if (f48993d == null) {
                        f48993d = new h();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3559);
                    throw th;
                }
            }
        }
        h hVar = f48993d;
        MethodCollector.o(3559);
        return hVar;
    }

    public static class a extends Exception {

        /* renamed from: e  reason: collision with root package name */
        public final Exception f49002e;
        public final int retryCount;

        static {
            Covode.recordClassIndex(29521);
        }

        public a(Exception exc, int i2) {
            this.f49002e = exc;
            this.retryCount = i2;
        }
    }

    public final <S> S a(String str, Class<S> cls) {
        List<com.bytedance.retrofit2.c.a> list = null;
        if (!b()) {
            com.ss.a.a.a.d("RetryInterceptManager", "[getRetrofitService] is closed");
            return null;
        } else if (m.a(str)) {
            return null;
        } else {
            q qVar = this.f49000h.get(str);
            if (qVar == null) {
                if (b()) {
                    list = this.f49001i;
                }
                qVar = RetrofitUtils.b(str, list);
            }
            return (S) RetrofitUtils.a(qVar, cls);
        }
    }
}
