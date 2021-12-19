package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.message.e;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class cq implements b<e.a> {
    static {
        Covode.recordClassIndex(11538);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ e.a a(f fVar) {
        return b(fVar);
    }

    public static e.a b(f fVar) {
        e.a aVar = new e.a();
        aVar.f19604b = new HashMap();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return aVar;
            } else if (b2 == 1) {
                aVar.f19603a = fVar.d();
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                long a3 = fVar.a();
                String str = null;
                String str2 = null;
                while (true) {
                    int b3 = fVar.b();
                    if (b3 == -1) {
                        break;
                    } else if (b3 == 1) {
                        str = fVar.d();
                    } else if (b3 == 2) {
                        str2 = fVar.d();
                    }
                }
                fVar.a(a3);
                if (str == null) {
                    throw new IllegalStateException("Map key must not be null!");
                } else if (str2 != null) {
                    aVar.f19604b.put(str, str2);
                } else {
                    throw new IllegalStateException("Map value must not be null!");
                }
            }
        }
    }
}
