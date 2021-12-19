package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class fh {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f90038a = true;

    /* renamed from: b  reason: collision with root package name */
    static final h f90039b = i.a((h.f.a.a) a.f90042a);

    /* renamed from: c  reason: collision with root package name */
    public static final fh f90040c = new fh();

    /* renamed from: d  reason: collision with root package name */
    private static final h f90041d = i.a((h.f.a.a) b.f90043a);

    public static final boolean a() {
        return ((Boolean) f90041d.getValue()).booleanValue();
    }

    private fh() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f90042a = new a();

        static {
            Covode.recordClassIndex(56508);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("player_resume_experiment", 0));
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f90043a = new b();

        static {
            Covode.recordClassIndex(56509);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (!fh.f90038a || ((Number) fh.f90039b.getValue()).intValue() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(56507);
    }
}
