package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.c.b;
import com.google.android.datatransport.runtime.k;

final /* synthetic */ class j implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final h f49585a;

    /* renamed from: b  reason: collision with root package name */
    private final k f49586b;

    static {
        Covode.recordClassIndex(31018);
    }

    j(h hVar, k kVar) {
        this.f49585a = hVar;
        this.f49586b = kVar;
    }

    @Override // com.google.android.datatransport.runtime.c.b.a
    public final Object a() {
        h hVar = this.f49585a;
        return hVar.f49576c.c(this.f49586b);
    }
}
