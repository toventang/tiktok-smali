package com.ss.android.ugc.aweme.challenge.g;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.c;
import h.f.b.l;

public final class g extends c<f, i> {
    static {
        Covode.recordClassIndex(43147);
    }

    @Override // com.ss.android.ugc.aweme.common.c
    public final void b() {
        if (this.f76397i != null) {
            ((i) this.f76397i).a();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        super.c();
        if (this.f76397i != null && this.f76396h != null) {
            b bVar = this.f76396h;
            l.b(bVar, "");
            T t = bVar.mData;
            l.b(t, "");
            ((i) this.f76397i).a(t);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        if (this.f76397i != null) {
            ((i) this.f76397i).b();
        }
    }
}
