package com.google.firebase.iid;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.a;
import com.google.android.gms.c.h;

final /* synthetic */ class al implements a {

    /* renamed from: a  reason: collision with root package name */
    private final aj f54412a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f54413b;

    static {
        Covode.recordClassIndex(33781);
    }

    al(aj ajVar, Bundle bundle) {
        this.f54412a = ajVar;
        this.f54413b = bundle;
    }

    @Override // com.google.android.gms.c.a
    public final Object a(h hVar) {
        aj ajVar = this.f54412a;
        Bundle bundle = this.f54413b;
        if (hVar.b() && aj.b((Bundle) hVar.d())) {
            return ajVar.c(bundle).a(g.f54460a, ao.f54418a);
        }
        return hVar;
    }
}
