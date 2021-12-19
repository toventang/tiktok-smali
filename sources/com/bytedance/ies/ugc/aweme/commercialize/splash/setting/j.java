package com.bytedance.ies.ugc.aweme.commercialize.splash.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final h f34828a = i.a((h.f.a.a) d.f34839a);

    /* renamed from: b  reason: collision with root package name */
    public static final j f34829b = new j();

    /* renamed from: c  reason: collision with root package name */
    private static final h f34830c = i.a((h.f.a.a) g.f34842a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f34831d = i.a((h.f.a.a) b.f34837a);

    /* renamed from: e  reason: collision with root package name */
    private static final h f34832e = i.a((h.f.a.a) e.f34840a);

    /* renamed from: f  reason: collision with root package name */
    private static final h f34833f = i.a((h.f.a.a) f.f34841a);

    /* renamed from: g  reason: collision with root package name */
    private static final h f34834g = i.a((h.f.a.a) a.f34836a);

    /* renamed from: h  reason: collision with root package name */
    private static final h f34835h = i.a((h.f.a.a) c.f34838a);

    public static int a() {
        return ((Number) f34830c.getValue()).intValue();
    }

    public static boolean b() {
        return ((Boolean) f34832e.getValue()).booleanValue();
    }

    public static boolean c() {
        return ((Boolean) f34833f.getValue()).booleanValue();
    }

    public static boolean d() {
        return ((Boolean) f34834g.getValue()).booleanValue();
    }

    public static boolean e() {
        return ((Boolean) f34835h.getValue()).booleanValue();
    }

    private j() {
    }

    static final class d extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f34839a = new d();

        static {
            Covode.recordClassIndex(20895);
        }

        d() {
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
        public static final b f34837a = new b();

        static {
            Covode.recordClassIndex(20893);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (j.a() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class e extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f34840a = new e();

        static {
            Covode.recordClassIndex(20896);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((j.a() & 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class f extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f34841a = new f();

        static {
            Covode.recordClassIndex(20897);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((j.a() & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34836a = new a();

        static {
            Covode.recordClassIndex(20892);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((j.a() & 8) == 8) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f34838a = new c();

        static {
            Covode.recordClassIndex(20894);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((j.a() & 16) == 16) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class g extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f34842a = new g();

        static {
            Covode.recordClassIndex(20898);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("splash_opt", 0));
        }
    }

    static {
        Covode.recordClassIndex(20891);
    }
}
