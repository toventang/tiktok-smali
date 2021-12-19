package com.bytedance.ies.watcher;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.legoImp.WatcherImpl;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f35503a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final Handler f35504b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private static final HashMap<String, Long> f35505c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentHashMap<String, Object> f35506d = new ConcurrentHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private static final h f35507e = i.a((h.f.a.a) a.f35508a);

    public static b a() {
        return (b) f35507e.getValue();
    }

    public static final void a(String str, String str2, Object obj) {
        l.c(str, "");
        l.c(str2, "");
        l.c(obj, "");
    }

    private c() {
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f35509a;

        static {
            Covode.recordClassIndex(21235);
        }

        b(String str) {
            this.f35509a = str;
        }

        public final void run() {
            c.b(this.f35509a);
        }
    }

    static final class a extends m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f35508a = new a();

        static {
            Covode.recordClassIndex(21234);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            IWatcher b2 = WatcherImpl.b();
            if (b2 != null) {
                return b2.a();
            }
            return new a();
        }
    }

    static {
        Covode.recordClassIndex(21233);
    }

    public static final void c(String str) {
        l.c(str, "");
        f35504b.post(new b(str));
    }

    public static final synchronized void b(String str) {
        synchronized (c.class) {
            MethodCollector.i(3712);
            l.c(str, "");
            Long remove = f35505c.remove(str);
            if (remove != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - remove.longValue();
                if (elapsedRealtime < 30000) {
                    a().a(str, elapsedRealtime);
                }
            }
            MethodCollector.o(3712);
        }
    }

    public static final synchronized void a(String str) {
        synchronized (c.class) {
            MethodCollector.i(3332);
            l.c(str, "");
            HashMap<String, Long> hashMap = f35505c;
            Long l2 = hashMap.get(str);
            if (l2 == null) {
                hashMap.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
            } else if (SystemClock.elapsedRealtime() - l2.longValue() >= 30000) {
                hashMap.remove(str);
                MethodCollector.o(3332);
                return;
            }
            MethodCollector.o(3332);
        }
    }

    public static final void a(String str, long j2) {
        l.c(str, "");
        a().a(str, j2);
    }
}
