package com.facebook.drawee.a.a.b;

import com.bytedance.covode.number.Covode;

public final class d {
    static {
        Covode.recordClassIndex(28728);
    }

    public static String a(int i2) {
        return i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? i2 != 6 ? "unknown" : "local" : "memory_bitmap" : "memory_encoded" : "disk" : "network";
    }
}
