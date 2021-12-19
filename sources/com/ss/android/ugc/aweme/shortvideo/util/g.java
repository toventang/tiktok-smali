package com.ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.ct;
import com.ss.android.ugc.aweme.services.IPreloadVESo;
import com.ss.android.ugc.tools.f.b;
import h.f.a.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements a {

    /* renamed from: a  reason: collision with root package name */
    private final IPreloadVESo f132319a;

    static {
        Covode.recordClassIndex(86652);
    }

    g(IPreloadVESo iPreloadVESo) {
        this.f132319a = iPreloadVESo;
    }

    @Override // h.f.a.a
    public final Object invoke() {
        return new b().a("ab_load_ve_sdk", ct.a()).a("status_load_ve_sdk", this.f132319a.getPreLoadVESoStatus().toStatusCode()).f149193a;
    }
}
