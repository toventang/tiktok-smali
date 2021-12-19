package com.bytedance.ies.ugc.aweme.network.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.e;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.q;
import com.google.gson.b.a;
import com.google.gson.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

public final class c extends e.a {

    /* renamed from: a  reason: collision with root package name */
    private final f f34993a;

    static {
        Covode.recordClassIndex(20998);
    }

    @Override // com.bytedance.retrofit2.e.a
    public final e<?, TypedOutput> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, q qVar) {
        return null;
    }

    public c(f fVar) {
        Objects.requireNonNull(fVar, "gson == null");
        this.f34993a = fVar;
    }

    @Override // com.bytedance.retrofit2.e.a
    public final e<TypedInput, ?> a(Type type, Annotation[] annotationArr, q qVar) {
        if (!(type instanceof ParameterizedType)) {
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        if (!(rawType instanceof Class) || !b.class.isAssignableFrom((Class) rawType)) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments.length == 1) {
            return new d(this.f34993a, this.f34993a.a((a) a.get(actualTypeArguments[0])));
        }
        throw new RuntimeException("ChunkBundle should have one generic type.");
    }
}
