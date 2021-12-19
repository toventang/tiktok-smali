package com.ss.android.ugc.aweme.lego;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    static final int f107641a = 1;

    /* renamed from: b  reason: collision with root package name */
    static final int f107642b = 2;

    /* renamed from: c  reason: collision with root package name */
    static final int f107643c = 4;

    /* renamed from: d  reason: collision with root package name */
    static final int f107644d = 8;

    /* renamed from: e  reason: collision with root package name */
    public static final int f107645e = 11;

    /* renamed from: f  reason: collision with root package name */
    static final h f107646f = i.a((h.f.a.a) b.f107653a);

    /* renamed from: g  reason: collision with root package name */
    static final h f107647g = i.a((h.f.a.a) c.f107654a);

    /* renamed from: h  reason: collision with root package name */
    public static final z f107648h = new z();

    /* renamed from: i  reason: collision with root package name */
    private static final h f107649i = i.a((h.f.a.a) e.f107656a);

    /* renamed from: j  reason: collision with root package name */
    private static final h f107650j = i.a((h.f.a.a) d.f107655a);

    /* renamed from: k  reason: collision with root package name */
    private static final h f107651k = i.a((h.f.a.a) a.f107652a);

    public static int a() {
        return ((Number) f107649i.getValue()).intValue();
    }

    public static boolean b() {
        return ((Boolean) f107650j.getValue()).booleanValue();
    }

    public static boolean c() {
        return ((Boolean) f107651k.getValue()).booleanValue();
    }

    private z() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f107652a = new a();

        static {
            Covode.recordClassIndex(68857);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((z.a() & z.f107644d) == z.f107644d) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f107653a = new b();

        static {
            Covode.recordClassIndex(68858);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((z.a() & z.f107641a) == z.f107641a) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f107654a = new c();

        static {
            Covode.recordClassIndex(68859);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((z.a() & z.f107642b) == z.f107642b) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class d extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f107655a = new d();

        static {
            Covode.recordClassIndex(68860);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((z.a() & z.f107643c) == z.f107643c) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class e extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f107656a = new e();

        static {
            Covode.recordClassIndex(68861);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("lego_threadpool_type", 0));
        }
    }

    static {
        Covode.recordClassIndex(68856);
    }
}
