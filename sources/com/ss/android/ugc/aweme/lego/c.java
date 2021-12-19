package com.ss.android.ugc.aweme.lego;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f107445a = 0;

    /* renamed from: b  reason: collision with root package name */
    static final int f107446b = 1;

    /* renamed from: c  reason: collision with root package name */
    static final int f107447c = 0;

    /* renamed from: d  reason: collision with root package name */
    static final int f107448d = 4;

    /* renamed from: e  reason: collision with root package name */
    static final int f107449e = 8;

    /* renamed from: f  reason: collision with root package name */
    static final int f107450f = 16;

    /* renamed from: g  reason: collision with root package name */
    public static final h f107451g = i.a((h.f.a.a) a.f107458a);

    /* renamed from: h  reason: collision with root package name */
    public static final h f107452h = i.a((h.f.a.a) b.f107461a);

    /* renamed from: i  reason: collision with root package name */
    public static final h f107453i = i.a((h.f.a.a) d.f107465a);

    /* renamed from: j  reason: collision with root package name */
    public static final h f107454j = i.a((h.f.a.a) e.f107466a);

    /* renamed from: k  reason: collision with root package name */
    public static final h f107455k = i.a((h.f.a.a) C2763c.f107464a);

    /* renamed from: l  reason: collision with root package name */
    public static final c f107456l = new c();

    /* renamed from: m  reason: collision with root package name */
    private static final h f107457m = i.a((h.f.a.a) f.f107467a);

    public static int a() {
        return ((Number) f107457m.getValue()).intValue();
    }

    private c() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f107458a = new a();

        static {
            Covode.recordClassIndex(68766);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((c.a() & c.f107446b) == c.f107446b) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f107461a = new b();

        static {
            Covode.recordClassIndex(68767);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((c.a() & c.f107447c) == c.f107447c) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.c$c  reason: collision with other inner class name */
    static final class C2763c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2763c f107464a = new C2763c();

        static {
            Covode.recordClassIndex(68768);
        }

        C2763c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((c.a() & c.f107450f) == c.f107450f) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class d extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f107465a = new d();

        static {
            Covode.recordClassIndex(68769);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((c.a() & c.f107448d) == c.f107448d) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class e extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f107466a = new e();

        static {
            Covode.recordClassIndex(68770);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((c.a() & c.f107449e) == c.f107449e) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class f extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f107467a = new f();

        static {
            Covode.recordClassIndex(68771);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("downgrade_bg_experiment", c.f107445a));
        }
    }

    static {
        Covode.recordClassIndex(68765);
    }
}
