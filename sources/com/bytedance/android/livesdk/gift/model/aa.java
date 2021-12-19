package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class aa implements b<DoodleTemplate> {
    static {
        Covode.recordClassIndex(9934);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ DoodleTemplate a(f fVar) {
        return b(fVar);
    }

    public static DoodleTemplate b(f fVar) {
        DoodleTemplate doodleTemplate = new DoodleTemplate();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return doodleTemplate;
            } else if (b2 == 1) {
                doodleTemplate.id = fVar.f();
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                doodleTemplate.image = com.bytedance.android.live.base.model.f.b(fVar);
            }
        }
    }
}
