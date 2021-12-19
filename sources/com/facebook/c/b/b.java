package com.facebook.c.b;

import com.bytedance.covode.number.Covode;
import com.facebook.c.b.d;

public final class b implements h {
    static {
        Covode.recordClassIndex(28586);
    }

    @Override // com.facebook.c.b.h
    public final g a() {
        return new g() {
            /* class com.facebook.c.b.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(28587);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(d.a aVar, d.a aVar2) {
                long b2 = aVar.b();
                long b3 = aVar2.b();
                if (b2 < b3) {
                    return -1;
                }
                if (b3 == b2) {
                    return 0;
                }
                return 1;
            }
        };
    }
}
