package com.bytedance.android.livesdk.model.message.d.a;

import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class b implements com.bytedance.android.e.a.a.b<a> {
    static {
        Covode.recordClassIndex(11551);
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
                aVar.f19504a = fVar.f();
            } else if (b2 == 2) {
                aVar.f19505b = fVar.f();
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                aVar.f19506c = (int) fVar.f();
            }
        }
    }
}
