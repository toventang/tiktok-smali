package com.ss.android.ugc.aweme.commercialize.live.business.links.d;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bullet.b;
import com.ss.android.ugc.aweme.commercialize.live.b.a;
import h.f.b.l;

public final class e extends a {
    static {
        Covode.recordClassIndex(46009);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.business.links.d.a
    public final void b(Context context) {
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.business.links.d.a
    public final void a(Context context) {
        l.d(context, "");
        String a2 = a.a().f74549a.a();
        Bundle bundle = this.f74619a;
        if (bundle != null) {
            a2 = com.ss.android.ugc.aweme.commercialize.live.c.a.a(a2, bundle);
        }
        b.a(context, a2, this.f74619a);
    }
}
