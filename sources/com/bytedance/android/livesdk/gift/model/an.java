package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class an implements b<p> {
    static {
        Covode.recordClassIndex(9947);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ p a(f fVar) {
        return b(fVar);
    }

    public static p b(f fVar) {
        p pVar = new p();
        pVar.f17917c = new ArrayList();
        pVar.f17926l = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return pVar;
            } else if (b2 == 1) {
                pVar.f17919e = g.b(fVar);
            } else if (b2 == 13) {
                pVar.f17926l.add(ae.b(fVar));
            } else if (b2 == 16) {
                pVar.f17916b = ap.b(fVar);
            } else if (b2 == 18) {
                pVar.f17924j = ag.b(fVar);
            } else if (b2 == 3) {
                pVar.f17915a = g.b(fVar);
            } else if (b2 == 4) {
                pVar.f17920f = fVar.d();
            } else if (b2 == 5) {
                pVar.f17917c.add(af.b(fVar));
            } else if (b2 == 10) {
                pVar.f17923i = g.a(fVar);
            } else if (b2 != 11) {
                g.c(fVar);
            } else {
                pVar.f17925k = com.bytedance.android.live.base.model.f.b(fVar);
            }
        }
    }
}
