package com.lynx.tasm.behavior.ui.a;

import com.bytedance.covode.number.Covode;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private final int f56120a;

    /* renamed from: b  reason: collision with root package name */
    private final float f56121b;

    static {
        Covode.recordClassIndex(35055);
    }

    public f(double d2) {
        float f2 = (float) d2;
        this.f56121b = f2;
        if (f2 >= 0.0f) {
            this.f56120a = 0;
        } else {
            this.f56120a = (int) f2;
        }
    }

    public final float a(float f2) {
        float f3 = this.f56121b;
        if (f3 < 0.0f) {
            int i2 = this.f56120a;
            if (i2 == -36) {
                return f2 * 0.5f;
            }
            if (i2 == -34 || i2 == -33) {
                return f2;
            }
            return 0.0f;
        } else if (0.0f >= f3 || f3 > 1.0f) {
            return f3;
        } else {
            return f3 * f2;
        }
    }
}
