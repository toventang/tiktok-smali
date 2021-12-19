package com.ss.android.ugc.aweme.dsp.widget.vvpager;

import android.animation.TimeInterpolator;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;

public final class a implements TimeInterpolator {

    /* renamed from: a  reason: collision with root package name */
    protected PointF f84091a;

    /* renamed from: b  reason: collision with root package name */
    protected PointF f84092b;

    /* renamed from: c  reason: collision with root package name */
    protected PointF f84093c;

    /* renamed from: d  reason: collision with root package name */
    protected PointF f84094d;

    /* renamed from: e  reason: collision with root package name */
    protected PointF f84095e;

    static {
        Covode.recordClassIndex(52426);
    }

    public a() {
        this(new float[]{0.15f, 0.12f, 0.0f, 1.0f}[0], new float[]{0.15f, 0.12f, 0.0f, 1.0f}[1], new float[]{0.15f, 0.12f, 0.0f, 1.0f}[2], new float[]{0.15f, 0.12f, 0.0f, 1.0f}[3]);
    }

    public final float getInterpolation(float f2) {
        float f3 = f2;
        for (int i2 = 1; i2 < 14; i2++) {
            this.f84095e.x = this.f84091a.x * 3.0f;
            this.f84094d.x = ((this.f84092b.x - this.f84091a.x) * 3.0f) - this.f84095e.x;
            this.f84093c.x = (1.0f - this.f84095e.x) - this.f84094d.x;
            float f4 = ((this.f84095e.x + ((this.f84094d.x + (this.f84093c.x * f3)) * f3)) * f3) - f2;
            if (((double) Math.abs(f4)) < 0.001d) {
                break;
            }
            f3 -= f4 / (((((this.f84093c.x * 3.0f) * f3) + (this.f84094d.x * 2.0f)) * f3) + this.f84095e.x);
        }
        this.f84095e.y = this.f84091a.y * 3.0f;
        this.f84094d.y = ((this.f84092b.y - this.f84091a.y) * 3.0f) - this.f84095e.y;
        this.f84093c.y = (1.0f - this.f84094d.y) - this.f84095e.y;
        return ((((this.f84093c.y * f3) + this.f84094d.y) * f3) + this.f84095e.y) * f3;
    }

    private a(PointF pointF, PointF pointF2) {
        this.f84093c = new PointF();
        this.f84094d = new PointF();
        this.f84095e = new PointF();
        if (pointF.x < 0.0f || pointF.x > 1.0f) {
            throw new IllegalArgumentException("start x must be in the range [0, 1]");
        } else if (pointF2.x < 0.0f || pointF2.x > 1.0f) {
            throw new IllegalArgumentException("end x must be in the range [0, 1]");
        } else {
            this.f84091a = pointF;
            this.f84092b = pointF2;
        }
    }

    private a(float f2, float f3, float f4, float f5) {
        this(new PointF(f2, f3), new PointF(f4, f5));
    }
}
