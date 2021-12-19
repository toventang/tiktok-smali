package com.bytedance.helios.sdk.f.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public final class c implements ParameterizedType {

    /* renamed from: a  reason: collision with root package name */
    private final Type f30970a;

    /* renamed from: b  reason: collision with root package name */
    private final Type f30971b;

    /* renamed from: c  reason: collision with root package name */
    private final Type[] f30972c;

    static {
        Covode.recordClassIndex(17970);
    }

    public final Type[] getActualTypeArguments() {
        return this.f30972c;
    }

    public final Type getOwnerType() {
        return this.f30971b;
    }

    public final Type getRawType() {
        return this.f30970a;
    }

    public c(Type type, Type type2, Type[] typeArr) {
        l.c(type, "");
        l.c(typeArr, "");
        this.f30970a = type;
        this.f30971b = type2;
        this.f30972c = typeArr;
    }
}
