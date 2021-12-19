package com.ss.android.ugc.aweme.social.a;

import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f133633a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public static final h f133634b = i.a((h.f.a.a) C3462b.f133642a);

    /* renamed from: c  reason: collision with root package name */
    public static final b f133635c = new b();

    /* renamed from: d  reason: collision with root package name */
    private static final h f133636d = i.a((h.f.a.a) f.f133646a);

    /* renamed from: e  reason: collision with root package name */
    private static final h f133637e = i.a((h.f.a.a) c.f133643a);

    /* renamed from: f  reason: collision with root package name */
    private static final h f133638f = i.a((h.f.a.a) d.f133644a);

    /* renamed from: g  reason: collision with root package name */
    private static final h f133639g = i.a((h.f.a.a) e.f133645a);

    /* renamed from: h  reason: collision with root package name */
    private static final h f133640h = i.a((h.f.a.a) a.f133641a);

    public static a a() {
        return (a) f133636d.getValue();
    }

    public static boolean b() {
        return ((Boolean) f133637e.getValue()).booleanValue();
    }

    public static boolean c() {
        return ((Boolean) f133638f.getValue()).booleanValue();
    }

    public static boolean d() {
        return ((Boolean) f133639g.getValue()).booleanValue();
    }

    public static boolean e() {
        return ((Boolean) f133640h.getValue()).booleanValue();
    }

    private b() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f133641a = new a();

        static {
            Covode.recordClassIndex(87422);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (b.a().f133629a <= 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.a.b$b  reason: collision with other inner class name */
    static final class C3462b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3462b f133642a = new C3462b();

        static {
            Covode.recordClassIndex(87423);
        }

        C3462b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (b.a().f133629a != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f133643a = new c();

        static {
            Covode.recordClassIndex(87424);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (b.a().f133629a == 2) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class d extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f133644a = new d();

        static {
            Covode.recordClassIndex(87425);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (b.a().f133629a == 3) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class e extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f133645a = new e();

        static {
            Covode.recordClassIndex(87426);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (b.a().f133629a == 4) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class f extends m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f133646a = new f();

        static {
            Covode.recordClassIndex(87427);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            Object a2 = com.bytedance.ies.abmock.b.a().a(true, "following_list_recommend_permission", a.class, b.f133633a);
            if (a2 == null) {
                return b.f133633a;
            }
            return a2;
        }
    }

    static {
        Covode.recordClassIndex(87421);
    }
}
