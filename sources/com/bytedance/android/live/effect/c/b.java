package com.bytedance.android.live.effect.c;

import com.bytedance.android.live.effect.api.a.j;
import com.bytedance.android.live.effect.g;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.effect.model.e;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;

public final class b implements j.d<FilterModel> {
    static {
        Covode.recordClassIndex(4941);
    }

    @Override // com.bytedance.android.live.effect.api.a.j.d
    public final List<e<FilterModel>> a(List<e<FilterModel>> list) {
        l.d(list, "");
        Iterator a2 = n.t(list).a();
        while (a2.hasNext()) {
            for (T t : ((e) a2.next()).f9890b) {
                if (!g.a(t.getEffect())) {
                    g.a(t.getEffect(), null);
                }
            }
        }
        return list;
    }
}
