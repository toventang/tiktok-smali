package com.ss.android.ugc.aweme.discover.repo.gson;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.a;
import com.google.gson.c.c;
import com.google.gson.f;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.v;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* access modifiers changed from: package-private */
public final class b<T> extends v<T> {

    /* renamed from: a  reason: collision with root package name */
    private final f f82031a;

    /* renamed from: b  reason: collision with root package name */
    private final v<T> f82032b;

    /* renamed from: c  reason: collision with root package name */
    private final Type f82033c;

    static {
        Covode.recordClassIndex(51059);
    }

    @Override // com.google.gson.v
    public final T read(a aVar) {
        return this.f82032b.read(aVar);
    }

    @Override // com.google.gson.v
    public final void write(c cVar, T t) {
        v<T> vVar = this.f82032b;
        Type type = this.f82033c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.f82033c) {
            vVar = this.f82031a.a((com.google.gson.b.a) com.google.gson.b.a.get(type));
            if (vVar instanceof ReflectiveTypeAdapterFactory.a) {
                v<T> vVar2 = this.f82032b;
                if (!(vVar2 instanceof ReflectiveTypeAdapterFactory.a)) {
                    vVar = vVar2;
                }
            }
        }
        vVar.write(cVar, t);
    }

    b(f fVar, v<T> vVar, Type type) {
        this.f82031a = fVar;
        this.f82032b = vVar;
        this.f82033c = type;
    }
}
