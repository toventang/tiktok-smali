package com.ss.android.ugc.aweme.im.service.c;

import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final h f103839a = i.a((h.f.a.a) d.f103848a);

    /* renamed from: b  reason: collision with root package name */
    public static final h f103840b = i.a((h.f.a.a) c.f103847a);

    /* renamed from: c  reason: collision with root package name */
    public static final g f103841c = new g();

    /* renamed from: d  reason: collision with root package name */
    private static final h f103842d = i.a((h.f.a.a) e.f103849a);

    /* renamed from: e  reason: collision with root package name */
    private static final h f103843e = i.a((h.f.a.a) b.f103846a);

    /* renamed from: f  reason: collision with root package name */
    private static final h f103844f = i.a((h.f.a.a) a.f103845a);

    public static int a() {
        return ((Number) f103842d.getValue()).intValue();
    }

    public static boolean b() {
        return ((Boolean) f103843e.getValue()).booleanValue();
    }

    public static boolean c() {
        return ((Boolean) f103844f.getValue()).booleanValue();
    }

    private g() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f103845a = new a();

        static {
            Covode.recordClassIndex(66516);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((g.a() & 8) != 8 || !com.ss.android.ugc.aweme.lego.b.c.a()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f103846a = new b();

        static {
            Covode.recordClassIndex(66517);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((g.a() & 2) != 2 || !com.ss.android.ugc.aweme.lego.b.c.a()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f103847a = new c();

        static {
            Covode.recordClassIndex(66518);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((g.a() & 4) != 4 || !com.ss.android.ugc.aweme.lego.b.c.a()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class d extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f103848a = new d();

        static {
            Covode.recordClassIndex(66519);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((g.a() & 1) != 1 || !com.ss.android.ugc.aweme.lego.b.c.a()) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class e extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f103849a = new e();

        static {
            Covode.recordClassIndex(66520);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(com.bytedance.ies.abmock.b.a().a(true, "im_downgrade_opt", 6));
        }
    }

    static {
        Covode.recordClassIndex(66515);
    }
}
