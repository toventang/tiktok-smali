package com.lynx.tasm.behavior.ui.a;

import com.bytedance.covode.number.Covode;

public class i {

    /* renamed from: a  reason: collision with root package name */
    final int f56125a;

    /* renamed from: b  reason: collision with root package name */
    private final float f56126b;

    static {
        Covode.recordClassIndex(35058);
    }

    public final boolean a() {
        if (this.f56125a == -32) {
            return true;
        }
        return false;
    }

    public i(double d2) {
        float f2 = (float) d2;
        this.f56126b = f2;
        if (f2 >= 0.0f) {
            this.f56125a = 0;
        } else {
            this.f56125a = (int) f2;
        }
    }

    public final float a(float f2, float f3) {
        float f4 = this.f56126b;
        if (0.0f < f4 && f4 <= 1.0f) {
            return f4 * f2;
        }
        if (a()) {
            return f3;
        }
        return this.f56126b;
    }
}
