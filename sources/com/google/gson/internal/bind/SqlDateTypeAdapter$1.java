package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.b.a;
import com.google.gson.f;
import com.google.gson.v;
import com.google.gson.w;
import java.sql.Date;

class SqlDateTypeAdapter$1 implements w {
    static {
        Covode.recordClassIndex(33961);
    }

    SqlDateTypeAdapter$1() {
    }

    @Override // com.google.gson.w
    public final <T> v<T> create(f fVar, a<T> aVar) {
        if (aVar.rawType == Date.class) {
            return new f();
        }
        return null;
    }
}
