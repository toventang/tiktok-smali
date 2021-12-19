package com.ss.android.ugc.aweme.detail.i;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.c;
import h.f.b.l;

public final class h extends c<g, m> {
    static {
        Covode.recordClassIndex(49583);
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        if (this.f76397i != null && this.f76396h != null) {
            b bVar = this.f76396h;
            l.b(bVar, "");
            ((m) this.f76397i).a(bVar.mData);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        if (this.f76397i != null) {
            ((m) this.f76397i).b_(exc);
        }
    }
}
