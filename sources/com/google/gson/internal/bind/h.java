package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.a;
import com.google.gson.c.c;
import com.google.gson.f;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.v;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* access modifiers changed from: package-private */
public final class h<T> extends v<T> {

    /* renamed from: a  reason: collision with root package name */
    private final f f54823a;

    /* renamed from: b  reason: collision with root package name */
    private final v<T> f54824b;

    /* renamed from: c  reason: collision with root package name */
    private final Type f54825c;

    static {
        Covode.recordClassIndex(33986);
    }

    @Override // com.google.gson.v
    public final T read(a aVar) {
        return this.f54824b.read(aVar);
    }

    @Override // com.google.gson.v
    public final void write(c cVar, T t) {
        v<T> vVar = this.f54824b;
        Type type = this.f54825c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.f54825c) {
            vVar = this.f54823a.a((com.google.gson.b.a) com.google.gson.b.a.get(type));
            if (vVar instanceof ReflectiveTypeAdapterFactory.a) {
                v<T> vVar2 = this.f54824b;
                if (!(vVar2 instanceof ReflectiveTypeAdapterFactory.a)) {
                    vVar = vVar2;
                }
            }
        }
        vVar.write(cVar, t);
    }

    h(f fVar, v<T> vVar, Type type) {
        this.f54823a = fVar;
        this.f54824b = vVar;
        this.f54825c = type;
    }
}
