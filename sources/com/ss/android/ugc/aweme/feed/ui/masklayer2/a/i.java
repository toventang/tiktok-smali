package com.ss.android.ugc.aweme.feed.ui.masklayer2.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.c;
import h.f.b.l;

public final class i extends c<h, l> {
    static {
        Covode.recordClassIndex(60186);
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        T t;
        l lVar = (l) this.f76397i;
        if (lVar != null) {
            b bVar = this.f76396h;
            if (bVar == null || (t = bVar.mData) == null) {
                t = "";
            }
            lVar.a(t);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        l.d(exc, "");
        l lVar = (l) this.f76397i;
        if (lVar != null) {
            lVar.a(exc);
        }
    }
}
