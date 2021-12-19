package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class as implements b<x> {
    static {
        Covode.recordClassIndex(9952);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ x a(f fVar) {
        x xVar = new x();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return xVar;
            } else if (b2 != 1) {
                g.c(fVar);
            } else {
                xVar.f17962a = au.b(fVar);
            }
        }
    }
}
