package com.ss.android.ugc.aweme.s;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f120799a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final h f120800b = i.a((h.f.a.a) g.f120813a);

    /* renamed from: c  reason: collision with root package name */
    private static final h f120801c = i.a((h.f.a.a) C3122e.f120811a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f120802d = i.a((h.f.a.a) d.f120810a);

    /* renamed from: e  reason: collision with root package name */
    private static final h f120803e = i.a((h.f.a.a) c.f120809a);

    /* renamed from: f  reason: collision with root package name */
    private static final h f120804f = i.a((h.f.a.a) b.f120808a);

    /* renamed from: g  reason: collision with root package name */
    private static final h f120805g = i.a((h.f.a.a) a.f120807a);

    /* renamed from: h  reason: collision with root package name */
    private static final h f120806h = i.a((h.f.a.a) f.f120812a);

    public static int a() {
        return ((Number) f120800b.getValue()).intValue();
    }

    public static boolean b() {
        return ((Boolean) f120801c.getValue()).booleanValue();
    }

    public static boolean c() {
        return ((Boolean) f120802d.getValue()).booleanValue();
    }

    public static boolean d() {
        return ((Boolean) f120803e.getValue()).booleanValue();
    }

    public static boolean e() {
        return ((Boolean) f120804f.getValue()).booleanValue();
    }

    public static boolean f() {
        return ((Boolean) f120805g.getValue()).booleanValue();
    }

    public static long g() {
        return ((Number) f120806h.getValue()).longValue();
    }

    private e() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f120807a = new a();

        static {
            Covode.recordClassIndex(78707);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepo("ab_repo_cold_boot").getBoolean("optimize_asyncinflatecoldbootfinish", true));
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f120808a = new b();

        static {
            Covode.recordClassIndex(78708);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepo("ab_repo_cold_boot").getBoolean("optimize_asyncinflatefragmentfeedfollow", true));
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f120809a = new c();

        static {
            Covode.recordClassIndex(78709);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepo("ab_repo_cold_boot").getBoolean("optimize_asyncinflatefragmentfeed", true));
        }
    }

    static final class d extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f120810a = new d();

        static {
            Covode.recordClassIndex(78710);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepo("ab_repo_cold_boot").getBoolean("optimize_asyncinflatefragmentmain", true));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.s.e$e  reason: collision with other inner class name */
    static final class C3122e extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3122e f120811a = new C3122e();

        static {
            Covode.recordClassIndex(78711);
        }

        C3122e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepo("ab_repo_cold_boot").getBoolean("optimize_asyncinflatefragmentmainpage", false));
        }
    }

    static final class f extends m implements h.f.a.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f120812a = new f();

        static {
            Covode.recordClassIndex(78712);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Long invoke() {
            return Long.valueOf(Keva.getRepo("ab_repo_cold_boot").getLong("optimize_asyncinflateprofiledelaytime", -1));
        }
    }

    static final class g extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f120813a = new g();

        static {
            Covode.recordClassIndex(78713);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("optimize_preloadfeedtype", 1));
        }
    }

    static {
        Covode.recordClassIndex(78706);
    }
}
