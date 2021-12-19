package com.ss.android.ugc.aweme.lego.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final int f107398a = 0;

    /* renamed from: b  reason: collision with root package name */
    static final int f107399b = 1;

    /* renamed from: c  reason: collision with root package name */
    static final int f107400c = 2;

    /* renamed from: d  reason: collision with root package name */
    static final int f107401d = 4;

    /* renamed from: e  reason: collision with root package name */
    static final int f107402e = 8;

    /* renamed from: f  reason: collision with root package name */
    public static final int f107403f = 3;

    /* renamed from: g  reason: collision with root package name */
    public static final h f107404g = i.a((h.f.a.a) c.f107412a);

    /* renamed from: h  reason: collision with root package name */
    public static final h f107405h = i.a((h.f.a.a) e.f107414a);

    /* renamed from: i  reason: collision with root package name */
    public static final a f107406i = new a();

    /* renamed from: j  reason: collision with root package name */
    private static final h f107407j = i.a((h.f.a.a) C2759a.f107410a);

    /* renamed from: k  reason: collision with root package name */
    private static final h f107408k = i.a((h.f.a.a) b.f107411a);

    /* renamed from: l  reason: collision with root package name */
    private static final h f107409l = i.a((h.f.a.a) d.f107413a);

    public static int a() {
        return ((Number) f107407j.getValue()).intValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.b.a$a  reason: collision with other inner class name */
    static final class C2759a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2759a f107410a = new C2759a();

        static {
            Covode.recordClassIndex(68753);
        }

        C2759a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("fluency_insert_downgrade_opt", a.f107398a));
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f107411a = new b();

        static {
            Covode.recordClassIndex(68754);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((a.a() & a.f107401d) == a.f107401d) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f107412a = new c();

        static {
            Covode.recordClassIndex(68755);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((a.a() & a.f107399b) != a.f107399b || !c.a()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class d extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f107413a = new d();

        static {
            Covode.recordClassIndex(68756);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((a.a() & a.f107402e) == a.f107402e) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class e extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f107414a = new e();

        static {
            Covode.recordClassIndex(68757);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((a.a() & a.f107400c) != a.f107400c || !c.a()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(68752);
    }
}
