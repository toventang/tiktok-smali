package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class ge implements b<ch> {
    static {
        Covode.recordClassIndex(11679);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ ch a(f fVar) {
        return b(fVar);
    }

    public static ch b(f fVar) {
        ch chVar = new ch();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return chVar;
            } else if (b2 == 1) {
                chVar.f19477a = gd.b(fVar);
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                chVar.f19478b = gd.b(fVar);
            }
        }
    }
}
