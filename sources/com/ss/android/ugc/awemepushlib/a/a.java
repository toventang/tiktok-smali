package com.ss.android.ugc.awemepushlib.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final h.h f145355a = h.i.a((h.f.a.a) c.f145369a);

    /* renamed from: b  reason: collision with root package name */
    public static final h.h f145356b = h.i.a((h.f.a.a) b.f145368a);

    /* renamed from: c  reason: collision with root package name */
    public static final h.h f145357c = h.i.a((h.f.a.a) e.f145371a);

    /* renamed from: d  reason: collision with root package name */
    public static final h.h f145358d = h.i.a((h.f.a.a) k.f145377a);

    /* renamed from: e  reason: collision with root package name */
    public static final h.h f145359e = h.i.a((h.f.a.a) C3865a.f145367a);

    /* renamed from: f  reason: collision with root package name */
    public static final a f145360f = new a();

    /* renamed from: g  reason: collision with root package name */
    private static final h.h f145361g = h.i.a((h.f.a.a) d.f145370a);

    /* renamed from: h  reason: collision with root package name */
    private static final h.h f145362h = h.i.a((h.f.a.a) g.f145373a);

    /* renamed from: i  reason: collision with root package name */
    private static final h.h f145363i = h.i.a((h.f.a.a) f.f145372a);

    /* renamed from: j  reason: collision with root package name */
    private static final h.h f145364j = h.i.a((h.f.a.a) j.f145376a);

    /* renamed from: k  reason: collision with root package name */
    private static final h.h f145365k = h.i.a((h.f.a.a) h.f145374a);

    /* renamed from: l  reason: collision with root package name */
    private static final h.h f145366l = h.i.a((h.f.a.a) i.f145375a);

    public static int a() {
        return ((Number) f145361g.getValue()).intValue();
    }

    public static boolean b() {
        return ((Boolean) f145362h.getValue()).booleanValue();
    }

    public static boolean c() {
        return ((Boolean) f145363i.getValue()).booleanValue();
    }

    public static boolean d() {
        return ((Boolean) f145366l.getValue()).booleanValue();
    }

    private a() {
    }

    static final class g extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f145373a = new g();

        static {
            Covode.recordClassIndex(95048);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return false;
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f145368a = new b();

        static {
            Covode.recordClassIndex(95043);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((a.a() & 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f145369a = new c();

        static {
            Covode.recordClassIndex(95044);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            if ((a.a() & 0) == 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class e extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f145371a = new e();

        static {
            Covode.recordClassIndex(95046);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((a.a() & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.awemepushlib.a.a$a  reason: collision with other inner class name */
    static final class C3865a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3865a f145367a = new C3865a();

        static {
            Covode.recordClassIndex(95042);
        }

        C3865a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((a.a() & 16) == 16) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class d extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f145370a = new d();

        static {
            Covode.recordClassIndex(95045);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("push_start_opt_v1", 0));
        }
    }

    static final class f extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f145372a = new f();

        static {
            Covode.recordClassIndex(95047);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((a.a() & 32) == 32) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class h extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f145374a = new h();

        static {
            Covode.recordClassIndex(95049);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((a.a() & 128) == 128) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class i extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f145375a = new i();

        static {
            Covode.recordClassIndex(95050);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((a.a() & 256) == 256) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class j extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f145376a = new j();

        static {
            Covode.recordClassIndex(95051);
        }

        j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((a.a() & 64) == 64) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class k extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f145377a = new k();

        static {
            Covode.recordClassIndex(95052);
        }

        k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((a.a() & 8) == 8) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(95041);
    }
}
