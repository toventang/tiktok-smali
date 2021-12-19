package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class ap implements b<u> {
    static {
        Covode.recordClassIndex(9949);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ u a(f fVar) {
        return b(fVar);
    }

    public static u b(f fVar) {
        u uVar = new u();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return uVar;
            } else if (b2 == 1) {
                uVar.f17944a = fVar.f();
            } else if (b2 == 2) {
                uVar.f17945b = fVar.f();
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                uVar.f17946c = fVar.f();
            }
        }
    }
}
