package com.bytedance.android.livesdkapi.depend.model.live.a;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class t implements b<f> {
    static {
        Covode.recordClassIndex(13688);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ f a(f fVar) {
        return b(fVar);
    }

    public static f b(f fVar) {
        f fVar2 = new f((char) 0);
        fVar2.f23084b = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return fVar2;
            } else if (b2 == 1) {
                fVar2.f23083a = fVar.d();
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                fVar2.f23084b.add(s.b(fVar));
            }
        }
    }
}
