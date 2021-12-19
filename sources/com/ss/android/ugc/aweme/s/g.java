package com.ss.android.ugc.aweme.s;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final h f120823a = i.a((h.f.a.a) d.f120831a);

    /* renamed from: b  reason: collision with root package name */
    public static final h f120824b = i.a((h.f.a.a) b.f120829a);

    /* renamed from: c  reason: collision with root package name */
    public static final h f120825c = i.a((h.f.a.a) a.f120828a);

    /* renamed from: d  reason: collision with root package name */
    public static final g f120826d = new g();

    /* renamed from: e  reason: collision with root package name */
    private static final h f120827e = i.a((h.f.a.a) c.f120830a);

    public static boolean a() {
        return ((Boolean) f120827e.getValue()).booleanValue();
    }

    private g() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f120828a = new a();

        static {
            Covode.recordClassIndex(78720);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("optimize_cachevideocount", 2));
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f120829a = new b();

        static {
            Covode.recordClassIndex(78721);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepo("ab_repo_cold_boot").getBoolean("optimize_preloadallvideo", false));
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f120830a = new c();

        static {
            Covode.recordClassIndex(78722);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepo("ab_repo_cold_boot").getBoolean("optimize_preloadonlywifi", false));
        }
    }

    static final class d extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f120831a = new d();

        static {
            Covode.recordClassIndex(78723);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepo("ab_repo_cold_boot").getBoolean("optimize_preloadvideocover", false));
        }
    }

    static {
        Covode.recordClassIndex(78719);
    }
}
