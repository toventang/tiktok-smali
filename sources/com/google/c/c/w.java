package com.google.c.c;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class w {
    static {
        Covode.recordClassIndex(33539);
    }

    static int a(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return a(hashCode);
    }

    static int a(int i2) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i2) * -862048943), 15)) * 461845907);
    }

    static int a(int i2, double d2) {
        int max = Math.max(i2, 2);
        int highestOneBit = Integer.highestOneBit(max);
        double d3 = (double) highestOneBit;
        Double.isNaN(d3);
        if (max <= ((int) (d2 * d3))) {
            return highestOneBit;
        }
        int i3 = highestOneBit << 1;
        if (i3 > 0) {
            return i3;
        }
        return 1073741824;
    }
}
