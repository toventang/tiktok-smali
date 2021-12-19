package com.ss.android.ugc.aweme.publish.h;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.publish.c;
import com.ss.android.ugc.aweme.shortvideo.ai;
import h.f.b.l;
import java.util.LinkedHashMap;

final class b implements c {
    static {
        Covode.recordClassIndex(77156);
    }

    @Override // com.ss.android.ugc.aweme.publish.c
    public final q<? extends ai> a(LinkedHashMap<String, String> linkedHashMap) {
        l.d(linkedHashMap, "");
        q<? extends ai> a2 = com.ss.android.ugc.aweme.port.in.c.r.a(linkedHashMap);
        l.b(a2, "");
        return a2;
    }
}
