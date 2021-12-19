package com.ss.ugc.aweme.performance.a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Printer;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.aweme.performance.core.monitor.a;
import com.ss.ugc.aweme.performance.mainlooper.monitor.work.SampleJankListener;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.y;
import h.f.b.z;
import h.h;
import h.i;
import h.m;
import h.m.p;
import h.w;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final String f153309c = f153309c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f153310d = f153310d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f153311e = f153311e;

    /* renamed from: f  reason: collision with root package name */
    public static final String f153312f = f153312f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f153313g;

    /* renamed from: h  reason: collision with root package name */
    public static Handler f153314h;

    /* renamed from: i  reason: collision with root package name */
    public static long f153315i = 32;

    /* renamed from: j  reason: collision with root package name */
    public static Printer f153316j;

    /* renamed from: k  reason: collision with root package name */
    public static int f153317k;

    /* renamed from: l  reason: collision with root package name */
    public static long f153318l;

    /* renamed from: m  reason: collision with root package name */
    public static final h f153319m = i.a(m.SYNCHRONIZED, b.f153323a);
    public static final C4076a n = new C4076a((byte) 0);
    private static HandlerThread o;
    private static final c p = new c();

    /* renamed from: a  reason: collision with root package name */
    public boolean f153320a;

    /* renamed from: b  reason: collision with root package name */
    public List<com.ss.ugc.aweme.performance.core.monitor.d.b> f153321b;

    /* renamed from: com.ss.ugc.aweme.performance.a.a$a  reason: collision with other inner class name */
    public static final class C4076a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ h.k.i[] f153322a = {new y(ab.a(C4076a.class), "INSTANCE", "getINSTANCE()Lcom/ss/ugc/aweme/performance/monitor/JankMonitor;")};

        public static a a() {
            return (a) a.f153319m.getValue();
        }

        private C4076a() {
        }

        static {
            Covode.recordClassIndex(101800);
        }

        public /* synthetic */ C4076a(byte b2) {
            this();
        }
    }

    public static final class c implements Printer {

        /* renamed from: a  reason: collision with root package name */
        private long f153324a;

        static {
            Covode.recordClassIndex(101802);
        }

        c() {
        }

        /* renamed from: com.ss.ugc.aweme.performance.a.a$c$a  reason: collision with other inner class name */
        static final class RunnableC4077a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ z.e f153325a;

            static {
                Covode.recordClassIndex(101803);
            }

            RunnableC4077a(z.e eVar) {
                this.f153325a = eVar;
            }

            public final void run() {
                Iterator<T> it = C4076a.a().f153321b.iterator();
                while (it.hasNext()) {
                    it.next().onJankHappened(this.f153325a.element, -1, -1, -1);
                }
            }
        }

        public final void println(String str) {
            l.c(str, "");
            if (!TextUtils.isEmpty(str) && C4076a.a().f153320a) {
                if (a.f153313g) {
                    z.e eVar = new z.e();
                    eVar.element = (T) (a.f153312f + String.valueOf(a.f153317k));
                    if (p.b(str, a.f153310d, false)) {
                        Handler handler = a.f153314h;
                        if (handler != null) {
                            handler.postDelayed(new RunnableC4077a(eVar), a.f153315i * 50);
                        }
                        this.f153324a = System.nanoTime();
                        Iterator<T> it = C4076a.a().f153321b.iterator();
                        while (it.hasNext()) {
                            it.next().onMessageArrive(eVar.element, this.f153324a);
                        }
                    }
                    if (p.b(str, a.f153311e, false)) {
                        Handler handler2 = a.f153314h;
                        if (handler2 != null) {
                            handler2.removeCallbacksAndMessages(null);
                        }
                        if (this.f153324a != 0) {
                            long nanoTime = System.nanoTime();
                            long j2 = (nanoTime - this.f153324a) / 1000000;
                            if (j2 > a.f153315i) {
                                a.f153318l += j2;
                                a.f153317k++;
                                Iterator<T> it2 = C4076a.a().f153321b.iterator();
                                while (it2.hasNext()) {
                                    it2.next().onJankHappened(eVar.element, this.f153324a, nanoTime, j2);
                                }
                            }
                            Iterator<T> it3 = C4076a.a().f153321b.iterator();
                            while (it3.hasNext()) {
                                it3.next().onMessageLeave(eVar.element, nanoTime);
                            }
                        }
                    }
                }
                if (a.f153316j != null && (!l.a(a.f153316j, this))) {
                    Printer printer = a.f153316j;
                    if (printer == null) {
                        l.a();
                    }
                    printer.println(str);
                }
            }
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f153323a = new b();

        static {
            Covode.recordClassIndex(101801);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            if (a.C4078a.a().f153330c || !a.C4078a.a().f153328a) {
                return new a((byte) 0);
            }
            throw new RuntimeException("not init , please check!");
        }
    }

    static {
        Covode.recordClassIndex(101799);
    }

    private a() {
        boolean z;
        long j2;
        this.f153321b = new ArrayList();
        com.ss.ugc.aweme.performance.core.monitor.a.a aVar = a.C4078a.a().f153329b;
        if (aVar != null) {
            z = aVar.a();
        } else {
            z = false;
        }
        f153313g = z;
        com.ss.ugc.aweme.performance.core.monitor.a.a aVar2 = a.C4078a.a().f153329b;
        if (aVar2 != null) {
            j2 = aVar2.b();
        } else {
            j2 = 100;
        }
        f153315i = j2;
        SampleJankListener sampleJankListener = new SampleJankListener();
        l.c(sampleJankListener, "");
        this.f153321b.add(sampleJankListener);
        sampleJankListener.setThreshold(f153315i);
    }

    private static Printer a() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            l.a((Object) declaredField, "");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(Looper.getMainLooper());
            if (obj != null) {
                return (Printer) obj;
            }
            throw new w("null cannot be cast to non-null type");
        } catch (Exception unused) {
            return null;
        }
    }

    private synchronized void b() {
        com.ss.ugc.aweme.performance.core.monitor.a.a aVar;
        if (f153313g) {
            if (!this.f153320a) {
                this.f153320a = true;
                if (o == null && (aVar = a.C4078a.a().f153329b) != null && aVar.c()) {
                    HandlerThread handlerThread = new HandlerThread(f153309c);
                    o = handlerThread;
                    handlerThread.start();
                    HandlerThread handlerThread2 = o;
                    if (handlerThread2 == null) {
                        l.a();
                    }
                    f153314h = new Handler(handlerThread2.getLooper());
                }
                Iterator<T> it = this.f153321b.iterator();
                while (it.hasNext()) {
                    it.next().setThreshold(f153315i);
                }
                if (true ^ l.a(f153316j, a())) {
                    f153316j = a();
                }
                Looper.getMainLooper().setMessageLogging(p);
            }
        }
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    public final synchronized void b(String str) {
        l.c(str, "");
        if (f153313g) {
            com.ss.ugc.aweme.performance.core.monitor.b.c a2 = com.ss.ugc.aweme.performance.core.monitor.b.a(str);
            if (a2 != null) {
                a2.f153361b = System.nanoTime();
                Iterator<T> it = this.f153321b.iterator();
                while (it.hasNext()) {
                    it.next().flush(a2);
                }
                l.c(str, "");
                com.ss.ugc.aweme.performance.core.monitor.b.f153334a.remove(str);
            }
        }
    }

    public final synchronized void a(String str) {
        l.c(str, "");
        if (f153313g) {
            if (!this.f153320a) {
                b();
            }
            if (com.ss.ugc.aweme.performance.core.monitor.b.a(str) == null) {
                com.ss.ugc.aweme.performance.core.monitor.b.c cVar = new com.ss.ugc.aweme.performance.core.monitor.b.c(str);
                cVar.f153360a = System.nanoTime();
                l.c(str, "");
                l.c(cVar, "");
                if (com.ss.ugc.aweme.performance.core.monitor.b.f153335b.get(str) == null) {
                    int i2 = com.ss.ugc.aweme.performance.core.monitor.b.f153336c + 1;
                    com.ss.ugc.aweme.performance.core.monitor.b.f153336c = i2;
                    cVar.f153362c = i2;
                    com.ss.ugc.aweme.performance.core.monitor.b.f153335b.put(str, Integer.valueOf(cVar.f153362c));
                } else {
                    Integer num = com.ss.ugc.aweme.performance.core.monitor.b.f153335b.get(str);
                    if (num == null) {
                        l.a();
                    }
                    cVar.f153362c = num.intValue();
                }
                com.ss.ugc.aweme.performance.core.monitor.b.f153334a.put(str, cVar);
            }
        }
    }
}
