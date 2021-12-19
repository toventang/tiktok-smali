package com.ss.android.ugc.aweme.player.sdk.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.playerkit.exp.b;
import com.ss.android.ugc.playerkit.model.p;
import h.f.b.l;

public final class e {
    static {
        Covode.recordClassIndex(74097);
    }

    public static final boolean a(p pVar, c cVar) {
        l.c(pVar, "");
        l.c(cVar, "");
        if (cVar.f115378l != pVar.n) {
            int i2 = cVar.f115378l;
            return false;
        } else if (pVar.S == cVar.n && pVar.T == cVar.o) {
            return true;
        } else {
            int intValue = ((Number) b.f148676j.getValue()).intValue();
            int intValue2 = ((Number) b.f148677k.getValue()).intValue();
            if (Math.abs(pVar.S - cVar.n) < intValue || Math.abs(pVar.T - cVar.o) < intValue2) {
                return false;
            }
            return true;
        }
    }
}
