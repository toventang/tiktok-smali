package com.bytedance.android.livesdk.envelope.a;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class h implements b<e> {
    static {
        Covode.recordClassIndex(9516);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ e a(f fVar) {
        e eVar = new e((char) 0);
        eVar.f17151a = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return eVar;
            } else if (b2 != 1) {
                g.c(fVar);
            } else {
                eVar.f17151a.add(g.b(fVar));
            }
        }
    }
}
