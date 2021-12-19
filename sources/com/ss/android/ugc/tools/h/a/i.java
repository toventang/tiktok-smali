package com.ss.android.ugc.tools.h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.p;

public final class i {
    static {
        Covode.recordClassIndex(98270);
    }

    public static final <KEY, RESULT, INFO> boolean a(h<KEY, RESULT, INFO> hVar, KEY key) {
        l.d(hVar, "");
        p<e, Boolean> b2 = hVar.b(key);
        if (b2 == null) {
            return false;
        }
        e component1 = b2.component1();
        if (component1 == e.PENDING || component1 == e.START) {
            return true;
        }
        return false;
    }
}
