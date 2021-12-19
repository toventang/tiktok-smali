package com.google.android.datatransport.runtime.scheduling.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import dagger.a.c;
import javax.a.a;

public final class ae implements c<aa> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Context> f49493a;

    /* renamed from: b  reason: collision with root package name */
    private final a<Integer> f49494b;

    static {
        Covode.recordClassIndex(30966);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return new aa(this.f49493a.get(), this.f49494b.get().intValue());
    }

    public ae(a<Context> aVar, a<Integer> aVar2) {
        this.f49493a = aVar;
        this.f49494b = aVar2;
    }
}
