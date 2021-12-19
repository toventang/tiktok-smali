package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class ao {

    /* renamed from: a  reason: collision with root package name */
    public static final ao f89551a = new ao();

    /* renamed from: b  reason: collision with root package name */
    private static final h f89552b = i.a((h.f.a.a) a.f89553a);

    public static int a() {
        return ((Number) f89552b.getValue()).intValue();
    }

    private ao() {
    }

    public static boolean b() {
        if (a() != -1) {
            return true;
        }
        return false;
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f89553a = new a();

        static {
            Covode.recordClassIndex(56283);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a(true, "feed_adapter_get_view_delay", -1));
        }
    }

    static {
        Covode.recordClassIndex(56282);
    }
}
