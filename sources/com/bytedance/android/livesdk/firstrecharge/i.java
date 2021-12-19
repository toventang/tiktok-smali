package com.bytedance.android.livesdk.firstrecharge;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class i implements b<b> {
    static {
        Covode.recordClassIndex(9857);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ b a(f fVar) {
        return b(fVar);
    }

    public static b b(f fVar) {
        b bVar = new b();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return bVar;
            } else if (b2 == 1) {
                bVar.f17729a = g.a(fVar);
            } else if (b2 == 2) {
                bVar.f17730b.add(Integer.valueOf(fVar.e()));
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                bVar.f17731c = fVar.e();
            }
        }
    }
}
