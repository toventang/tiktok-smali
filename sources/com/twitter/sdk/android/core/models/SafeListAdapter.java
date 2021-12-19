package com.twitter.sdk.android.core.models;

import com.bytedance.covode.number.Covode;
import com.google.gson.b.a;
import com.google.gson.c.c;
import com.google.gson.f;
import com.google.gson.v;
import com.google.gson.w;
import java.util.Collections;
import java.util.List;

public class SafeListAdapter implements w {
    static {
        Covode.recordClassIndex(103712);
    }

    @Override // com.google.gson.w
    public <T> v<T> create(f fVar, final a<T> aVar) {
        final v<T> a2 = fVar.a(this, aVar);
        return new v<T>() {
            /* class com.twitter.sdk.android.core.models.SafeListAdapter.AnonymousClass1 */

            static {
                Covode.recordClassIndex(103713);
            }

            @Override // com.google.gson.v
            public final T read(com.google.gson.c.a aVar) {
                T t = (T) a2.read(aVar);
                if (List.class.isAssignableFrom(aVar.rawType)) {
                    return t == null ? (T) Collections.EMPTY_LIST : (T) Collections.unmodifiableList(t);
                }
                return t;
            }

            @Override // com.google.gson.v
            public final void write(c cVar, T t) {
                a2.write(cVar, t);
            }
        };
    }
}
