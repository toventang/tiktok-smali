package com.bytedance.android.live.base.model.live;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class f implements b<c> {
    static {
        Covode.recordClassIndex(3606);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ c a(com.bytedance.android.e.a.a.f fVar) {
        c cVar = new c();
        cVar.f7411c = new ArrayList();
        long a2 = fVar.a();
        while (fVar.b() != -1) {
            g.c(fVar);
        }
        fVar.a(a2);
        return cVar;
    }
}
