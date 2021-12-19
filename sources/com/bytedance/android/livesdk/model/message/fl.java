package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.message.c.r;
import com.bytedance.covode.number.Covode;

public final class fl implements b<br> {
    static {
        Covode.recordClassIndex(11659);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ br a(f fVar) {
        br brVar = new br();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return brVar;
            } else if (b2 == 1) {
                brVar.f19353a = fVar.f();
            } else if (b2 == 2) {
                brVar.f19354b = r.b(fVar);
            } else if (b2 == 3) {
                brVar.f19355c = fVar.d();
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                brVar.f19356d = fVar.d();
            }
        }
    }
}
