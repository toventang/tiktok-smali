package com.ss.android.ugc.aweme.net;

import com.bytedance.covode.number.Covode;
import com.google.gson.b.a;
import com.google.gson.c.b;
import com.google.gson.c.c;
import com.google.gson.f;
import com.google.gson.v;
import com.google.gson.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class CollectionTypeAdapterFactory implements w {
    static {
        Covode.recordClassIndex(72108);
    }

    @Override // com.google.gson.w
    public final <T> v<T> create(f fVar, a<T> aVar) {
        if (!Collection.class.isAssignableFrom(aVar.rawType)) {
            return null;
        }
        final v<T> a2 = fVar.a(this, aVar);
        return new v<T>() {
            /* class com.ss.android.ugc.aweme.net.CollectionTypeAdapterFactory.AnonymousClass1 */

            static {
                Covode.recordClassIndex(72109);
            }

            @Override // com.google.gson.v
            public final T read(com.google.gson.c.a aVar) {
                if (aVar.f() == b.NULL) {
                    aVar.k();
                    return null;
                }
                T t = (T) ((Collection) a2.read(aVar));
                if (t instanceof ArrayList) {
                    T t2 = t;
                    for (int size = t2.size() - 1; size >= 0; size--) {
                        if (t2.get(size) == null) {
                            t2.remove(size);
                        }
                    }
                    return t2;
                }
                Iterator it = t.iterator();
                while (it.hasNext()) {
                    if (it.next() == null) {
                        it.remove();
                    }
                }
                return t;
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
