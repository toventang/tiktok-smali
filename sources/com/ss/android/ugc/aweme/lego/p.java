package com.ss.android.ugc.aweme.lego;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import h.f.b.m;
import h.h;
import h.i;
import java.util.concurrent.ExecutorService;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static Handler f107614a;

    /* renamed from: b  reason: collision with root package name */
    public static final com.ss.android.ugc.aweme.lego.f.b f107615b = new com.ss.android.ugc.aweme.lego.f.b();

    /* renamed from: c  reason: collision with root package name */
    public static final p f107616c = new p();

    /* renamed from: d  reason: collision with root package name */
    private static final h f107617d = i.a((h.f.a.a) a.f107624a);

    /* renamed from: e  reason: collision with root package name */
    private static final h f107618e = i.a((h.f.a.a) c.f107626a);

    /* renamed from: f  reason: collision with root package name */
    private static final ExecutorService f107619f;

    /* renamed from: g  reason: collision with root package name */
    private static final ExecutorService f107620g;

    /* renamed from: h  reason: collision with root package name */
    private static final ExecutorService f107621h;

    /* renamed from: i  reason: collision with root package name */
    private static final HandlerThread f107622i;

    /* renamed from: j  reason: collision with root package name */
    private static final h f107623j = i.a((h.f.a.a) b.f107625a);

    public static Handler a() {
        return (Handler) f107623j.getValue();
    }

    private static ExecutorService b() {
        return (ExecutorService) f107617d.getValue();
    }

    private p() {
    }

    static final class b extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f107625a = new b();

        static {
            Covode.recordClassIndex(68843);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static final class a extends m implements h.f.a.a<ExecutorService> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f107624a = new a();

        static {
            Covode.recordClassIndex(68842);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ExecutorService invoke() {
            if (((Boolean) z.f107646f.getValue()).booleanValue()) {
                return g.b();
            }
            l.a a2 = l.a(o.FIXED);
            a2.f79173b = "LegoExecutor_executorWork";
            a2.f79174c = y.f107640a;
            return g.a(a2.a());
        }
    }

    static final class c extends m implements h.f.a.a<ExecutorService> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f107626a = new c();

        static {
            Covode.recordClassIndex(68844);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ExecutorService invoke() {
            l.a a2 = l.a(o.FIXED);
            a2.f79173b = "LegoExecutor_executorWork";
            a2.f79174c = Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4));
            return g.a(a2.a());
        }
    }

    static {
        Covode.recordClassIndex(68841);
        ExecutorService e2 = g.e();
        h.f.b.l.b(e2, "");
        f107619f = e2;
        l.a a2 = l.a(o.SERIAL);
        a2.f79173b = "LegoExecutor_executorRequest";
        ExecutorService a3 = g.a(a2.a());
        h.f.b.l.b(a3, "");
        f107620g = a3;
        ExecutorService a4 = g.a();
        h.f.b.l.b(a4, "");
        f107621h = a4;
        HandlerThread handlerThread = new HandlerThread("LegoHandler");
        f107622i = handlerThread;
        handlerThread.start();
        f107614a = new Handler(handlerThread.getLooper());
        Process.setThreadPriority(handlerThread.getThreadId(), -20);
    }

    public static ExecutorService a(aa aaVar) {
        h.f.b.l.d(aaVar, "");
        if (aaVar == aa.P0) {
            return f107621h;
        }
        return f107620g;
    }

    public static ExecutorService b(boolean z) {
        if (!z) {
            return (ExecutorService) f107618e.getValue();
        }
        return f107619f;
    }

    public static ExecutorService a(boolean z) {
        if (!z) {
            return b();
        }
        return f107619f;
    }
}
