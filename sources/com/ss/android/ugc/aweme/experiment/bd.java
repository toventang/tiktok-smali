package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class bd {

    /* renamed from: a  reason: collision with root package name */
    public static final bd f89599a = new bd();

    /* renamed from: b  reason: collision with root package name */
    private static final h f89600b = i.a((h.f.a.a) a.f89601a);

    public static int a() {
        return ((Number) f89600b.getValue()).intValue();
    }

    private bd() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f89601a = new a();

        static {
            Covode.recordClassIndex(56309);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepoSync("ab_repo_cold_boot", 1).getInt("cold_boot_optim_v2", 0));
        }
    }

    static {
        Covode.recordClassIndex(56308);
    }

    public static boolean b() {
        if (a() == 2 || a() == 3) {
            return true;
        }
        return false;
    }
}
