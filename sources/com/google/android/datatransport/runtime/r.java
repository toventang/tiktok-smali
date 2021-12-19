package com.google.android.datatransport.runtime;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.scheduling.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.h;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.o;
import dagger.a.c;
import javax.a.a;

public final class r implements c<p> {

    /* renamed from: a  reason: collision with root package name */
    private final a<com.google.android.datatransport.runtime.d.a> f49464a;

    /* renamed from: b  reason: collision with root package name */
    private final a<com.google.android.datatransport.runtime.d.a> f49465b;

    /* renamed from: c  reason: collision with root package name */
    private final a<e> f49466c;

    /* renamed from: d  reason: collision with root package name */
    private final a<h> f49467d;

    /* renamed from: e  reason: collision with root package name */
    private final a<o> f49468e;

    static {
        Covode.recordClassIndex(30957);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return new p(this.f49464a.get(), this.f49465b.get(), this.f49466c.get(), this.f49467d.get(), this.f49468e.get());
    }

    public r(a<com.google.android.datatransport.runtime.d.a> aVar, a<com.google.android.datatransport.runtime.d.a> aVar2, a<e> aVar3, a<h> aVar4, a<o> aVar5) {
        this.f49464a = aVar;
        this.f49465b = aVar2;
        this.f49466c = aVar3;
        this.f49467d = aVar4;
        this.f49468e = aVar5;
    }
}
