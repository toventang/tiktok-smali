package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final int f90242a = 0;

    /* renamed from: b  reason: collision with root package name */
    static final int f90243b = 1;

    /* renamed from: c  reason: collision with root package name */
    static final int f90244c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final h f90245d = i.a((h.f.a.a) b.f90250a);

    /* renamed from: e  reason: collision with root package name */
    public static final j f90246e = new j();

    /* renamed from: f  reason: collision with root package name */
    private static final h f90247f = i.a((h.f.a.a) c.f90251a);

    /* renamed from: g  reason: collision with root package name */
    private static final h f90248g = i.a((h.f.a.a) a.f90249a);

    public static int a() {
        return ((Number) f90247f.getValue()).intValue();
    }

    public static boolean b() {
        return ((Boolean) f90248g.getValue()).booleanValue();
    }

    private j() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f90249a = new a();

        static {
            Covode.recordClassIndex(56609);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((j.a() & j.f90243b) == j.f90243b) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f90250a = new b();

        static {
            Covode.recordClassIndex(56610);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((j.a() & j.f90244c) == j.f90244c) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class c extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f90251a = new c();

        static {
            Covode.recordClassIndex(56611);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("appflyer_opt", j.f90242a));
        }
    }

    static {
        Covode.recordClassIndex(56608);
    }
}
