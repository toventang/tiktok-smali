package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class bg {

    /* renamed from: a  reason: collision with root package name */
    public static final bg f89604a = new bg();

    /* renamed from: b  reason: collision with root package name */
    private static final h f89605b = i.a((h.f.a.a) a.f89606a);

    public static int a() {
        return ((Number) f89605b.getValue()).intValue();
    }

    private bg() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f89606a = new a();

        static {
            Covode.recordClassIndex(56313);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("cold_boot_preload_class", 0));
        }
    }

    static {
        Covode.recordClassIndex(56312);
    }
}
