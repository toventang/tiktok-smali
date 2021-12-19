package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class ai {

    /* renamed from: a  reason: collision with root package name */
    public static final h f89535a = i.a((h.f.a.a) c.f89543a);

    /* renamed from: b  reason: collision with root package name */
    public static final h f89536b = i.a((h.f.a.a) d.f89544a);

    /* renamed from: c  reason: collision with root package name */
    public static final h f89537c = i.a((h.f.a.a) a.f89541a);

    /* renamed from: d  reason: collision with root package name */
    public static final ai f89538d = new ai();

    /* renamed from: e  reason: collision with root package name */
    private static final h f89539e = i.a((h.f.a.a) b.f89542a);

    /* renamed from: f  reason: collision with root package name */
    private static final h f89540f = i.a((h.f.a.a) e.f89545a);

    public static int a() {
        return ((Number) f89539e.getValue()).intValue();
    }

    public static boolean b() {
        return ((Boolean) f89540f.getValue()).booleanValue();
    }

    private ai() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f89541a = new a();

        static {
            Covode.recordClassIndex(56272);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((ai.a() & 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f89543a = new c();

        static {
            Covode.recordClassIndex(56274);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((ai.a() & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class e extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f89545a = new e();

        static {
            Covode.recordClassIndex(56276);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((ai.a() & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class b extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f89542a = new b();

        static {
            Covode.recordClassIndex(56273);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("cold_boot_degradation", 0));
        }
    }

    static final class d extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f89544a = new d();

        static {
            Covode.recordClassIndex(56275);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((ai.a() & 8) == 8) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(56271);
    }
}
