package com.ss.android.ugc.aweme.ecommercelive.framework.b;

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
    public static final b f88015a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final long f88016b = (((long) Process.myPid()) << 16);

    /* renamed from: c  reason: collision with root package name */
    private static final HandlerThread f88017c;

    /* renamed from: d  reason: collision with root package name */
    private static final Handler f88018d;

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicInteger f88019e = new AtomicInteger(1);

    /* renamed from: f  reason: collision with root package name */
    private static final WeakHashMap<a, Map<String, Object>> f88020f = new WeakHashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private static final d<a> f88021g = new d<>();

    private b() {
    }

    static {
        Covode.recordClassIndex(55331);
        HandlerThread handlerThread = new HandlerThread("keys_keep");
        f88017c = handlerThread;
        handlerThread.start();
        f88018d = new Handler(handlerThread.getLooper());
    }

    public final synchronized a a(String str) {
        a aVar;
        MethodCollector.i(2780);
        l.d(str, "");
        aVar = new a(f88016b | ((long) f88019e.getAndAdd(1)), str);
        f88020f.put(aVar, new LinkedHashMap());
        MethodCollector.o(2780);
        return aVar;
    }

    public final synchronized Map<String, Object> a(a aVar) {
        Map<String, Object> map;
        MethodCollector.i(2794);
        l.d(aVar, "");
        WeakHashMap<a, Map<String, Object>> weakHashMap = f88020f;
        map = weakHashMap.get(aVar);
        if (map == null) {
            map = new LinkedHashMap<>();
            weakHashMap.put(aVar, map);
        }
        MethodCollector.o(2794);
        return map;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public a f88022a;

        /* renamed from: b  reason: collision with root package name */
        public final long f88023b;

        /* renamed from: c  reason: collision with root package name */
        public final String f88024c;

        static {
            Covode.recordClassIndex(55332);
        }

        public a(long j2, String str) {
            l.d(str, "");
            this.f88023b = j2;
            this.f88024c = str;
        }
    }
}
