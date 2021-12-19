package com.ss.android.ugc.aweme.ad.feed.interactive;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.commercialize_ad_api.a.c;
import h.f.b.l;

public final class a extends com.ss.android.ugc.aweme.commercialize_ad_api.service.a {
    static {
        Covode.recordClassIndex(40559);
    }

    @Override // com.ss.android.ugc.aweme.commercialize_ad_api.service.b, com.ss.android.ugc.aweme.commercialize_ad_api.service.a
    public final Widget b(Context context, c cVar) {
        l.d(cVar, "");
        if (cVar instanceof b) {
            return new AdInteractiveWidget();
        }
        return null;
    }
}
