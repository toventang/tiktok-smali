package com.bytedance.ies.ugc.aweme.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.e;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.q;
import com.google.gson.b.a;
import com.google.gson.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Objects;

public final class b extends e.a {

    /* renamed from: a  reason: collision with root package name */
    private final f f35019a;

    static {
        Covode.recordClassIndex(21008);
    }

    b(f fVar) {
        Objects.requireNonNull(fVar, "gson == null");
        this.f35019a = fVar;
    }

    @Override // com.bytedance.retrofit2.e.a
    public final e<TypedInput, ?> a(Type type, Annotation[] annotationArr, q qVar) {
        return new d(this.f35019a, this.f35019a.a((a) a.get(type)));
    }

    @Override // com.bytedance.retrofit2.e.a
    public final e<?, TypedOutput> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, q qVar) {
        return new c(this.f35019a, this.f35019a.a((a) a.get(type)));
    }
}
