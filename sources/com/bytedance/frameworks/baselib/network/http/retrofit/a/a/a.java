package com.bytedance.frameworks.baselib.network.http.retrofit.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.e;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.q;
import com.google.gson.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Objects;

public final class a extends e.a {

    /* renamed from: a  reason: collision with root package name */
    private final f f29381a;

    static {
        Covode.recordClassIndex(17131);
    }

    public static a a() {
        return a(new f());
    }

    public static a a(f fVar) {
        return new a(fVar);
    }

    private a(f fVar) {
        Objects.requireNonNull(fVar, "gson == null");
        this.f29381a = fVar;
    }

    @Override // com.bytedance.retrofit2.e.a
    public final e<TypedInput, ?> a(Type type, Annotation[] annotationArr, q qVar) {
        return new c(this.f29381a, this.f29381a.a((com.google.gson.b.a) com.google.gson.b.a.get(type)));
    }

    @Override // com.bytedance.retrofit2.e.a
    public final e<?, TypedOutput> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, q qVar) {
        return new b(this.f29381a, this.f29381a.a((com.google.gson.b.a) com.google.gson.b.a.get(type)));
    }
}
