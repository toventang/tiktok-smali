package com.ss.android.ugc.aweme.ad.comment;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize_ad_api.a.c;
import com.ss.android.ugc.aweme.commercialize_ad_api.b.b;
import h.f.b.l;

public final class a extends com.ss.android.ugc.aweme.commercialize_ad_api.service.a {
    static {
        Covode.recordClassIndex(40378);
    }

    @Override // com.ss.android.ugc.aweme.commercialize_ad_api.service.b, com.ss.android.ugc.aweme.commercialize_ad_api.service.a
    public final b<?> a(Context context, c cVar) {
        l.d(context, "");
        l.d(cVar, "");
        if (!(cVar instanceof d)) {
            return super.a(context, cVar);
        }
        d dVar = (d) cVar;
        com.ss.android.ugc.aweme.ad.comment.c.a aVar = new com.ss.android.ugc.aweme.ad.comment.c.a(new com.ss.android.ugc.aweme.ad.comment.d.b(context), dVar.f65628i);
        aVar.f65617a.setEventType(dVar.f65626g);
        return aVar;
    }
}
