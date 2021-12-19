package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class bc {

    /* renamed from: a  reason: collision with root package name */
    public static final bc f89596a = new bc();

    /* renamed from: b  reason: collision with root package name */
    private static final h f89597b = i.a((h.f.a.a) a.f89598a);

    public static int a() {
        return ((Number) f89597b.getValue()).intValue();
    }

    private bc() {
    }

    public static boolean b() {
        if (a() == 3) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        if (a() == 1) {
            return true;
        }
        return false;
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f89598a = new a();

        static {
            Covode.recordClassIndex(56307);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepoSync("ab_repo_cold_boot", 1).getInt("cold_boot_optim_v1", 0));
        }
    }

    static {
        Covode.recordClassIndex(56306);
    }
}
