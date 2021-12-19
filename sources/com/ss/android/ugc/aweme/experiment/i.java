package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final h f90233a = h.i.a((h.f.a.a) a.f90238a);

    /* renamed from: b  reason: collision with root package name */
    public static final i f90234b = new i();

    /* renamed from: c  reason: collision with root package name */
    private static final h f90235c = h.i.a((h.f.a.a) b.f90239a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f90236d = h.i.a((h.f.a.a) c.f90240a);

    /* renamed from: e  reason: collision with root package name */
    private static final h f90237e = h.i.a((h.f.a.a) d.f90241a);

    public static int a() {
        return ((Number) f90235c.getValue()).intValue();
    }

    public static final boolean b() {
        return ((Boolean) f90236d.getValue()).booleanValue();
    }

    public static final boolean c() {
        return ((Boolean) f90237e.getValue()).booleanValue();
    }

    private i() {
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f90240a = new c();

        static {
            Covode.recordClassIndex(56606);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((i.a() & 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class a extends m implements h.f.a.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f90238a = new a();

        static {
            Covode.recordClassIndex(56604);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Long invoke() {
            long j2;
            if (i.b()) {
                j2 = ((long) ((i.a() & 62) >> 1)) * 1000;
            } else {
                j2 = 0;
            }
            return Long.valueOf(j2);
        }
    }

    static final class b extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f90239a = new b();

        static {
            Covode.recordClassIndex(56605);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("app_widget_refactor_experiment", 0));
        }
    }

    static final class d extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f90241a = new d();

        static {
            Covode.recordClassIndex(56607);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (i.b() && ((i.a() & 64) >> 6) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(56603);
    }
}
