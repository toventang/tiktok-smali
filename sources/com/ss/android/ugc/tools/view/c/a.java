package com.ss.android.ugc.tools.view.c;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;

public class a implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    protected final PointF f150082a = new PointF();

    /* renamed from: b  reason: collision with root package name */
    protected final PointF f150083b = new PointF();

    /* renamed from: c  reason: collision with root package name */
    private int f150084c;

    static {
        Covode.recordClassIndex(98800);
    }

    private static double a(double d2, double d3, double d4) {
        double d5 = 1.0d - d2;
        double d6 = d2 * d2;
        double d7 = d5 * d5;
        return (d7 * d5 * 0.0d) + (d7 * 3.0d * d2 * d3) + (d5 * 3.0d * d6 * d4) + (d6 * d2 * 1.0d);
    }

    public float getInterpolation(float f2) {
        int i2 = this.f150084c;
        float f3 = f2;
        while (true) {
            if (i2 >= 4096) {
                break;
            }
            f3 = (((float) i2) * 1.0f) / 4096.0f;
            if (a((double) f3, (double) this.f150082a.x, (double) this.f150083b.x) >= ((double) f2)) {
                this.f150084c = i2;
                break;
            }
            i2++;
        }
        double a2 = a((double) f3, (double) this.f150082a.y, (double) this.f150083b.y);
        if (a2 > 0.999d) {
            a2 = 1.0d;
            this.f150084c = 0;
        }
        return (float) a2;
    }
}
