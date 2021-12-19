package com.bytedance.android.live.core.paging.b;

import androidx.h.i;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;

public final class b<V> extends i.a<V> {

    /* renamed from: a  reason: collision with root package name */
    private t<Boolean> f9158a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    private t<Boolean> f9159b = new t<>();

    static {
        Covode.recordClassIndex(4695);
    }

    @Override // androidx.h.i.a
    public final void a() {
        super.a();
        this.f9159b.postValue(true);
    }

    @Override // androidx.h.i.a
    public final void a(V v) {
        super.a(v);
        this.f9158a.postValue(false);
    }

    public b(t<Boolean> tVar, t<Boolean> tVar2) {
        this.f9158a = tVar;
        this.f9159b = tVar2;
    }
}
