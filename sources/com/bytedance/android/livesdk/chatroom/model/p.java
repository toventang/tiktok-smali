package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class p implements b<a> {
    static {
        Covode.recordClassIndex(8711);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ a a(f fVar) {
        a aVar = new a();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return aVar;
            } else if (b2 == 1) {
                aVar.f15677a = (int) fVar.f();
            } else if (b2 == 2) {
                aVar.f15679c = fVar.e();
            } else if (b2 == 4) {
                aVar.f15678b = fVar.d();
            } else if (b2 == 6) {
                aVar.f15680d = (int) fVar.f();
            } else if (b2 == 7) {
                aVar.f15681e = fVar.d();
            } else if (b2 != 8) {
                g.c(fVar);
            } else {
                long a3 = fVar.a();
                Long l2 = null;
                String str = null;
                while (true) {
                    int b3 = fVar.b();
                    if (b3 == -1) {
                        break;
                    } else if (b3 == 1) {
                        l2 = Long.valueOf(fVar.f());
                    } else if (b3 == 2) {
                        str = fVar.d();
                    }
                }
                fVar.a(a3);
                if (l2 == null) {
                    throw new IllegalStateException("Map key must not be null!");
                } else if (str != null) {
                    aVar.f15682f.put(l2, str);
                } else {
                    throw new IllegalStateException("Map value must not be null!");
                }
            }
        }
    }
}
