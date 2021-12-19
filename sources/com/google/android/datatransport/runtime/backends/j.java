package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import dagger.a.c;
import javax.a.a;

public final class j implements c<i> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Context> f49414a;

    /* renamed from: b  reason: collision with root package name */
    private final a<com.google.android.datatransport.runtime.d.a> f49415b;

    /* renamed from: c  reason: collision with root package name */
    private final a<com.google.android.datatransport.runtime.d.a> f49416c;

    static {
        Covode.recordClassIndex(30922);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return new i(this.f49414a.get(), this.f49415b.get(), this.f49416c.get());
    }

    public j(a<Context> aVar, a<com.google.android.datatransport.runtime.d.a> aVar2, a<com.google.android.datatransport.runtime.d.a> aVar3) {
        this.f49414a = aVar;
        this.f49415b = aVar2;
        this.f49416c = aVar3;
    }
}
