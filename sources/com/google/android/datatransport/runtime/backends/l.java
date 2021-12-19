package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import dagger.a.c;
import javax.a.a;

public final class l implements c<k> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Context> f49422a;

    /* renamed from: b  reason: collision with root package name */
    private final a<i> f49423b;

    static {
        Covode.recordClassIndex(30925);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return new k(this.f49422a.get(), this.f49423b.get());
    }

    public l(a<Context> aVar, a<i> aVar2) {
        this.f49422a = aVar;
        this.f49423b = aVar2;
    }
}
