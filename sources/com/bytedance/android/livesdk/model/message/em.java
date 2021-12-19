package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.message.ay;
import com.bytedance.covode.number.Covode;

public final class em implements b<ay.a> {
    static {
        Covode.recordClassIndex(11633);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ ay.a a(f fVar) {
        return b(fVar);
    }

    public static ay.a b(f fVar) {
        ay.a aVar = new ay.a();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return aVar;
            } else if (b2 != 1) {
                g.c(fVar);
            } else {
                aVar.f19232a = fv.b(fVar);
            }
        }
    }
}
