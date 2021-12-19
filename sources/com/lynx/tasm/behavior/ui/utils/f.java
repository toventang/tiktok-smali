package com.lynx.tasm.behavior.ui.utils;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.shadow.g;
import com.lynx.tasm.utils.c;

public class f {

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f56416b = {1, 2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a  reason: collision with root package name */
    public final float[] f56417a;

    /* renamed from: c  reason: collision with root package name */
    private int f56418c;

    /* renamed from: d  reason: collision with root package name */
    private float f56419d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f56420e;

    public f() {
        this(0.0f);
    }

    static {
        Covode.recordClassIndex(35195);
    }

    public f(float f2) {
        this.f56417a = new float[]{1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f};
        this.f56418c = 0;
        this.f56419d = f2;
    }

    public final float a(int i2) {
        float f2;
        char c2;
        if (i2 == 4 || i2 == 5) {
            f2 = 1.0E21f;
        } else {
            f2 = this.f56419d;
        }
        int i3 = this.f56418c;
        if (i3 == 0) {
            return f2;
        }
        int[] iArr = f56416b;
        if ((iArr[i2] & i3) != 0) {
            return this.f56417a[i2];
        }
        if (this.f56420e) {
            if (i2 == 1 || i2 == 3) {
                c2 = 7;
            } else {
                c2 = 6;
            }
            if ((iArr[c2] & i3) != 0) {
                return this.f56417a[c2];
            }
            if ((i3 & iArr[8]) != 0) {
                return this.f56417a[8];
            }
        }
        return f2;
    }

    public final boolean a(int i2, float f2) {
        boolean z = false;
        if (c.a(this.f56417a[i2], f2)) {
            return false;
        }
        this.f56417a[i2] = f2;
        if (g.a(f2)) {
            this.f56418c = (f56416b[i2] ^ -1) & this.f56418c;
        } else {
            this.f56418c = f56416b[i2] | this.f56418c;
        }
        int i3 = this.f56418c;
        int[] iArr = f56416b;
        if (!((iArr[8] & i3) == 0 && (iArr[7] & i3) == 0 && (i3 & iArr[6]) == 0)) {
            z = true;
        }
        this.f56420e = z;
        return true;
    }
}
