package com.ss.android.ugc.tools.infosticker.view.internal.base;

import com.bytedance.covode.number.Covode;
import h.p;
import h.v;
import java.util.Map;

public final class c {
    static {
        Covode.recordClassIndex(98501);
    }

    public static final <DATA> p<com.ss.android.ugc.tools.h.a.c, Integer> a(Map<DATA, ? extends p<? extends com.ss.android.ugc.tools.h.a.c, Integer>> map, DATA data) {
        p<com.ss.android.ugc.tools.h.a.c, Integer> pVar = (p) map.get(data);
        if (pVar == null) {
            return v.a(com.ss.android.ugc.tools.h.a.c.UNKNOWN, 0);
        }
        return pVar;
    }
}
