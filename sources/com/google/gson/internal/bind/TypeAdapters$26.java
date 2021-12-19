package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.b.a;
import com.google.gson.c.c;
import com.google.gson.f;
import com.google.gson.v;
import com.google.gson.w;
import java.sql.Timestamp;
import java.util.Date;

class TypeAdapters$26 implements w {
    static {
        Covode.recordClassIndex(33966);
    }

    TypeAdapters$26() {
    }

    @Override // com.google.gson.w
    public final <T> v<T> create(f fVar, a<T> aVar) {
        if (aVar.rawType != Timestamp.class) {
            return null;
        }
        final v<T> a2 = fVar.a((Class) Date.class);
        return new v<Timestamp>() {
            /* class com.google.gson.internal.bind.TypeAdapters$26.AnonymousClass1 */

            static {
                Covode.recordClassIndex(33967);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.v
            public final /* synthetic */ Timestamp read(com.google.gson.c.a aVar) {
                Date date = (Date) a2.read(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.v
            public final /* bridge */ /* synthetic */ void write(c cVar, Timestamp timestamp) {
                a2.write(cVar, timestamp);
            }
        };
    }
}
