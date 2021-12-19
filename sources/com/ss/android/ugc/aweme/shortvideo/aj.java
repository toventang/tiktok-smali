package com.ss.android.ugc.aweme.shortvideo;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;

public final class aj implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    protected PointF f124949a;

    /* renamed from: b  reason: collision with root package name */
    protected PointF f124950b;

    /* renamed from: c  reason: collision with root package name */
    protected PointF f124951c;

    /* renamed from: d  reason: collision with root package name */
    protected PointF f124952d;

    /* renamed from: e  reason: collision with root package name */
    protected PointF f124953e;

    static {
        Covode.recordClassIndex(82086);
    }

    public aj() {
        this(0.28f, 0.59f, 0.0f);
    }

    public final float getInterpolation(float f2) {
        float f3 = f2;
        for (int i2 = 1; i2 < 14; i2++) {
            this.f124953e.x = this.f124949a.x * 3.0f;
            this.f124952d.x = ((this.f124950b.x - this.f124949a.x) * 3.0f) - this.f124953e.x;
            this.f124951c.x = (1.0f - this.f124953e.x) - this.f124952d.x;
            float f4 = ((this.f124953e.x + ((this.f124952d.x + (this.f124951c.x * f3)) * f3)) * f3) - f2;
            if (((double) Math.abs(f4)) < 0.001d) {
                break;
            }
            f3 -= f4 / (this.f124953e.x + (((this.f124952d.x * 2.0f) + ((this.f124951c.x * 3.0f) * f3)) * f3));
        }
        this.f124953e.y = this.f124949a.y * 3.0f;
        this.f124952d.y = ((this.f124950b.y - this.f124949a.y) * 3.0f) - this.f124953e.y;
        this.f124951c.y = (1.0f - this.f124953e.y) - this.f124952d.y;
        return f3 * (this.f124953e.y + ((this.f124952d.y + (this.f124951c.y * f3)) * f3));
    }

    private aj(PointF pointF, PointF pointF2) {
        this.f124951c = new PointF();
        this.f124952d = new PointF();
        this.f124953e = new PointF();
        if (pointF.x < 0.0f || pointF.x > 1.0f) {
            throw new IllegalArgumentException("startX value must be in the range [0, 1]");
        } else if (pointF2.x < 0.0f || pointF2.x > 1.0f) {
            throw new IllegalArgumentException("endX value must be in the range [0, 1]");
        } else {
            this.f124949a = pointF;
            this.f124950b = pointF2;
        }
    }

    public aj(float f2, float f3, float f4) {
        this(new PointF(f2, f3), new PointF(f4, 1.0f));
    }
}
