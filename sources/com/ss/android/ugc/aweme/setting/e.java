package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final int f122180a = 0;

    /* renamed from: b  reason: collision with root package name */
    static final int f122181b = 1;

    /* renamed from: c  reason: collision with root package name */
    static final h f122182c = i.a((h.f.a.a) a.f122185a);

    /* renamed from: d  reason: collision with root package name */
    public static final e f122183d = new e();

    /* renamed from: e  reason: collision with root package name */
    private static final h f122184e = i.a((h.f.a.a) b.f122187a);

    public static boolean a() {
        return ((Boolean) f122184e.getValue()).booleanValue();
    }

    private e() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f122185a = new a();

        static {
            Covode.recordClassIndex(80104);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("cold_boot_cpu_monitor", e.f122180a));
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f122187a = new b();

        static {
            Covode.recordClassIndex(80105);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((((Number) e.f122182c.getValue()).intValue() & e.f122181b) == e.f122181b) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(80103);
    }
}
