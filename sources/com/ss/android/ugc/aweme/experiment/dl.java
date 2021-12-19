package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class dl {

    /* renamed from: a  reason: collision with root package name */
    public static final int f89790a = 1;

    /* renamed from: b  reason: collision with root package name */
    static final int f89791b = 2;

    /* renamed from: c  reason: collision with root package name */
    static final int f89792c = 4;

    /* renamed from: d  reason: collision with root package name */
    static final int f89793d = 8;

    /* renamed from: e  reason: collision with root package name */
    public static final h f89794e = i.a((h.f.a.a) a.f89800a);

    /* renamed from: f  reason: collision with root package name */
    public static final dl f89795f = new dl();

    /* renamed from: g  reason: collision with root package name */
    private static final h f89796g = i.a((h.f.a.a) c.f89802a);

    /* renamed from: h  reason: collision with root package name */
    private static final h f89797h = i.a((h.f.a.a) e.f89804a);

    /* renamed from: i  reason: collision with root package name */
    private static final h f89798i = i.a((h.f.a.a) d.f89803a);

    /* renamed from: j  reason: collision with root package name */
    private static final h f89799j = i.a((h.f.a.a) b.f89801a);

    public static int a() {
        return ((Number) f89796g.getValue()).intValue();
    }

    public static boolean b() {
        return ((Boolean) f89797h.getValue()).booleanValue();
    }

    public static boolean c() {
        return ((Boolean) f89798i.getValue()).booleanValue();
    }

    public static boolean d() {
        return ((Boolean) f89799j.getValue()).booleanValue();
    }

    private dl() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f89800a = new a();

        static {
            Covode.recordClassIndex(56412);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((dl.a() & dl.f89793d) == dl.f89793d) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f89801a = new b();

        static {
            Covode.recordClassIndex(56413);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((dl.a() & dl.f89792c) == dl.f89792c) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class c extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f89802a = new c();

        static {
            Covode.recordClassIndex(56414);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("first_frame_do_frame_opt", 0));
        }
    }

    static final class d extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f89803a = new d();

        static {
            Covode.recordClassIndex(56415);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((dl.a() & dl.f89791b) == dl.f89791b) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class e extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f89804a = new e();

        static {
            Covode.recordClassIndex(56416);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((dl.a() & dl.f89790a) == dl.f89790a) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(56411);
    }
}
