package com.ss.android.ugc.aweme.account.network;

import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.g;
import h.f.b.l;
import java.util.Map;

public final class e {
    static {
        Covode.recordClassIndex(40100);
    }

    public static final String a(g gVar, Map<String, String> map) {
        l.d(gVar, "");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                gVar.a(entry.getKey(), entry.getValue());
            }
        }
        String a2 = gVar.a();
        l.b(a2, "");
        return a2;
    }
}
