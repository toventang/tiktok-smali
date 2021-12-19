package com.ss.android.ugc.aweme.net;

import com.bytedance.covode.number.Covode;
import com.google.gson.b.a;
import com.google.gson.c.b;
import com.google.gson.c.c;
import com.google.gson.f;
import com.google.gson.p;
import com.google.gson.v;
import com.google.gson.w;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public class BaseResponseObjectTypeAdapterFactory implements w {
    static {
        Covode.recordClassIndex(72106);
    }

    @Override // com.google.gson.w
    public <T> v<T> create(f fVar, a<T> aVar) {
        if (!BaseResponse.class.isAssignableFrom(aVar.rawType)) {
            return null;
        }
        final v<T> a2 = fVar.a(this, aVar);
        return new v<T>() {
            /* class com.ss.android.ugc.aweme.net.BaseResponseObjectTypeAdapterFactory.AnonymousClass1 */

            static {
                Covode.recordClassIndex(72107);
            }

            @Override // com.google.gson.v
            public final T read(com.google.gson.c.a aVar) {
                if (aVar.f() == b.NULL) {
                    aVar.k();
                    return null;
                }
                try {
                    T t = (T) ((BaseResponse) a2.read(aVar));
                    if (t.extra != null && t.extra.now > 0) {
                        p.f112494a = t.extra.now;
                    }
                    return t;
                } catch (p e2) {
                    if (e2.getCause() instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                        throw e2.getCause();
                    }
                    throw e2;
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
