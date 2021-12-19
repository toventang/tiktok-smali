package com.bytedance.android.live.effect.e;

import com.bytedance.android.live.effect.api.a.j;
import com.bytedance.android.live.effect.model.e;
import com.bytedance.android.livesdkapi.depend.model.a;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;

public final class g implements j.d<a> {
    static {
        Covode.recordClassIndex(5015);
    }

    @Override // com.bytedance.android.live.effect.api.a.j.d
    public final List<e<a>> a(List<e<a>> list) {
        l.d(list, "");
        Iterator a2 = n.t(list).a();
        while (a2.hasNext()) {
            for (T t : ((e) a2.next()).f9890b) {
                if (!com.bytedance.android.live.effect.g.a((a) t)) {
                    com.bytedance.android.live.effect.g.a(t.q, null);
                }
            }
        }
        return list;
    }
}
