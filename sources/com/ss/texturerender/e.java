package com.ss.texturerender;

import com.bytedance.covode.number.Covode;
import com.ss.texturerender.a.d;
import com.ss.texturerender.b.c;

public final class e {
    static {
        Covode.recordClassIndex(101251);
    }

    public static n a(d dVar, int i2) {
        if ((i2 & 4) > 0) {
            return new c(dVar, i2);
        }
        return new q(dVar, i2);
    }
}
