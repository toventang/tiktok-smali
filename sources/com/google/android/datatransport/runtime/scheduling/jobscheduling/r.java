package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.c.b;
import dagger.a.c;
import java.util.concurrent.Executor;
import javax.a.a;

public final class r implements c<o> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Executor> f49609a;

    /* renamed from: b  reason: collision with root package name */
    private final a<com.google.android.datatransport.runtime.scheduling.a.c> f49610b;

    /* renamed from: c  reason: collision with root package name */
    private final a<s> f49611c;

    /* renamed from: d  reason: collision with root package name */
    private final a<b> f49612d;

    static {
        Covode.recordClassIndex(31026);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return new o(this.f49609a.get(), this.f49610b.get(), this.f49611c.get(), this.f49612d.get());
    }

    public r(a<Executor> aVar, a<com.google.android.datatransport.runtime.scheduling.a.c> aVar2, a<s> aVar3, a<b> aVar4) {
        this.f49609a = aVar;
        this.f49610b = aVar2;
        this.f49611c = aVar3;
        this.f49612d = aVar4;
    }
}
