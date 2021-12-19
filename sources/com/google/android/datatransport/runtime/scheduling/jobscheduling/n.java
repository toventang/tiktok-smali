package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.c.b;
import dagger.a.c;
import java.util.concurrent.Executor;
import javax.a.a;

public final class n implements c<h> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Context> f49596a;

    /* renamed from: b  reason: collision with root package name */
    private final a<e> f49597b;

    /* renamed from: c  reason: collision with root package name */
    private final a<com.google.android.datatransport.runtime.scheduling.a.c> f49598c;

    /* renamed from: d  reason: collision with root package name */
    private final a<s> f49599d;

    /* renamed from: e  reason: collision with root package name */
    private final a<Executor> f49600e;

    /* renamed from: f  reason: collision with root package name */
    private final a<b> f49601f;

    /* renamed from: g  reason: collision with root package name */
    private final a<com.google.android.datatransport.runtime.d.a> f49602g;

    static {
        Covode.recordClassIndex(31022);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return new h(this.f49596a.get(), this.f49597b.get(), this.f49598c.get(), this.f49599d.get(), this.f49600e.get(), this.f49601f.get(), this.f49602g.get());
    }

    public n(a<Context> aVar, a<e> aVar2, a<com.google.android.datatransport.runtime.scheduling.a.c> aVar3, a<s> aVar4, a<Executor> aVar5, a<b> aVar6, a<com.google.android.datatransport.runtime.d.a> aVar7) {
        this.f49596a = aVar;
        this.f49597b = aVar2;
        this.f49598c = aVar3;
        this.f49599d = aVar4;
        this.f49600e = aVar5;
        this.f49601f = aVar6;
        this.f49602g = aVar7;
    }
}
