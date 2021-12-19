package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdkapi.depend.model.live.s;
import com.bytedance.covode.number.Covode;

public final class an implements b<s.a> {
    static {
        Covode.recordClassIndex(13707);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ s.a a(f fVar) {
        return b(fVar);
    }

    public static s.a b(f fVar) {
        s.a aVar = new s.a();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return aVar;
            } else if (b2 == 1) {
                aVar.f23192a = g.a(fVar);
            } else if (b2 == 2) {
                aVar.f23194c = (int) fVar.f();
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                aVar.f23193b = g.a(fVar);
            }
        }
    }
}
