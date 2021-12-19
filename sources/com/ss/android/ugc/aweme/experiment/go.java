package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class go {

    /* renamed from: a  reason: collision with root package name */
    static final h f90154a = i.a((h.f.a.a) a.f90157a);

    /* renamed from: b  reason: collision with root package name */
    public static final h f90155b = i.a((h.f.a.a) b.f90158a);

    /* renamed from: c  reason: collision with root package name */
    public static final go f90156c = new go();

    private go() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f90157a = new a();

        static {
            Covode.recordClassIndex(56559);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("sky_eye_gson_flip", 1));
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f90158a = new b();

        static {
            Covode.recordClassIndex(56560);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((((Number) go.f90154a.getValue()).intValue() & 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(56558);
    }
}
