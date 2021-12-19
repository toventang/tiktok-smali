package com.bytedance.android.live.core.widget;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;

public class c implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    protected final PointF f9352a;

    /* renamed from: b  reason: collision with root package name */
    protected final PointF f9353b;

    /* renamed from: c  reason: collision with root package name */
    private int f9354c;

    static {
        Covode.recordClassIndex(4764);
    }

    private static double a(double d2, double d3, double d4) {
        double d5 = 1.0d - d2;
        double d6 = d2 * d2;
        double d7 = d5 * d5;
        return (d7 * d5 * 0.0d) + (d7 * 3.0d * d2 * d3) + (d5 * 3.0d * d6 * d4) + (d6 * d2 * 1.0d);
    }

    public c() {
        this.f9352a = new PointF();
        this.f9353b = new PointF();
    }

    public c(byte b2) {
        PointF pointF = new PointF();
        this.f9352a = pointF;
        PointF pointF2 = new PointF();
        this.f9353b = pointF2;
        pointF.x = 0.32f;
        pointF.y = 0.94f;
        pointF2.x = 0.6f;
        pointF2.y = 1.0f;
    }

    public float getInterpolation(float f2) {
        int i2 = this.f9354c;
        float f3 = f2;
        while (true) {
            if (i2 >= 4096) {
                break;
            }
            f3 = (((float) i2) * 1.0f) / 4096.0f;
            if (a((double) f3, (double) this.f9352a.x, (double) this.f9353b.x) >= ((double) f2)) {
                this.f9354c = i2;
                break;
            }
            i2++;
        }
        double a2 = a((double) f3, (double) this.f9352a.y, (double) this.f9353b.y);
        if (a2 > 0.999d) {
            a2 = 1.0d;
            this.f9354c = 0;
        }
        return (float) a2;
    }
}
