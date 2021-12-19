package com.bytedance.ies.xbridge.model.b;

import com.bytedance.covode.number.Covode;

public final class b<T> implements a<T> {

    /* renamed from: a  reason: collision with root package name */
    private T f36292a;

    static {
        Covode.recordClassIndex(21717);
    }

    @Override // com.bytedance.ies.xbridge.b.e
    public final void a() {
        this.f36292a = null;
    }

    @Override // com.bytedance.ies.xbridge.model.b.a
    public final T b() {
        return this.f36292a;
    }

    public b(T t) {
        this.f36292a = t;
    }
}
