package com.bytedance.assem.arch.extensions;

import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.b.l;
import h.h;

public final class i<T> implements h<T> {

    /* renamed from: a  reason: collision with root package name */
    private T f25643a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f25644b;

    /* renamed from: c  reason: collision with root package name */
    private final a<T> f25645c;

    static {
        Covode.recordClassIndex(14920);
    }

    @Override // h.h
    public final boolean isInitialized() {
        return this.f25644b;
    }

    @Override // h.h
    public final T getValue() {
        T t = this.f25643a;
        if (t != null) {
            return t;
        }
        T invoke = this.f25645c.invoke();
        this.f25643a = invoke;
        return invoke;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public i(boolean z, a<? extends T> aVar) {
        l.c(aVar, "");
        this.f25644b = z;
        this.f25645c = aVar;
    }
}
