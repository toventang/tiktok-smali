package com.ss.android.ugc.aweme.ad.feed.e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize_ad_api.service.a;
import h.f.b.l;

public final class c extends a {
    static {
        Covode.recordClassIndex(40518);
    }

    @Override // com.ss.android.ugc.aweme.commercialize_ad_api.service.b, com.ss.android.ugc.aweme.commercialize_ad_api.service.a
    public final com.ss.android.ugc.aweme.commercialize_ad_api.b.a c(Context context, com.ss.android.ugc.aweme.commercialize_ad_api.a.c cVar) {
        l.d(cVar, "");
        if (cVar instanceof d) {
            return new com.ss.android.ugc.aweme.ad.feed.e.a.a((d) cVar);
        }
        return super.c(context, cVar);
    }
}
