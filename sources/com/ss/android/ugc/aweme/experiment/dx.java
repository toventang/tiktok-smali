package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class dx {

    /* renamed from: a  reason: collision with root package name */
    public static final dx f89859a = new dx();

    /* renamed from: b  reason: collision with root package name */
    private static final h f89860b = i.a((h.f.a.a) a.f89861a);

    public static int a() {
        return ((Number) f89860b.getValue()).intValue();
    }

    private dx() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f89861a = new a();

        static {
            Covode.recordClassIndex(56436);
        }

        a() {
            super(0);
        }

        private static int a() {
            try {
                return Keva.getRepo("ab_repo_cold_boot").getInt("infra_cold_boot_opt", 0);
            } catch (Throwable unused) {
                return 0;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(a());
        }
    }

    public static boolean b() {
        if ((a() & 8) != 0) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(56435);
    }
}
