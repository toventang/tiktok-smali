package com.ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.nativePort.d;
import h.f.b.l;
import h.n;

public final class bf {
    static {
        Covode.recordClassIndex(86619);
    }

    public static final int a(d.f fVar) {
        l.d(fVar, "");
        int i2 = bg.f132259a[fVar.ordinal()];
        if (i2 == 1) {
            return -1;
        }
        if (i2 == 2) {
            return 0;
        }
        if (i2 == 3) {
            return 1;
        }
        throw new n();
    }
}
