package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.b;
import com.google.gson.c.c;
import com.google.gson.f;
import com.google.gson.v;
import com.google.gson.w;
import java.lang.reflect.Array;
import java.util.ArrayList;

public final class a<E> extends v<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final w f54799a = new ArrayTypeAdapter$1();

    /* renamed from: b  reason: collision with root package name */
    private final Class<E> f54800b;

    /* renamed from: c  reason: collision with root package name */
    private final v<E> f54801c;

    static {
        Covode.recordClassIndex(33975);
    }

    @Override // com.google.gson.v
    public final Object read(com.google.gson.c.a aVar) {
        if (aVar.f() == b.NULL) {
            aVar.k();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.e()) {
            arrayList.add(this.f54801c.read(aVar));
        }
        aVar.b();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f54800b, size);
        for (int i2 = 0; i2 < size; i2++) {
            Array.set(newInstance, i2, arrayList.get(i2));
        }
        return newInstance;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.gson.v<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.v
    public final void write(c cVar, Object obj) {
        if (obj == null) {
            cVar.f();
            return;
        }
        cVar.b();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.f54801c.write(cVar, Array.get(obj, i2));
        }
        cVar.c();
    }

    public a(f fVar, v<E> vVar, Class<E> cls) {
        this.f54801c = new h(fVar, vVar, cls);
        this.f54800b = cls;
    }
}
