package com.ss.android.ugc.aweme.experiment;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class ex {

    /* renamed from: a  reason: collision with root package name */
    public static final h f90002a = i.a((h.f.a.a) c.f90010a);

    /* renamed from: b  reason: collision with root package name */
    public static final ex f90003b = new ex();

    /* renamed from: c  reason: collision with root package name */
    private static final h f90004c = i.a((h.f.a.a) e.f90012a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f90005d = i.a((h.f.a.a) d.f90011a);

    /* renamed from: e  reason: collision with root package name */
    private static final h f90006e = i.a((h.f.a.a) b.f90009a);

    /* renamed from: f  reason: collision with root package name */
    private static final h f90007f = i.a((h.f.a.a) a.f90008a);

    public static int a() {
        return ((Number) f90004c.getValue()).intValue();
    }

    public static boolean b() {
        return ((Boolean) f90005d.getValue()).booleanValue();
    }

    public static boolean c() {
        return ((Boolean) f90006e.getValue()).booleanValue();
    }

    public static boolean d() {
        return ((Boolean) f90007f.getValue()).booleanValue();
    }

    private ex() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f90008a = new a();

        static {
            Covode.recordClassIndex(56490);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((ex.a() & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f90010a = new c();

        static {
            Covode.recordClassIndex(56492);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((ex.a() & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class d extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f90011a = new d();

        static {
            Covode.recordClassIndex(56493);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (ex.a() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f90009a = new b();

        static {
            Covode.recordClassIndex(56491);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((ex.a() & 1) != 1 || Build.VERSION.SDK_INT < 21) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class e extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f90012a = new e();

        static {
            Covode.recordClassIndex(56494);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("npth_refactor", 0));
        }
    }

    static {
        Covode.recordClassIndex(56489);
    }
}
