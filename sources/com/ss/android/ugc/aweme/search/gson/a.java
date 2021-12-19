package com.ss.android.ugc.aweme.search.gson;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.c;
import com.google.gson.f;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.v;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* access modifiers changed from: package-private */
public final class a<T> extends v<T> {

    /* renamed from: a  reason: collision with root package name */
    private final f f121130a;

    /* renamed from: b  reason: collision with root package name */
    private final v<T> f121131b;

    /* renamed from: c  reason: collision with root package name */
    private final Type f121132c;

    static {
        Covode.recordClassIndex(78908);
    }

    @Override // com.google.gson.v
    public final T read(com.google.gson.c.a aVar) {
        return this.f121131b.read(aVar);
    }

    @Override // com.google.gson.v
    public final void write(c cVar, T t) {
        v<T> vVar = this.f121131b;
        Type type = this.f121132c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.f121132c) {
            vVar = this.f121130a.a((com.google.gson.b.a) com.google.gson.b.a.get(type));
            if (vVar instanceof ReflectiveTypeAdapterFactory.a) {
                v<T> vVar2 = this.f121131b;
                if (!(vVar2 instanceof ReflectiveTypeAdapterFactory.a)) {
                    vVar = vVar2;
                }
            }
        }
        vVar.write(cVar, t);
    }

    a(f fVar, v<T> vVar, Type type) {
        this.f121130a = fVar;
        this.f121131b = vVar;
        this.f121132c = type;
    }
}
