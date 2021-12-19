package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.b.a;
import com.google.gson.f;
import com.google.gson.v;
import com.google.gson.w;

/* access modifiers changed from: package-private */
public class TypeAdapters$31 implements w {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f54785a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ v f54786b;

    static {
        Covode.recordClassIndex(33969);
    }

    TypeAdapters$31(a aVar, v vVar) {
        this.f54785a = aVar;
        this.f54786b = vVar;
    }

    @Override // com.google.gson.w
    public final <T> v<T> create(f fVar, a<T> aVar) {
        if (aVar.equals(this.f54785a)) {
            return this.f54786b;
        }
        return null;
    }
}
