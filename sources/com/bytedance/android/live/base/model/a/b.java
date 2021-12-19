package com.bytedance.android.live.base.model.a;

import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class b implements com.bytedance.android.e.a.a.b<a> {
    static {
        Covode.recordClassIndex(3582);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ a a(f fVar) {
        a aVar = new a();
        aVar.f7374b = new ArrayList();
        long a2 = fVar.a();
        while (fVar.b() != -1) {
            g.c(fVar);
        }
        fVar.a(a2);
        return aVar;
    }
}
