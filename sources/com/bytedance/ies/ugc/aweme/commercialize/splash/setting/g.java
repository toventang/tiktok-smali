package com.bytedance.ies.ugc.aweme.commercialize.splash.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f34810a = new g();

    /* renamed from: b  reason: collision with root package name */
    private static final h f34811b = i.a((h.f.a.a) d.f34818a);

    /* renamed from: c  reason: collision with root package name */
    private static final h f34812c = i.a((h.f.a.a) a.f34815a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f34813d = i.a((h.f.a.a) b.f34816a);

    /* renamed from: e  reason: collision with root package name */
    private static final h f34814e = i.a((h.f.a.a) c.f34817a);

    public static int a() {
        return ((Number) f34811b.getValue()).intValue();
    }

    public static boolean b() {
        return ((Boolean) f34813d.getValue()).booleanValue();
    }

    public static boolean c() {
        return ((Boolean) f34814e.getValue()).booleanValue();
    }

    private g() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34815a = new a();

        static {
            Covode.recordClassIndex(20882);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (g.a() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34816a = new b();

        static {
            Covode.recordClassIndex(20883);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((g.a() & 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f34817a = new c();

        static {
            Covode.recordClassIndex(20884);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((g.a() & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class d extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f34818a = new d();

        static {
            Covode.recordClassIndex(20885);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("splash_downgrade", 0));
        }
    }

    static {
        Covode.recordClassIndex(20881);
    }
}
