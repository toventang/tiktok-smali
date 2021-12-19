package com.bytedance.android.livesdk.model.message.c;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class q implements b<d> {
    static {
        Covode.recordClassIndex(11518);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ d a(f fVar) {
        return b(fVar);
    }

    public static d b(f fVar) {
        d dVar = new d();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return dVar;
            } else if (b2 == 1) {
                dVar.f19433a = fVar.e();
            } else if (b2 == 2) {
                dVar.f19434b = k.b(fVar);
            } else if (b2 != 11) {
                switch (b2) {
                    case 21:
                        dVar.f19436d = p.b(fVar);
                        continue;
                    case 22:
                        dVar.f19437e = l.b(fVar);
                        continue;
                    case 23:
                        dVar.f19438f = m.b(fVar);
                        continue;
                    case 24:
                        dVar.f19439g = o.b(fVar);
                        continue;
                    case 25:
                        dVar.f19440h = n.b(fVar);
                        continue;
                    default:
                        g.c(fVar);
                        continue;
                }
            } else {
                dVar.f19435c = fVar.d();
            }
        }
    }
}
