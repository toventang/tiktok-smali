package com.ss.android.ugc.aweme.app.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.e;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.q;
import com.google.gson.f;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.app.api.c.a;
import com.ss.android.ugc.aweme.app.api.c.c;
import com.ss.android.ugc.aweme.app.api.c.d;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

public final class r extends e.a {

    /* renamed from: a  reason: collision with root package name */
    public d f66647a;

    /* renamed from: b  reason: collision with root package name */
    private final f f66648b;

    static {
        Covode.recordClassIndex(40982);
    }

    public r(f fVar) {
        Objects.requireNonNull(fVar, "gson == null");
        this.f66648b = fVar;
    }

    @Override // com.bytedance.retrofit2.e.a
    public final e<TypedInput, ?> a(Type type, Annotation[] annotationArr, q qVar) {
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (parameterizedType.getRawType() == c.class) {
                return new a(parameterizedType, this.f66648b, this.f66647a);
            }
            return null;
        } else if (!(type instanceof Class)) {
            return null;
        } else {
            Class cls = (Class) type;
            if (!Message.class.isAssignableFrom(cls)) {
                return null;
            }
            return new q(ProtoAdapter.get(cls));
        }
    }

    @Override // com.bytedance.retrofit2.e.a
    public final e<?, TypedOutput> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, q qVar) {
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!Message.class.isAssignableFrom(cls)) {
            return null;
        }
        return new p(ProtoAdapter.get(cls));
    }
}
