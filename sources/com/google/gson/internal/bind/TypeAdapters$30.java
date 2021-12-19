package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.b.a;
import com.google.gson.f;
import com.google.gson.internal.bind.i;
import com.google.gson.v;
import com.google.gson.w;

class TypeAdapters$30 implements w {
    static {
        Covode.recordClassIndex(33968);
    }

    TypeAdapters$30() {
    }

    @Override // com.google.gson.w
    public final <T> v<T> create(f fVar, a<T> aVar) {
        Class<? super T> cls = aVar.rawType;
        if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
            return null;
        }
        if (!cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        return new i.a(cls);
    }
}
