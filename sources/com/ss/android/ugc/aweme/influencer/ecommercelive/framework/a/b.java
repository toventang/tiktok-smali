package com.ss.android.ugc.aweme.influencer.ecommercelive.framework.a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import androidx.c.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f104561a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final long f104562b = (((long) Process.myPid()) << 16);

    /* renamed from: c  reason: collision with root package name */
    private static final HandlerThread f104563c;

    /* renamed from: d  reason: collision with root package name */
    private static final Handler f104564d;

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicInteger f104565e = new AtomicInteger(1);

    /* renamed from: f  reason: collision with root package name */
    private static final WeakHashMap<a, Map<String, Object>> f104566f = new WeakHashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private static final d<a> f104567g = new d<>();

    private b() {
    }

    static {
        Covode.recordClassIndex(66992);
        HandlerThread handlerThread = new HandlerThread("keys_keep");
        f104563c = handlerThread;
        handlerThread.start();
        f104564d = new Handler(handlerThread.getLooper());
    }

    public final synchronized a a(String str) {
        a aVar;
        MethodCollector.i(10560);
        l.d(str, "");
        aVar = new a(f104562b | ((long) f104565e.getAndAdd(1)), str);
        f104566f.put(aVar, new LinkedHashMap());
        MethodCollector.o(10560);
        return aVar;
    }

    public final synchronized Map<String, Object> a(a aVar) {
        Map<String, Object> map;
        MethodCollector.i(10561);
        l.d(aVar, "");
        WeakHashMap<a, Map<String, Object>> weakHashMap = f104566f;
        map = weakHashMap.get(aVar);
        if (map == null) {
            map = new LinkedHashMap<>();
            weakHashMap.put(aVar, map);
        }
        MethodCollector.o(10561);
        return map;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public a f104568a;

        /* renamed from: b  reason: collision with root package name */
        public final long f104569b;

        /* renamed from: c  reason: collision with root package name */
        public final String f104570c;

        static {
            Covode.recordClassIndex(66993);
        }

        public a(long j2, String str) {
            l.d(str, "");
            this.f104569b = j2;
            this.f104570c = str;
        }
    }
}
