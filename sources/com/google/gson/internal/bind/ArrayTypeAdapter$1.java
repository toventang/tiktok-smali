package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.b.a;
import com.google.gson.f;
import com.google.gson.internal.b;
import com.google.gson.v;
import com.google.gson.w;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

class ArrayTypeAdapter$1 implements w {
    static {
        Covode.recordClassIndex(33949);
    }

    ArrayTypeAdapter$1() {
    }

    @Override // com.google.gson.w
    public final <T> v<T> create(f fVar, a<T> aVar) {
        Type type;
        Type type2 = aVar.type;
        if (type2 instanceof GenericArrayType) {
            type = ((GenericArrayType) type2).getGenericComponentType();
        } else if (!(type2 instanceof Class) || !((Class) type2).isArray()) {
            return null;
        } else {
            type = ((Class) type2).getComponentType();
        }
        return new a(fVar, fVar.a((a) a.get(type)), b.c(type));
    }
}
