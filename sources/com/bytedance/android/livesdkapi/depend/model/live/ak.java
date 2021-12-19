package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class ak implements b<r> {
    static {
        Covode.recordClassIndex(13704);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ r a(f fVar) {
        r rVar = new r();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return rVar;
            } else if (b2 == 1) {
                rVar.f23174a = fVar.f();
            } else if (b2 == 2) {
                rVar.f23175b = fVar.d();
            } else if (b2 == 3) {
                rVar.f23176c = fVar.f();
            } else if (b2 == 4) {
                rVar.f23177d = fVar.f();
            } else if (b2 != 5) {
                g.c(fVar);
            } else {
                rVar.f23178e = fVar.f();
            }
        }
    }
}
