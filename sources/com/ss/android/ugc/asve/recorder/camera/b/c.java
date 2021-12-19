package com.ss.android.ugc.asve.recorder.camera.b;

import android.animation.TimeInterpolator;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;

public final class c implements TimeInterpolator {

    /* renamed from: a  reason: collision with root package name */
    private final int f62238a = 4096;

    /* renamed from: b  reason: collision with root package name */
    private int f62239b;

    /* renamed from: c  reason: collision with root package name */
    private final PointF f62240c = new PointF(0.75f, 0.0f);

    /* renamed from: d  reason: collision with root package name */
    private final PointF f62241d = new PointF(0.65f, 1.0f);

    static {
        Covode.recordClassIndex(38249);
    }

    private static double a(double d2, double d3, double d4) {
        double d5 = 1.0d - d2;
        double d6 = d2 * d2;
        double d7 = d5 * d5;
        return (d7 * d5 * 0.0d) + (d7 * 3.0d * d2 * d3) + (d5 * 3.0d * d6 * d4) + (d6 * d2 * 1.0d);
    }

    public final float getInterpolation(float f2) {
        float f3;
        double d2 = (double) f2;
        if (d2 > 0.2d) {
            f3 = 1.0f;
        } else {
            Double.isNaN(d2);
            f3 = (float) (d2 / 0.2d);
        }
        int i2 = this.f62239b;
        int i3 = this.f62238a;
        float f4 = f3;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            f4 = (((float) i2) * 1.0f) / ((float) this.f62238a);
            if (a((double) f4, (double) this.f62240c.x, (double) this.f62241d.x) >= ((double) f3)) {
                this.f62239b = i2;
                break;
            }
            i2++;
        }
        double a2 = a((double) f4, (double) this.f62240c.y, (double) this.f62241d.y);
        if (a2 > 0.999d) {
            a2 = 1.0d;
            this.f62239b = 0;
        }
        return (float) a2;
    }
}
