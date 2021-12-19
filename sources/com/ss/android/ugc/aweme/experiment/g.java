package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.g.c;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final int f90122a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f90123b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static final h<Integer> f90124c = i.a((h.f.a.a) a.f90129a);

    /* renamed from: d  reason: collision with root package name */
    public static final g f90125d = new g();

    /* renamed from: e  reason: collision with root package name */
    private static final int f90126e = 180000;

    /* renamed from: f  reason: collision with root package name */
    private static final int f90127f = 240000;

    /* renamed from: g  reason: collision with root package name */
    private static final int f90128g = 300000;

    private g() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f90129a = new a();

        static {
            Covode.recordClassIndex(56541);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a("aot_delay_client_experiment", ClientExpManager.aot_delay_client_experiment()));
        }
    }

    public static boolean a() {
        if (c.f29648d && f90124c.getValue().intValue() != f90122a) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(56540);
    }
}
