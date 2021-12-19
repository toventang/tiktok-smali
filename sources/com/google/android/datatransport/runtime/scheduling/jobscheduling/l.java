package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.c.b;
import com.google.android.datatransport.runtime.scheduling.a.c;

final /* synthetic */ class l implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final c f49592a;

    static {
        Covode.recordClassIndex(31020);
    }

    l(c cVar) {
        this.f49592a = cVar;
    }

    @Override // com.google.android.datatransport.runtime.c.b.a
    public final Object a() {
        return Integer.valueOf(this.f49592a.b());
    }
}
