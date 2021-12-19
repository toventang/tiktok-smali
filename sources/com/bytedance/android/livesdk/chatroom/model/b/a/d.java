package com.bytedance.android.livesdk.chatroom.model.b.a;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class d implements b<a> {
    static {
        Covode.recordClassIndex(8675);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ a a(f fVar) {
        a aVar = new a();
        aVar.f15694a = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return aVar;
            } else if (b2 != 200) {
                g.c(fVar);
            } else {
                aVar.f15694a.add(e.b(fVar));
            }
        }
    }
}
