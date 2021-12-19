package com.ss.android.ugc.aweme.discover.ui.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.common.e.c;
import com.ss.android.ugc.aweme.discover.ui.c.f;
import h.f.b.l;

public final class g extends com.ss.android.ugc.aweme.discover.j.g<f> {
    static {
        Covode.recordClassIndex(51380);
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.discover.j.g, com.ss.android.ugc.aweme.common.o, com.ss.android.ugc.aweme.common.e.b
    public final void c() {
        super.c();
        b bVar = this.f76396h;
        l.b(bVar, "");
        if (((a) bVar).mListQueryType == 4) {
            b bVar2 = this.f76396h;
            l.b(bVar2, "");
            if (((a) bVar2).isDataEmpty()) {
                ((c) this.f76397i).f();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.discover.j.g, com.ss.android.ugc.aweme.common.o, com.ss.android.ugc.aweme.common.e.b
    public final void a_(Exception exc) {
        l.d(exc, "");
        super.a_(exc);
        if (exc instanceof f.b) {
            b bVar = this.f76396h;
            l.b(bVar, "");
            if (((a) bVar).isDataEmpty()) {
                ((c) this.f76397i).f();
            }
        }
    }
}
