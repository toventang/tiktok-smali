package com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class d {
    static {
        Covode.recordClassIndex(55201);
    }

    public static final c a(e eVar) {
        l.d(eVar, "");
        Map<String, c> map = eVar.f87774a;
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, c> entry : map.entrySet()) {
            arrayList.add(entry.getValue());
        }
        return (c) n.h((List) arrayList);
    }
}
