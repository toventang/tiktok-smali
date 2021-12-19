package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.c.b;
import com.google.android.datatransport.runtime.k;

final /* synthetic */ class q implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final o f49608a;

    static {
        Covode.recordClassIndex(31025);
    }

    q(o oVar) {
        this.f49608a = oVar;
    }

    @Override // com.google.android.datatransport.runtime.c.b.a
    public final Object a() {
        o oVar = this.f49608a;
        for (k kVar : oVar.f49604b.a()) {
            oVar.f49605c.a(kVar, 1);
        }
        return null;
    }
}
