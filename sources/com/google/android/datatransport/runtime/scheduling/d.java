package com.google.android.datatransport.runtime.scheduling;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.c.b;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import dagger.a.c;
import java.util.concurrent.Executor;
import javax.a.a;

public final class d implements c<a> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Executor> f49542a;

    /* renamed from: b  reason: collision with root package name */
    private final a<e> f49543b;

    /* renamed from: c  reason: collision with root package name */
    private final a<s> f49544c;

    /* renamed from: d  reason: collision with root package name */
    private final a<com.google.android.datatransport.runtime.scheduling.a.c> f49545d;

    /* renamed from: e  reason: collision with root package name */
    private final a<b> f49546e;

    static {
        Covode.recordClassIndex(30998);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return new a(this.f49542a.get(), this.f49543b.get(), this.f49544c.get(), this.f49545d.get(), this.f49546e.get());
    }

    public d(a<Executor> aVar, a<e> aVar2, a<s> aVar3, a<com.google.android.datatransport.runtime.scheduling.a.c> aVar4, a<b> aVar5) {
        this.f49542a = aVar;
        this.f49543b = aVar2;
        this.f49544c = aVar3;
        this.f49545d = aVar4;
        this.f49546e = aVar5;
    }
}
