package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;

public final class cx {

    /* renamed from: a  reason: collision with root package name */
    public static final h f89736a = i.a((h.f.a.a) a.f89744a);

    /* renamed from: b  reason: collision with root package name */
    public static final h f89737b = i.a((h.f.a.a) c.f89746a);

    /* renamed from: c  reason: collision with root package name */
    public static final h f89738c = i.a((h.f.a.a) b.f89745a);

    /* renamed from: d  reason: collision with root package name */
    public static boolean f89739d = true;

    /* renamed from: e  reason: collision with root package name */
    public static final cx f89740e = new cx();

    /* renamed from: f  reason: collision with root package name */
    private static final h f89741f = i.a((h.f.a.a) d.f89747a);

    /* renamed from: g  reason: collision with root package name */
    private static final h f89742g = i.a((h.f.a.a) e.f89748a);

    /* renamed from: h  reason: collision with root package name */
    private static final h f89743h = i.a((h.f.a.a) f.f89749a);

    public static boolean a() {
        return ((Boolean) f89741f.getValue()).booleanValue();
    }

    public static boolean b() {
        return ((Boolean) f89742g.getValue()).booleanValue();
    }

    public static boolean c() {
        return ((Boolean) f89743h.getValue()).booleanValue();
    }

    private cx() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f89744a = new a();

        static {
            Covode.recordClassIndex(56387);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (!cx.a() || (cy.a() & 1) == 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f89745a = new b();

        static {
            Covode.recordClassIndex(56388);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (!cx.a() || (cy.a() & 4) == 0) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f89746a = new c();

        static {
            Covode.recordClassIndex(56389);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (!cx.a() || (cy.a() & 2) == 0) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class d extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f89747a = new d();

        static {
            Covode.recordClassIndex(56390);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (cy.a() <= 0 || com.ss.android.ugc.aweme.feed.cache.e.n()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class e extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f89748a = new e();

        static {
            Covode.recordClassIndex(56391);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (!cx.a() || (cz.a() & 1) == 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class f extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f89749a = new f();

        static {
            Covode.recordClassIndex(56392);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (!cx.a() || !cx.b() || (cz.a() & 2) == 0) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(56386);
    }
}
