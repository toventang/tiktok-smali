package com.ss.android.ugc.aweme.ad.feed.button;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.commercialize_ad_api.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends com.ss.android.ugc.aweme.commercialize_ad_api.service.a {
    static {
        Covode.recordClassIndex(40461);
    }

    @Override // com.ss.android.ugc.aweme.commercialize_ad_api.service.b, com.ss.android.ugc.aweme.commercialize_ad_api.service.a
    public final com.ss.android.ugc.aweme.commercialize_ad_api.b.a c(Context context, c cVar) {
        ViewStub viewStub;
        MethodCollector.i(531);
        l.d(cVar, "");
        if (!(cVar instanceof b) || (viewStub = ((b) cVar).f65755a) == null) {
            com.ss.android.ugc.aweme.commercialize_ad_api.b.a c2 = super.c(context, cVar);
            MethodCollector.o(531);
            return c2;
        }
        viewStub.setLayoutResource(R.layout.af9);
        View findViewById = viewStub.inflate().findViewById(R.id.b0o);
        if (findViewById != null) {
            com.ss.android.ugc.aweme.commercialize_ad_api.b.a aVar = (com.ss.android.ugc.aweme.commercialize_ad_api.b.a) findViewById;
            MethodCollector.o(531);
            return aVar;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize_ad_api.view.IAdView");
        MethodCollector.o(531);
        throw nullPointerException;
    }
}
