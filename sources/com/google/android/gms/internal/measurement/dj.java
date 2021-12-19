package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class dj {
    static {
        Covode.recordClassIndex(31730);
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
}
