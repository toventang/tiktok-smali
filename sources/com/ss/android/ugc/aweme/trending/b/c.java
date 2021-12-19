package com.ss.android.ugc.aweme.trending.b;

import android.animation.TimeInterpolator;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.af;

public final class c implements TimeInterpolator {

    /* renamed from: a  reason: collision with root package name */
    public static final a f141064a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final PointF f141065b;

    /* renamed from: c  reason: collision with root package name */
    private final PointF f141066c;

    /* renamed from: d  reason: collision with root package name */
    private final PointF f141067d = new PointF(0.0f, 0.0f);

    /* renamed from: e  reason: collision with root package name */
    private final PointF f141068e = new PointF(1.0f, 1.0f);

    /* renamed from: f  reason: collision with root package name */
    private final af f141069f;

    static {
        Covode.recordClassIndex(92087);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(92088);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public c() {
        PointF pointF = new PointF(0.15f, 0.0f);
        this.f141065b = pointF;
        PointF pointF2 = new PointF(0.85f, 1.0f);
        this.f141066c = pointF2;
        this.f141069f = new af(pointF, pointF2);
    }

    public final float getInterpolation(float f2) {
        if (com.ss.android.ugc.aweme.trending.c.a.a(f2, 0.0f)) {
            return 1.0f;
        }
        if (f2 < 0.4f) {
            return 1.0f - (this.f141069f.evaluate(f2 / 0.4f, this.f141067d, this.f141068e).y * 0.14999998f);
        }
        if (f2 > 0.6f) {
            return (this.f141069f.evaluate((f2 - 0.6f) / 0.39999998f, this.f141067d, this.f141068e).y * 0.14999998f) + 0.85f;
        }
        return 0.85f;
    }
}
