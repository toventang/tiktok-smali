package com.bytedance.ies.ugc.statisticlogger.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f35322a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final h f35323b = i.a((h.f.a.a) c.f35328a);

    /* renamed from: c  reason: collision with root package name */
    private static final h f35324c = i.a((h.f.a.a) C0803a.f35326a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f35325d = i.a((h.f.a.a) b.f35327a);

    public static int a() {
        return ((Number) f35323b.getValue()).intValue();
    }

    public static boolean b() {
        return ((Boolean) f35324c.getValue()).booleanValue();
    }

    public static boolean c() {
        return ((Boolean) f35325d.getValue()).booleanValue();
    }

    private a() {
    }

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.b.a$a  reason: collision with other inner class name */
    static final class C0803a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0803a f35326a = new C0803a();

        static {
            Covode.recordClassIndex(21149);
        }

        C0803a() {
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

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f35327a = new b();

        static {
            Covode.recordClassIndex(21150);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((a.a() & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class c extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f35328a = new c();

        static {
            Covode.recordClassIndex(21151);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("applog_cold_boot_downgrade", 0));
        }
    }

    static {
        Covode.recordClassIndex(21148);
    }
}
