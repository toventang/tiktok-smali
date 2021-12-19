package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class gx {

    /* renamed from: a  reason: collision with root package name */
    public static final gx f90175a = new gx();

    /* renamed from: b  reason: collision with root package name */
    private static final h f90176b = i.a((h.f.a.a) a.f90182a);

    /* renamed from: c  reason: collision with root package name */
    private static final h f90177c = i.a((h.f.a.a) c.f90184a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f90178d = i.a((h.f.a.a) b.f90183a);

    /* renamed from: e  reason: collision with root package name */
    private static final h f90179e = i.a((h.f.a.a) e.f90186a);

    /* renamed from: f  reason: collision with root package name */
    private static final h f90180f = i.a((h.f.a.a) d.f90185a);

    /* renamed from: g  reason: collision with root package name */
    private static final h f90181g = i.a((h.f.a.a) f.f90187a);

    public static int a() {
        return ((Number) f90176b.getValue()).intValue();
    }

    public static final boolean b() {
        return ((Boolean) f90177c.getValue()).booleanValue();
    }

    public static final boolean c() {
        return ((Boolean) f90178d.getValue()).booleanValue();
    }

    public static final boolean d() {
        return ((Boolean) f90179e.getValue()).booleanValue();
    }

    public static final boolean e() {
        return ((Boolean) f90180f.getValue()).booleanValue();
    }

    public static final boolean f() {
        return ((Boolean) f90181g.getValue()).booleanValue();
    }

    private gx() {
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f90183a = new b();

        static {
            Covode.recordClassIndex(56571);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((gx.a() & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f90184a = new c();

        static {
            Covode.recordClassIndex(56572);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((gx.a() & 1) == 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class d extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f90185a = new d();

        static {
            Covode.recordClassIndex(56573);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((gx.a() & 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class e extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f90186a = new e();

        static {
            Covode.recordClassIndex(56574);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((gx.a() & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class f extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f90187a = new f();

        static {
            Covode.recordClassIndex(56575);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((gx.a() & 16) != 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f90182a = new a();

        static {
            Covode.recordClassIndex(56570);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("system_launch_indicator_experiment", 0));
        }
    }

    static {
        Covode.recordClassIndex(56569);
    }
}
