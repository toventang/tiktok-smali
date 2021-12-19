package com.ss.android.ugc.aweme.social.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final int f133656a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f133657b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f133658c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f133659d = 3;

    /* renamed from: e  reason: collision with root package name */
    public static final int f133660e = 4;

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f133661f;

    /* renamed from: g  reason: collision with root package name */
    public static final e f133662g = new e();

    /* renamed from: h  reason: collision with root package name */
    private static final h f133663h = i.a((h.f.a.a) a.f133664a);

    public static int a() {
        return ((Number) f133663h.getValue()).intValue();
    }

    private e() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f133664a = new a();

        static {
            Covode.recordClassIndex(87432);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a(true, "follow_back_on_share_panel_type", 0));
        }
    }

    static {
        Covode.recordClassIndex(87431);
        boolean z = true;
        if (a() <= f133656a) {
            z = false;
        }
        f133661f = z;
    }
}
