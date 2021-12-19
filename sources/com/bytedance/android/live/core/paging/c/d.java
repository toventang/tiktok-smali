package com.bytedance.android.live.core.paging.c;

import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final c f9185a;

    static {
        Covode.recordClassIndex(4702);
    }

    d(c cVar) {
        this.f9185a = cVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        c cVar = this.f9185a;
        if (cVar.f9184m != null) {
            cVar.f9184m.run();
            cVar.f9184m = null;
        }
    }
}
