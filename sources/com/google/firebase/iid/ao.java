package com.google.firebase.iid;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.g;
import com.google.android.gms.c.h;
import com.google.android.gms.c.k;

final /* synthetic */ class ao implements g {

    /* renamed from: a  reason: collision with root package name */
    static final g f54418a = new ao();

    static {
        Covode.recordClassIndex(33784);
    }

    private ao() {
    }

    @Override // com.google.android.gms.c.g
    public final h a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (aj.b(bundle)) {
            return k.a((Object) null);
        }
        return k.a(bundle);
    }
}
