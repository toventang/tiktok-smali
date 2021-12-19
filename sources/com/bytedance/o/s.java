package com.bytedance.o;

import com.bytedance.covode.number.Covode;

public final class s<T> extends p<T> {

    /* renamed from: a  reason: collision with root package name */
    private final p<T> f41741a;

    /* renamed from: b  reason: collision with root package name */
    private T f41742b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f41743c;

    static {
        Covode.recordClassIndex(25540);
    }

    public s(p<T> pVar) {
        this.f41741a = pVar;
    }

    @Override // com.bytedance.o.p
    public final T get(f fVar) {
        T t = this.f41742b;
        if (t != null) {
            return t;
        }
        T t2 = this.f41741a.get(fVar);
        this.f41742b = t2;
        return t2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.o.p
    public final void executeOnCreate(T t, f fVar) {
        if (!this.f41743c) {
            this.f41743c = true;
            super.executeOnCreate(t, fVar);
        }
    }
}
