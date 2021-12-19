package com.ss.android.ugc.aweme.shortvideo.widget.a;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;

public final class a implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    protected PointF f132890a;

    /* renamed from: b  reason: collision with root package name */
    protected PointF f132891b;

    /* renamed from: c  reason: collision with root package name */
    protected PointF f132892c;

    /* renamed from: d  reason: collision with root package name */
    protected PointF f132893d;

    /* renamed from: e  reason: collision with root package name */
    protected PointF f132894e;

    static {
        Covode.recordClassIndex(86925);
    }

    private static float a(float f2, float f3, float f4) {
        if (f2 == 0.0f || f2 == 1.0f) {
            return f2;
        }
        float f5 = ((f3 - 0.0f) * f2) + 0.0f;
        float f6 = f3 + ((f4 - f3) * f2);
        float f7 = f5 + ((f6 - f5) * f2);
        return f7 + (((f6 + (((f4 + ((1.0f - f4) * f2)) - f6) * f2)) - f7) * f2);
    }

    private float a(float f2) {
        return a(f2, this.f132890a.x, this.f132891b.x);
    }

    private static boolean a(PointF pointF) {
        if (pointF.x < 0.0f || pointF.x > 1.0f) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
        if (java.lang.Math.abs(r16 - r18) <= 1.0E-6f) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        if (r9 >= 8) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        if (r16 >= r18) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
        r1 = (r4 + r0) / 2.0f;
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007d, code lost:
        r4 = r1;
        r16 = a(r4);
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
        r1 = (r4 + r2) / 2.0f;
        r0 = r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float getInterpolation(float r18) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.widget.a.a.getInterpolation(float):float");
    }

    public a(PointF pointF, PointF pointF2) {
        if (!a(pointF)) {
            throw new RuntimeException("startX should be in [0, 1]");
        } else if (a(pointF2)) {
            this.f132890a = pointF;
            this.f132891b = pointF2;
            this.f132892c = new PointF();
            this.f132893d = new PointF();
            this.f132894e = new PointF();
        } else {
            throw new RuntimeException("endX should be in [0, 1]");
        }
    }

    public a(float f2, float f3, float f4, float f5) {
        this(new PointF(f2, f3), new PointF(f4, f5));
    }

    public a(double d2, double d3, double d4, double d5) {
        this(new PointF((float) d2, (float) d3), new PointF((float) d4, (float) d5));
    }
}
