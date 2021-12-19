package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.ch;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class gc implements b<cf> {
    static {
        Covode.recordClassIndex(11677);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ cf a(f fVar) {
        cf cfVar = new cf();
        cfVar.f19476a = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return cfVar;
            } else if (b2 == 1) {
                cfVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                cfVar.f19476a.add(ch.b(fVar));
            }
        }
    }
}
