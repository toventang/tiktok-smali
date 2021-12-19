package com.vk.api.sdk;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.o;
import h.f.b.m;
import h.h;
import h.i;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    static final AtomicInteger f156354a = new AtomicInteger();

    /* renamed from: b  reason: collision with root package name */
    public static final l f156355b = new l();

    /* renamed from: c  reason: collision with root package name */
    private static final h f156356c = i.a((h.f.a.a) a.f156358a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f156357d = i.a((h.f.a.a) b.f156359a);

    public static ExecutorService a() {
        return (ExecutorService) f156357d.getValue();
    }

    private l() {
    }

    static final class a extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f156358a = new a();

        static {
            Covode.recordClassIndex(103840);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static final class b extends m implements h.f.a.a<ExecutorService> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f156359a = new b();

        static {
            Covode.recordClassIndex(103841);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ExecutorService invoke() {
            return g.a(com.ss.android.ugc.aweme.cw.l.a(o.FIXED).a(32).a(AnonymousClass1.f156360a).a());
        }
    }

    static {
        Covode.recordClassIndex(103839);
    }

    public static final void a(Runnable runnable) {
        h.f.b.l.c(runnable, "");
        if (h.f.b.l.a(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
        } else {
            ((Handler) f156356c.getValue()).postDelayed(runnable, 0);
        }
    }
}
