package com.ss.android.ugc.aweme.themechange.base;

import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.dh;
import h.f.b.m;
import h.h;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final int f138704a = dh.b(i.f115645a);

    /* renamed from: b  reason: collision with root package name */
    static final float f138705b;

    /* renamed from: c  reason: collision with root package name */
    static final float f138706c = n.b(i.f115645a, 20.0f);

    /* renamed from: d  reason: collision with root package name */
    static final float f138707d = n.b(i.f115645a, 56.0f);

    /* renamed from: e  reason: collision with root package name */
    static final float f138708e = n.b(i.f115645a, 80.0f);

    /* renamed from: f  reason: collision with root package name */
    public static final b f138709f = new b();

    /* renamed from: g  reason: collision with root package name */
    private static final h f138710g = h.i.a((h.f.a.a) a.f138712a);

    /* renamed from: h  reason: collision with root package name */
    private static final float f138711h;

    public static float a() {
        return ((Number) f138710g.getValue()).floatValue();
    }

    private b() {
    }

    static final class a extends m implements h.f.a.a<Float> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f138712a = new a();

        static {
            Covode.recordClassIndex(90734);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            double d2 = (double) ((((float) b.f138704a) - b.f138706c) - (b.f138705b * 5.0f));
            Double.isNaN(d2);
            float f2 = (float) (d2 / 5.3d);
            if (f2 < b.f138707d) {
                f2 = b.f138707d;
            } else if (f2 > b.f138708e) {
                f2 = b.f138708e;
            }
            return Float.valueOf(f2);
        }
    }

    static {
        Covode.recordClassIndex(90733);
        float b2 = n.b(i.f115645a, 12.0f);
        f138705b = b2;
        f138711h = a() + b2;
    }
}
