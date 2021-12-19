package com.bytedance.android.livesdkapi.depend.model.live.a;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class y implements b<m> {
    static {
        Covode.recordClassIndex(13693);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ m a(f fVar) {
        return b(fVar);
    }

    public static m b(f fVar) {
        m mVar = new m((char) 0);
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return mVar;
            } else if (b2 == 1) {
                mVar.f23098a = fVar.f();
            } else if (b2 == 2) {
                mVar.f23099b = fVar.f();
            } else if (b2 == 11) {
                mVar.f23100c = (long) fVar.e();
            } else if (b2 != 12) {
                switch (b2) {
                    case 21:
                        mVar.f23102e = (long) fVar.e();
                        continue;
                    case 22:
                        mVar.f23103f = t.b(fVar);
                        continue;
                    case 23:
                        mVar.f23104g = fVar.f();
                        continue;
                    default:
                        g.c(fVar);
                        continue;
                }
            } else {
                mVar.f23101d = t.b(fVar);
            }
        }
    }
}
