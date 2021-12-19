package com.bytedance.android.livesdk.model.message.d.b;

import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.message.d.f.d;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class b implements com.bytedance.android.e.a.a.b<a> {
    static {
        Covode.recordClassIndex(11553);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ a a(f fVar) {
        return b(fVar);
    }

    public static a b(f fVar) {
        a aVar = new a();
        aVar.f19508a = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return aVar;
            } else if (b2 == 1) {
                aVar.f19508a.add(d.b(fVar));
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                aVar.f19509b = (long) fVar.e();
            }
        }
    }
}
