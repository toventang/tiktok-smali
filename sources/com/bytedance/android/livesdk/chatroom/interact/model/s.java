package com.bytedance.android.livesdk.chatroom.interact.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.chatroom.interact.model.i;
import com.bytedance.covode.number.Covode;

public final class s implements b<i.a> {
    static {
        Covode.recordClassIndex(8630);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ i.a a(f fVar) {
        return b(fVar);
    }

    public static i.a b(f fVar) {
        i.a aVar = new i.a();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return aVar;
            } else if (b2 == 1) {
                aVar.f15626a = fVar.d();
            } else if (b2 == 2) {
                aVar.f15627b = fVar.d();
            } else if (b2 == 3) {
                aVar.f15628c = fVar.d();
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                aVar.f15629d = g.a(fVar);
            }
        }
    }
}
