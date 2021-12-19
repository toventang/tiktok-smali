package com.bytedance.android.live.base.model.user;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class f implements b<SubscribeBadge> {
    static {
        Covode.recordClassIndex(3638);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ SubscribeBadge a(com.bytedance.android.e.a.a.f fVar) {
        return b(fVar);
    }

    public static SubscribeBadge b(com.bytedance.android.e.a.a.f fVar) {
        SubscribeBadge subscribeBadge = new SubscribeBadge();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return subscribeBadge;
            } else if (b2 == 3) {
                subscribeBadge.originImage = com.bytedance.android.live.base.model.f.b(fVar);
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                subscribeBadge.previewImage = com.bytedance.android.live.base.model.f.b(fVar);
            }
        }
    }
}
