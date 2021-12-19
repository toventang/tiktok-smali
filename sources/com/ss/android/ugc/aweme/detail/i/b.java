package com.ss.android.ugc.aweme.detail.i;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.c;

public final class b extends c<a, l> {
    static {
        Covode.recordClassIndex(49576);
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        if (this.f76397i != null && this.f76396h != null && this.f76396h.mData != null) {
            ((l) this.f76397i).a(this.f76396h.mData.f79632a);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        if (this.f76397i != null) {
            ((l) this.f76397i).c_(exc);
        }
    }
}
