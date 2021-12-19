package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.b.a;
import com.google.gson.f;
import com.google.gson.v;
import com.google.gson.w;

/* access modifiers changed from: package-private */
public class TypeAdapters$33 implements w {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Class f54789a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Class f54790b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ v f54791c;

    static {
        Covode.recordClassIndex(33971);
    }

    public final String toString() {
        return "Factory[type=" + this.f54790b.getName() + "+" + this.f54789a.getName() + ",adapter=" + this.f54791c + "]";
    }

    @Override // com.google.gson.w
    public final <T> v<T> create(f fVar, a<T> aVar) {
        Class<? super T> cls = aVar.rawType;
        if (cls == this.f54789a || cls == this.f54790b) {
            return this.f54791c;
        }
        return null;
    }

    TypeAdapters$33(Class cls, Class cls2, v vVar) {
        this.f54789a = cls;
        this.f54790b = cls2;
        this.f54791c = vVar;
    }
}
