package com.ss.android.ugc.aweme.lego.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int f107416a = 0;

    /* renamed from: b  reason: collision with root package name */
    static final int f107417b = 1;

    /* renamed from: c  reason: collision with root package name */
    static final int f107418c = 2;

    /* renamed from: d  reason: collision with root package name */
    static final int f107419d = 4;

    /* renamed from: e  reason: collision with root package name */
    public static final h f107420e = i.a((h.f.a.a) C2761b.f107426a);

    /* renamed from: f  reason: collision with root package name */
    public static final h f107421f = i.a((h.f.a.a) d.f107428a);

    /* renamed from: g  reason: collision with root package name */
    public static final b f107422g = new b();

    /* renamed from: h  reason: collision with root package name */
    private static final h f107423h = i.a((h.f.a.a) a.f107425a);

    /* renamed from: i  reason: collision with root package name */
    private static final h f107424i = i.a((h.f.a.a) c.f107427a);

    public static int a() {
        return ((Number) f107423h.getValue()).intValue();
    }

    private b() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f107425a = new a();

        static {
            Covode.recordClassIndex(68759);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("high_frequency_function_opt", b.f107416a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.b.b$b  reason: collision with other inner class name */
    static final class C2761b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2761b f107426a = new C2761b();

        static {
            Covode.recordClassIndex(68760);
        }

        C2761b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((b.a() & b.f107417b) == b.f107417b) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f107427a = new c();

        static {
            Covode.recordClassIndex(68761);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((b.a() & b.f107418c) == b.f107418c) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class d extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f107428a = new d();

        static {
            Covode.recordClassIndex(68762);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((b.a() & b.f107419d) == b.f107419d) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(68758);
    }
}
