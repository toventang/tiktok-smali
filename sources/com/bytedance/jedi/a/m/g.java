package com.bytedance.jedi.a.m;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import h.f.b.ab;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f39345a = {new y(ab.a(g.class), "CPU_COUNT", "getCPU_COUNT()I"), new y(ab.a(g.class), "CORE_POOL_SIZE", "getCORE_POOL_SIZE()I"), new y(ab.a(g.class), "MAXIMUM_POOL_SIZE", "getMAXIMUM_POOL_SIZE()I"), new y(ab.a(g.class), "defaultScheduler", "getDefaultScheduler()Lio/reactivex/Scheduler;")};

    /* renamed from: b  reason: collision with root package name */
    static final h f39346b = h.i.a((h.f.a.a) a.f39351a);

    /* renamed from: c  reason: collision with root package name */
    static final h f39347c = h.i.a((h.f.a.a) c.f39353a);

    /* renamed from: d  reason: collision with root package name */
    public static final h f39348d = h.i.a((h.f.a.a) d.f39354a);

    /* renamed from: e  reason: collision with root package name */
    public static final g f39349e = new g();

    /* renamed from: f  reason: collision with root package name */
    private static final h f39350f = h.i.a((h.f.a.a) b.f39352a);

    public static int a() {
        return ((Number) f39350f.getValue()).intValue();
    }

    private g() {
    }

    static final class b extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f39352a = new b();

        static {
            Covode.recordClassIndex(24135);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Runtime.getRuntime().availableProcessors());
        }
    }

    static final class c extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f39353a = new c();

        static {
            Covode.recordClassIndex(24136);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf((g.a() * 2) + 1);
        }
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f39351a = new a();

        static {
            Covode.recordClassIndex(24134);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Math.max(2, Math.min(g.a() - 1, 4)));
        }
    }

    static final class d extends m implements h.f.a.a<aa> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f39354a = new d();

        static {
            Covode.recordClassIndex(24137);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ aa invoke() {
            return f.a.k.a.a(new ThreadPoolExecutor(((Number) g.f39346b.getValue()).intValue(), ((Number) g.f39347c.getValue()).intValue(), 0, TimeUnit.SECONDS, new LinkedBlockingQueue()));
        }
    }

    static {
        Covode.recordClassIndex(24133);
    }
}
