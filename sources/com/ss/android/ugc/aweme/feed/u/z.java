package com.ss.android.ugc.aweme.feed.u;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.framework.a.a;

public final class z extends c<y, v> {
    static {
        Covode.recordClassIndex(59803);
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        if (this.f76397i != null && this.f76396h != null) {
            a.b(6, "DeleteAweme", "onItemDelete " + ((String) this.f76396h.mData));
            ((v) this.f76397i).h(this.f76396h.mData);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        if (this.f76397i != null) {
            ((v) this.f76397i).d(exc);
        }
    }
}
