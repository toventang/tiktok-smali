package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class ap {

    /* renamed from: a  reason: collision with root package name */
    public static final ap f89554a = new ap();

    /* renamed from: b  reason: collision with root package name */
    private static final h f89555b = i.a((h.f.a.a) a.f89556a);

    public static int a() {
        return ((Number) f89555b.getValue()).intValue();
    }

    private ap() {
    }

    public static boolean b() {
        if (a() != 0) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        if (a() == 2) {
            return true;
        }
        return false;
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f89556a = new a();

        static {
            Covode.recordClassIndex(56285);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a(true, "viewpager_load_delay_phase", 0));
        }
    }

    static {
        Covode.recordClassIndex(56284);
    }
}
