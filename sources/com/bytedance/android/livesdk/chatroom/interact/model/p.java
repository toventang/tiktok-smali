package com.bytedance.android.livesdk.chatroom.interact.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class p implements b<h> {
    static {
        Covode.recordClassIndex(8627);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ h a(f fVar) {
        return b(fVar);
    }

    public static h b(f fVar) {
        h hVar = new h();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return hVar;
            } else if (b2 == 1) {
                hVar.f15616a = fVar.d();
            } else if (b2 == 2) {
                hVar.f15617b = fVar.e();
            } else if (b2 == 3) {
                hVar.f15618c = fVar.d();
            } else if (b2 == 4) {
                hVar.f15619d = fVar.e();
            } else if (b2 == 6) {
                hVar.f15620e = j.b(fVar);
            } else if (b2 != 8) {
                g.c(fVar);
            } else {
                hVar.f15621f = fVar.e();
            }
        }
    }
}
