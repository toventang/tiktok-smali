package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.b;
import com.google.gson.b.a;
import com.google.gson.f;
import com.google.gson.internal.c;
import com.google.gson.v;
import com.google.gson.w;

public final class JsonAdapterAnnotationTypeAdapterFactory implements w {

    /* renamed from: a  reason: collision with root package name */
    private final c f54746a;

    static {
        Covode.recordClassIndex(33953);
    }

    public JsonAdapterAnnotationTypeAdapterFactory(c cVar) {
        this.f54746a = cVar;
    }

    @Override // com.google.gson.w
    public final <T> v<T> create(f fVar, a<T> aVar) {
        b bVar = (b) aVar.rawType.getAnnotation(b.class);
        if (bVar == null) {
            return null;
        }
        return (v<T>) a(this.f54746a, fVar, aVar, bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.gson.v<?> a(com.google.gson.internal.c r6, com.google.gson.f r7, com.google.gson.b.a<?> r8, com.google.gson.a.b r9) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.a(com.google.gson.internal.c, com.google.gson.f, com.google.gson.b.a, com.google.gson.a.b):com.google.gson.v");
    }
}
