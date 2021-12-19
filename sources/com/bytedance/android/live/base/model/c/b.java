package com.bytedance.android.live.base.model.c;

import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.live.base.model.c.a;
import com.bytedance.covode.number.Covode;

public final class b implements com.bytedance.android.e.a.a.b<a.C0099a> {
    static {
        Covode.recordClassIndex(3588);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ a.C0099a a(f fVar) {
        return b(fVar);
    }

    public static a.C0099a b(f fVar) {
        a.C0099a aVar = new a.C0099a();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return aVar;
            } else if (b2 != 1) {
                g.c(fVar);
            } else {
                aVar.f7389a = fVar.d();
            }
        }
    }
}
