package com.ss.android.ugc.aweme.activity.processor;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.ies.foundation.activity.d;
import h.f.b.l;

public final class k extends d {

    /* renamed from: d  reason: collision with root package name */
    private boolean f65545d;

    static {
        Covode.recordClassIndex(40325);
    }

    @Override // com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public final void b(a aVar) {
        l.d(aVar, "");
        super.b(aVar);
        com.bytedance.tux.g.d.b(aVar);
    }

    @Override // com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public final void f(a aVar) {
        l.d(aVar, "");
        super.f(aVar);
        this.f65545d = true;
    }

    @Override // com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public final void a(a aVar, boolean z) {
        l.d(aVar, "");
        super.a(aVar, z);
        if (z && this.f65545d) {
            com.bytedance.tux.g.d.a(aVar);
            this.f65545d = false;
        }
    }
}
