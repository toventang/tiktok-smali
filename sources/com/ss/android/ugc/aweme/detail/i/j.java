package com.ss.android.ugc.aweme.detail.i;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.c;

public class j extends c<i, m> {
    static {
        Covode.recordClassIndex(49586);
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public void c() {
        if (this.f76397i != null && this.f76396h != null) {
            ((m) this.f76397i).a(this.f76396h.mData);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        if (this.f76397i != null) {
            ((m) this.f76397i).b_(exc);
        }
    }
}
