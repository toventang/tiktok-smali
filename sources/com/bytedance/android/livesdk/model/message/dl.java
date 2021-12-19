package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class dl implements b<x> {
    static {
        Covode.recordClassIndex(11600);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ x a(f fVar) {
        return b(fVar);
    }

    public static x b(f fVar) {
        x xVar = new x();
        xVar.f19700a = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return xVar;
            } else if (b2 == 1) {
                xVar.f19700a.add(Long.valueOf(g.b(fVar)));
            } else if (b2 == 2) {
                xVar.f19701b = g.b(fVar);
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                xVar.f19702c = (int) g.b(fVar);
            }
        }
    }
}
