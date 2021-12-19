package com.ss.android.ugc.aweme.video.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f143263a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final h f143264b = i.a((h.f.a.a) C3818a.f143265a);

    private static double b() {
        return ((Number) f143264b.getValue()).doubleValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.video.b.a$a  reason: collision with other inner class name */
    static final class C3818a extends m implements h.f.a.a<Double> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3818a f143265a = new C3818a();

        static {
            Covode.recordClassIndex(93771);
        }

        C3818a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Double invoke() {
            return Double.valueOf(b.a().a(true, "allow_ad_custom_prefetch_policy", 1.0d));
        }
    }

    static {
        Covode.recordClassIndex(93770);
    }

    public static final double a() {
        if (b() < 1.0d || b() > 3.0d) {
            return 1.0d;
        }
        return b();
    }
}
