package com.ss.android.ugc.aweme.commercialize.live.business.links.d;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.live.business.links.g.a;
import h.f.b.l;

public final class c extends a {
    static {
        Covode.recordClassIndex(46007);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.business.links.d.a
    public final void b(Context context) {
        l.d(context, "");
        if (context instanceof e) {
            a.C1694a.a(((e) context).getSupportFragmentManager());
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.business.links.d.a
    public final void a(Context context) {
        l.d(context, "");
        if (context instanceof e) {
            String a2 = com.ss.android.ugc.aweme.commercialize.live.b.a.a().f74550b.a();
            Bundle bundle = this.f74619a;
            if (bundle != null) {
                a2 = com.ss.android.ugc.aweme.commercialize.live.c.a.a(a2, bundle);
            }
            a.C1694a.a(((e) context).getSupportFragmentManager(), a2);
        }
    }
}
