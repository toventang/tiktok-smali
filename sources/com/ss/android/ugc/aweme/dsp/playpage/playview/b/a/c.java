package com.ss.android.ugc.aweme.dsp.playpage.playview.b.a;

import androidx.core.g.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.feed.u.aa;
import com.ss.android.ugc.aweme.feed.u.w;
import h.f.b.l;

public final class c extends com.ss.android.ugc.aweme.common.c<aa, w> {
    static {
        Covode.recordClassIndex(52269);
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        T t;
        b bVar = this.f76396h;
        if (bVar != null && (t = bVar.mData) != null) {
            IAwemeService b2 = AwemeService.b();
            F f2 = t.f2397a;
            S s = t.f2398b;
            if (s == null) {
                s = 0;
            }
            l.b(s, "");
            b2.b((String) f2, s.intValue());
            w wVar = (w) this.f76397i;
            if (wVar != null) {
                wVar.a((e<String, Integer>) t);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        w wVar = (w) this.f76397i;
        if (wVar != null) {
            wVar.a(exc);
        }
    }
}
