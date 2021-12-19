package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.b.a;
import com.google.gson.f;
import com.google.gson.v;
import com.google.gson.w;

/* access modifiers changed from: package-private */
public class TypeAdapters$32 implements w {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Class f54787a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ v f54788b;

    static {
        Covode.recordClassIndex(33970);
    }

    public final String toString() {
        return "Factory[type=" + this.f54787a.getName() + ",adapter=" + this.f54788b + "]";
    }

    TypeAdapters$32(Class cls, v vVar) {
        this.f54787a = cls;
        this.f54788b = vVar;
    }

    @Override // com.google.gson.w
    public final <T> v<T> create(f fVar, a<T> aVar) {
        if (aVar.rawType == this.f54787a) {
            return this.f54788b;
        }
        return null;
    }
}
