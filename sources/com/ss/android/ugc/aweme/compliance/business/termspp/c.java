package com.ss.android.ugc.aweme.compliance.business.termspp;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f77262a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final h f77263b = i.a((h.f.a.a) a.f77264a);

    public static int a() {
        return ((Number) f77263b.getValue()).intValue();
    }

    private c() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f77264a = new a();

        static {
            Covode.recordClassIndex(47778);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a("kr_consent_box_optimization", ClientExpManager.kr_consent_box_optimization()));
        }
    }

    static {
        Covode.recordClassIndex(47777);
    }
}
