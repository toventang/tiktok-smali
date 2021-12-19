package com.facebook.imagepipeline.memory;

import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;

public final class t {
    static {
        Covode.recordClassIndex(29068);
    }

    static int a(int i2, int i3, int i4) {
        return Math.min(Math.max(0, i4 - i2), i3);
    }

    static void a(int i2, int i3, int i4, int i5, int i6) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (i5 >= 0) {
            z = true;
        } else {
            z = false;
        }
        i.a(z);
        if (i2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        i.a(z2);
        if (i4 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        i.a(z3);
        if (i2 + i5 <= i6) {
            z4 = true;
        } else {
            z4 = false;
        }
        i.a(z4);
        if (i4 + i5 > i3) {
            z5 = false;
        }
        i.a(z5);
    }
}
