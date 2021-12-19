package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.h;
import h.i;
import h.m;

public final class en {

    /* renamed from: a  reason: collision with root package name */
    public static final h f89940a = i.a(m.SYNCHRONIZED, c.f89948a);

    /* renamed from: b  reason: collision with root package name */
    public static final h f89941b = i.a(m.SYNCHRONIZED, e.f89950a);

    /* renamed from: c  reason: collision with root package name */
    public static final h f89942c = i.a(m.SYNCHRONIZED, d.f89949a);

    /* renamed from: d  reason: collision with root package name */
    public static final en f89943d = new en();

    /* renamed from: e  reason: collision with root package name */
    private static final h f89944e = i.a((h.f.a.a) a.f89946a);

    /* renamed from: f  reason: collision with root package name */
    private static final h f89945f = i.a(m.SYNCHRONIZED, b.f89947a);

    public static int a() {
        return ((Number) f89944e.getValue()).intValue();
    }

    public static final boolean b() {
        return ((Boolean) f89945f.getValue()).booleanValue();
    }

    private en() {
    }

    static final class a extends h.f.b.m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f89946a = new a();

        static {
            Covode.recordClassIndex(56465);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepoSync("ab_repo_cold_boot", 0).getInt("main_looper_private_repo_opt_enable", 0));
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f89947a = new b();

        static {
            Covode.recordClassIndex(56466);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((en.a() & 8) == 8) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f89948a = new c();

        static {
            Covode.recordClassIndex(56467);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (!en.b() && (en.a() & 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f89949a = new d();

        static {
            Covode.recordClassIndex(56468);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (en.b() || (en.a() & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f89950a = new e();

        static {
            Covode.recordClassIndex(56469);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (en.b() || (en.a() & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(56464);
    }
}
