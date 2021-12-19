package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class dy {

    /* renamed from: a  reason: collision with root package name */
    public static final h f89862a = i.a((h.f.a.a) b.f89868a);

    /* renamed from: b  reason: collision with root package name */
    public static final dy f89863b = new dy();

    /* renamed from: c  reason: collision with root package name */
    private static final h f89864c = i.a((h.f.a.a) a.f89867a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f89865d = i.a((h.f.a.a) c.f89869a);

    /* renamed from: e  reason: collision with root package name */
    private static final h f89866e = i.a((h.f.a.a) d.f89870a);

    public static int a() {
        return ((Number) f89864c.getValue()).intValue();
    }

    public static boolean b() {
        return ((Boolean) f89866e.getValue()).booleanValue();
    }

    private dy() {
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f89868a = new b();

        static {
            Covode.recordClassIndex(56439);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((dy.a() & 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f89869a = new c();

        static {
            Covode.recordClassIndex(56440);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (dy.a() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class d extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f89870a = new d();

        static {
            Covode.recordClassIndex(56441);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((dy.a() & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f89867a = new a();

        static {
            Covode.recordClassIndex(56438);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("init_module_opt", 0));
        }
    }

    static {
        Covode.recordClassIndex(56437);
    }
}
