package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class fa {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f90019a;

    /* renamed from: b  reason: collision with root package name */
    public static final fa f90020b = new fa();

    /* renamed from: c  reason: collision with root package name */
    private static final h f90021c;

    private fa() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f90022a = new a();

        static {
            Covode.recordClassIndex(56500);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a(true, "copy_optimisation_group", 0));
        }
    }

    static {
        boolean z;
        Covode.recordClassIndex(56499);
        h a2 = i.a((h.f.a.a) a.f90022a);
        f90021c = a2;
        if (((Number) a2.getValue()).intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        f90019a = z;
    }
}
