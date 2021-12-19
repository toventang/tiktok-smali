package com.ss.ugc.aweme.performance.mainlooper.monitor.work;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.performance.b.a.a;
import com.ss.ugc.aweme.performance.core.monitor.a;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.i;
import h.m.p;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class a extends com.ss.ugc.aweme.performance.core.monitor.d.a {

    /* renamed from: l  reason: collision with root package name */
    public static final h f153389l = i.a((h.f.a.a) b.f153396a);

    /* renamed from: m  reason: collision with root package name */
    static final double f153390m = f153390m;
    static int n = 50;
    public static final C4081a o = new C4081a((byte) 0);
    private static int q = 200;

    /* renamed from: h  reason: collision with root package name */
    public long f153391h;

    /* renamed from: i  reason: collision with root package name */
    final Handler f153392i;

    /* renamed from: j  reason: collision with root package name */
    long f153393j;

    /* renamed from: k  reason: collision with root package name */
    final c f153394k;
    private final HandlerThread p;

    /* renamed from: com.ss.ugc.aweme.performance.mainlooper.monitor.work.a$a  reason: collision with other inner class name */
    public static final class C4081a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ h.k.i[] f153395a = {new y(ab.a(C4081a.class), "INSTANCE", "getINSTANCE()Lcom/ss/ugc/aweme/performance/mainlooper/monitor/work/LogWorker;")};

        public static a a() {
            return (a) a.f153389l.getValue();
        }

        private C4081a() {
        }

        static {
            Covode.recordClassIndex(101830);
        }

        public /* synthetic */ C4081a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f153396a = new b();

        static {
            Covode.recordClassIndex(101831);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a((byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(101829);
    }

    private a() {
        this.f153393j = 16;
        this.f153394k = new c();
        HandlerThread handlerThread = new HandlerThread("LogWorker");
        this.p = handlerThread;
        handlerThread.start();
        this.f153392i = new Handler(handlerThread.getLooper());
        if (this.f153374d) {
            l.c(a.C2939a.f114786a, "");
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public String f153397a = "";

        /* renamed from: b  reason: collision with root package name */
        public long f153398b;

        static {
            Covode.recordClassIndex(101832);
        }

        public final void run() {
            MethodCollector.i(9102);
            com.ss.ugc.aweme.performance.core.monitor.b.b bVar = new com.ss.ugc.aweme.performance.core.monitor.b.b();
            bVar.f153353e = this.f153398b;
            bVar.f153356h = com.ss.ugc.aweme.performance.core.monitor.c.a.f153365b;
            bVar.f153355g = this.f153397a;
            synchronized (C4081a.a().f153371a) {
                try {
                    C4081a.a().f153371a.put(this.f153397a, bVar);
                } finally {
                    MethodCollector.o(9102);
                }
            }
            if (C4081a.a().f153372b) {
                synchronized (bVar) {
                    try {
                        Looper mainLooper = Looper.getMainLooper();
                        l.a((Object) mainLooper, "");
                        Thread thread = mainLooper.getThread();
                        l.a((Object) thread, "");
                        StackTraceElement[] stackTrace = thread.getStackTrace();
                        if (stackTrace != null && stackTrace.length > 0) {
                            String stackTraceElement = stackTrace[0].toString();
                            l.a((Object) stackTraceElement, "");
                            bVar.f153358j = stackTraceElement;
                        }
                        bVar.f153350b = com.ss.ugc.aweme.performance.core.monitor.f.b.a(stackTrace);
                    } finally {
                        MethodCollector.o(9102);
                    }
                }
                com.ss.ugc.aweme.performance.mainlooper.monitor.a.a a2 = com.ss.ugc.aweme.performance.mainlooper.a.a.f153384a.a();
                String str = bVar.f153355g;
                l.c(str, "");
                a2.f153388b = str;
                com.ss.ugc.aweme.performance.core.monitor.e.b.f153380a.a(a2);
            }
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f153399a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.ugc.aweme.performance.core.monitor.b.b f153400b;

        static {
            Covode.recordClassIndex(101833);
        }

        d(a aVar, com.ss.ugc.aweme.performance.core.monitor.b.b bVar) {
            this.f153399a = aVar;
            this.f153400b = bVar;
        }

        public final void run() {
            Map<String, Object> map;
            MethodCollector.i(9112);
            if (this.f153399a.f153374d) {
                com.ss.ugc.aweme.performance.core.monitor.a.b bVar = a.C4078a.a().f153331d;
                if (bVar != null) {
                    map = bVar.a();
                } else {
                    map = null;
                }
                synchronized (this.f153400b) {
                    if (map != null) {
                        try {
                            Set<String> keySet = map.keySet();
                            if (keySet != null) {
                                Iterator<T> it = keySet.iterator();
                                while (it.hasNext()) {
                                    if (p.a((CharSequence) this.f153400b.f153350b, (CharSequence) it.next(), false)) {
                                        return;
                                    }
                                }
                            }
                        } finally {
                            MethodCollector.o(9112);
                        }
                    }
                }
            }
            com.ss.ugc.aweme.performance.core.monitor.b.a aVar = new com.ss.ugc.aweme.performance.core.monitor.b.a(null, 3, (byte) 0);
            aVar.f153339b = 1;
            if (this.f153400b.f153354f == -1) {
                aVar.f153340c = this.f153399a.f153391h * 50;
                aVar.b("errorJank");
                Looper mainLooper = Looper.getMainLooper();
                l.a((Object) mainLooper, "");
                Thread thread = mainLooper.getThread();
                l.a((Object) thread, "");
                aVar.f(com.ss.ugc.aweme.performance.core.monitor.f.b.a(thread.getStackTrace()));
                String date = new Date(System.currentTimeMillis() / 1000000).toString();
                l.a((Object) date, "");
                aVar.d(date);
            } else {
                aVar.f153340c = (this.f153400b.f153354f - this.f153400b.f153353e) / 1000000;
                aVar.b("applicaiton");
                String date2 = new Date(this.f153400b.f153353e / 1000000).toString();
                l.a((Object) date2, "");
                aVar.d(date2);
                synchronized (this.f153400b) {
                    try {
                        aVar.f(this.f153400b.f153350b);
                    } catch (Throwable th) {
                        MethodCollector.o(9112);
                        throw th;
                    }
                }
            }
            aVar.c(this.f153400b.f153356h);
            aVar.e(com.ss.ugc.aweme.performance.core.monitor.f.b.a(com.ss.ugc.aweme.performance.core.monitor.f.b.b(this.f153400b.f153359k)) + "\n" + this.f153400b.f153357i);
            aVar.a(this.f153400b.f153358j);
            a.C4078a.a();
            MethodCollector.o(9112);
        }
    }

    public /* synthetic */ a(byte b2) {
        this();
    }
}
