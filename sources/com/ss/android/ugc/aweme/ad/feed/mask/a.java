package com.ss.android.ugc.aweme.ad.feed.mask;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.commercialize_ad_api.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends com.ss.android.ugc.aweme.commercialize_ad_api.service.a {
    static {
        Covode.recordClassIndex(40571);
    }

    @Override // com.ss.android.ugc.aweme.commercialize_ad_api.service.b, com.ss.android.ugc.aweme.commercialize_ad_api.service.a
    public final com.ss.android.ugc.aweme.commercialize_ad_api.b.a c(Context context, c cVar) {
        ViewStub viewStub;
        MethodCollector.i(2622);
        l.d(cVar, "");
        if (!(cVar instanceof c) || (viewStub = ((c) cVar).f65975f) == null) {
            com.ss.android.ugc.aweme.commercialize_ad_api.b.a c2 = super.c(context, cVar);
            MethodCollector.o(2622);
            return c2;
        }
        viewStub.setLayoutResource(R.layout.a_f);
        View inflate = viewStub.inflate();
        if (inflate != null) {
            b bVar = new b((LinearLayout) inflate);
            MethodCollector.o(2622);
            return bVar;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        MethodCollector.o(2622);
        throw nullPointerException;
    }
}
