package com.bytedance.android.livesdk.chatroom.interact.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class j implements b<a> {
    static {
        Covode.recordClassIndex(8621);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ a a(f fVar) {
        return b(fVar);
    }

    public static a b(f fVar) {
        a aVar = new a();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return aVar;
            } else if (b2 == 1) {
                aVar.f15575a = g.a(fVar);
            } else if (b2 == 2) {
                aVar.f15576b = g.a(fVar);
            } else if (b2 == 3) {
                aVar.f15577c = g.a(fVar);
            } else if (b2 == 4) {
                aVar.f15578d = g.a(fVar);
            } else if (b2 != 5) {
                g.c(fVar);
            } else {
                aVar.f15579e = g.a(fVar);
            }
        }
    }
}
