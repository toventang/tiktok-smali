package com.ss.android.ugc.aweme.feed.u;

import androidx.core.g.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.c.a;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;

public final class ac extends a<aa, w> {
    static {
        Covode.recordClassIndex(59767);
    }

    public final int d() {
        if (this.f76396h == null) {
            return 0;
        }
        return ((aa) this.f76396h).f93968a;
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o, com.ss.android.ugc.aweme.account.c.a
    public final void c() {
        T t;
        if (this.f76396h == null) {
            t = null;
        } else {
            t = this.f76396h.mData;
            if (t != null) {
                AwemeService.b().b((String) t.f2397a, t.f2398b.intValue());
            }
        }
        if (this.f76397i != null) {
            ((w) this.f76397i).a((e<String, Integer>) t);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        if (this.f76397i != null) {
            ((w) this.f76397i).a(exc);
        }
    }
}
