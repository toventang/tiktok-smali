package com.ss.android.ugc.aweme.net;

import com.bytedance.covode.number.Covode;
import com.google.gson.b.a;
import com.google.gson.c.b;
import com.google.gson.c.c;
import com.google.gson.f;
import com.google.gson.p;
import com.google.gson.t;
import com.google.gson.v;
import com.google.gson.w;

public final class ModelCheckerTypeAdapterFactory implements w {
    static {
        Covode.recordClassIndex(72115);
    }

    @Override // com.google.gson.w
    public final <T> v<T> create(f fVar, a<T> aVar) {
        if (!com.ss.android.ugc.aweme.base.api.a.class.isAssignableFrom(aVar.rawType)) {
            return null;
        }
        com.ss.android.ugc.aweme.base.api.a.initRequiredFieldMap(aVar.rawType);
        final v<T> a2 = fVar.a(this, aVar);
        return new v<T>() {
            /* class com.ss.android.ugc.aweme.net.ModelCheckerTypeAdapterFactory.AnonymousClass1 */

            static {
                Covode.recordClassIndex(72116);
            }

            @Override // com.google.gson.v
            public final T read(com.google.gson.c.a aVar) {
                if (aVar.f() == b.NULL) {
                    aVar.k();
                    return null;
                }
                T t = (T) ((com.ss.android.ugc.aweme.base.api.a) a2.read(aVar));
                try {
                    t.checkValid();
                    return t;
                } catch (p e2) {
                    throw e2;
                } catch (Throwable th) {
                    throw new t(th);
                }
            }

            @Override // com.google.gson.v
            public final void write(c cVar, T t) {
                if (t == null) {
                    cVar.f();
                } else {
                    a2.write(cVar, t);
                }
            }
        };
    }
}
