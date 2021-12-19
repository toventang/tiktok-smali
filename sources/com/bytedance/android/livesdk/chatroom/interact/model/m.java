package com.bytedance.android.livesdk.chatroom.interact.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class m implements b<d> {
    static {
        Covode.recordClassIndex(8624);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ d a(f fVar) {
        d dVar = new d();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return dVar;
            } else if (b2 == 1) {
                dVar.f15584a = g.a(fVar);
            } else if (b2 == 2) {
                dVar.f15585b = fVar.d();
            } else if (b2 == 3) {
                dVar.f15586c = fVar.d();
            } else if (b2 == 4) {
                dVar.f15587d = g.a(fVar);
            } else if (b2 != 5) {
                g.c(fVar);
            } else {
                dVar.f15588e = fVar.d();
            }
        }
    }
}
