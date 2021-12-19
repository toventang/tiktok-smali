package com.bytedance.tux.widget.spring.a;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public float f45688a = 2000.0f;

    /* renamed from: b  reason: collision with root package name */
    public float f45689b = 0.55f;

    static {
        Covode.recordClassIndex(27802);
    }

    public final int a(int i2) {
        float f2 = (float) i2;
        float abs = Math.abs(f2);
        float f3 = this.f45688a;
        if (abs >= f3) {
            if (f2 > 0.0f) {
                f2 = f3 - 1.0f;
            } else {
                f2 = (-f3) + 1.0f;
            }
        }
        if (f2 == 0.0f) {
            return 0;
        }
        if (f2 > 0.0f) {
            float f4 = this.f45689b;
            return (int) ((((f3 * f3) / ((f3 - f2) * f4)) - (f3 / f4)) + 0.5f);
        }
        float f5 = this.f45689b;
        return -((int) ((((f3 * f3) / ((f2 + f3) * f5)) - (f3 / f5)) + 0.5f));
    }

    public final int a(int i2, int i3, int i4) {
        if (i2 > 0) {
            if (i4 >= 0) {
                float f2 = this.f45688a;
                i3 = (int) (((1.0f - (1.0f / (((this.f45689b * ((float) i2)) / f2) + 1.0f))) * f2) + 0.5f);
            }
        } else if (i4 <= 0) {
            float f3 = this.f45688a;
            i3 = (int) ((-((1.0f - (1.0f / ((((-this.f45689b) * ((float) i2)) / f3) + 1.0f))) * f3)) + 0.5f);
        }
        float f4 = (float) i3;
        float f5 = this.f45688a;
        if (f4 > f5 - 1.0f) {
            return (int) (f5 - 1.0f);
        }
        if (f4 < (-f5) + 1.0f) {
            return (int) ((-f5) + 1.0f);
        }
        return i3;
    }
}
