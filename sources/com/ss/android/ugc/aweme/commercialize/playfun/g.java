package com.ss.android.ugc.aweme.commercialize.playfun;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.commercialize_ad_api.a.c;
import com.ss.android.ugc.aweme.commercialize_ad_api.service.a;
import h.f.b.l;

public final class g extends a {
    static {
        Covode.recordClassIndex(46237);
    }

    @Override // com.ss.android.ugc.aweme.commercialize_ad_api.service.b, com.ss.android.ugc.aweme.commercialize_ad_api.service.a
    public final Widget b(Context context, c cVar) {
        l.d(cVar, "");
        if (cVar instanceof h) {
            return new AdPlayFunWidget();
        }
        return super.b(context, cVar);
    }
}
