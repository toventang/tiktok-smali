package com.ss.android.ugc.aweme.comment.j;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.f.a;
import com.ss.android.ugc.aweme.common.c;

public final class e extends c<c, a> {
    static {
        Covode.recordClassIndex(44250);
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        if (this.f76397i != null && this.f76396h != null) {
            ((a) this.f76397i).a(((c) this.f76396h).f72022b, ((c) this.f76396h).f72024d);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        if (this.f76397i != null) {
            ((a) this.f76397i).d(exc);
        }
    }
}
