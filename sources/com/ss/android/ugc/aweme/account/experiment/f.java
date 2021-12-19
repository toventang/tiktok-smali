package com.ss.android.ugc.aweme.account.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class f extends g {

    /* renamed from: a  reason: collision with root package name */
    public static final f f62988a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static final int f62989b = 1;

    /* renamed from: c  reason: collision with root package name */
    private static final int f62990c = 2;

    /* renamed from: d  reason: collision with root package name */
    private static final int f62991d = 3;

    /* renamed from: e  reason: collision with root package name */
    private static final h f62992e = i.a((h.f.a.a) a.f62993a);

    private static int d() {
        return ((Number) f62992e.getValue()).intValue();
    }

    private f() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f62993a = new a();

        static {
            Covode.recordClassIndex(38803);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a("gm_age_gate_education", ClientExpManager.gm_age_gate_education()));
        }
    }

    static {
        Covode.recordClassIndex(38802);
    }

    public final boolean a() {
        if (c() && d() == f62989b) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (!c()) {
            return false;
        }
        if (d() == f62989b || d() == f62990c) {
            return true;
        }
        return false;
    }
}
