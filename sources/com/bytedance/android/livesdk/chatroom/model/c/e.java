package com.bytedance.android.livesdk.chatroom.model.c;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class e implements b<b> {
    static {
        Covode.recordClassIndex(8695);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ b a(f fVar) {
        b bVar = new b();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return bVar;
            } else if (b2 == 1) {
                bVar.f15744a = g.a(fVar);
            } else if (b2 == 2) {
                bVar.f15745b = fVar.e();
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                bVar.f15746c = fVar.e();
            }
        }
    }
}
