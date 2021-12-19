package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class au {

    /* renamed from: a  reason: collision with root package name */
    public static final au f89563a = new au();

    /* renamed from: b  reason: collision with root package name */
    private static final h f89564b = i.a((h.f.a.a) a.f89565a);

    private au() {
    }

    public static boolean a() {
        return ((Boolean) f89564b.getValue()).booleanValue();
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f89565a = new a();

        static {
            Covode.recordClassIndex(56292);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepo("ab_repo_cold_boot", 1).getBoolean("layoutinfalter_hook", false));
        }
    }

    static {
        Covode.recordClassIndex(56291);
    }
}
