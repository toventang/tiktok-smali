package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.b.a;
import com.google.gson.f;
import com.google.gson.v;
import com.google.gson.w;

class TypeAdapters$34 implements w {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Class f54792a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Class f54793b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ v f54794c;

    static {
        Covode.recordClassIndex(33972);
    }

    public final String toString() {
        return "Factory[type=" + this.f54792a.getName() + "+" + this.f54793b.getName() + ",adapter=" + this.f54794c + "]";
    }

    @Override // com.google.gson.w
    public final <T> v<T> create(f fVar, a<T> aVar) {
        Class<? super T> cls = aVar.rawType;
        if (cls == this.f54792a || cls == this.f54793b) {
            return this.f54794c;
        }
        return null;
    }

    TypeAdapters$34(Class cls, Class cls2, v vVar) {
        this.f54792a = cls;
        this.f54793b = cls2;
        this.f54794c = vVar;
    }
}
