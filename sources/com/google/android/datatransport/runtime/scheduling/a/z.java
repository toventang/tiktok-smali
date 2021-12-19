package com.google.android.datatransport.runtime.scheduling.a;

import com.bytedance.covode.number.Covode;
import dagger.a.c;
import javax.a.a;

public final class z implements c<h> {

    /* renamed from: a  reason: collision with root package name */
    private final a<com.google.android.datatransport.runtime.d.a> f49531a;

    /* renamed from: b  reason: collision with root package name */
    private final a<com.google.android.datatransport.runtime.d.a> f49532b;

    /* renamed from: c  reason: collision with root package name */
    private final a<d> f49533c;

    /* renamed from: d  reason: collision with root package name */
    private final a<aa> f49534d;

    static {
        Covode.recordClassIndex(30995);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return new h(this.f49531a.get(), this.f49532b.get(), this.f49533c.get(), this.f49534d.get());
    }

    public z(a<com.google.android.datatransport.runtime.d.a> aVar, a<com.google.android.datatransport.runtime.d.a> aVar2, a<d> aVar3, a<aa> aVar4) {
        this.f49531a = aVar;
        this.f49532b = aVar2;
        this.f49533c = aVar3;
        this.f49534d = aVar4;
    }
}
