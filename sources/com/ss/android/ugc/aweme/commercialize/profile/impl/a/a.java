package com.ss.android.ugc.aweme.commercialize.profile.impl.a;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.commercialize.profile.impl.d;
import com.ss.android.ugc.aweme.commercialize_ad_api.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends com.ss.android.ugc.aweme.commercialize_ad_api.service.a {
    static {
        Covode.recordClassIndex(46387);
    }

    @Override // com.ss.android.ugc.aweme.commercialize_ad_api.service.b, com.ss.android.ugc.aweme.commercialize_ad_api.service.a
    public final com.ss.android.ugc.aweme.commercialize_ad_api.b.a c(Context context, c cVar) {
        ViewStub viewStub;
        MethodCollector.i(1754);
        l.d(cVar, "");
        if (!(cVar instanceof com.ss.android.ugc.aweme.commercialize.profile.api.c) || (viewStub = ((com.ss.android.ugc.aweme.commercialize.profile.api.c) cVar).f75139a) == null) {
            com.ss.android.ugc.aweme.commercialize_ad_api.b.a c2 = super.c(context, cVar);
            MethodCollector.o(1754);
            return c2;
        }
        viewStub.setLayoutResource(R.layout.amx);
        View inflate = viewStub.inflate();
        if (inflate != null) {
            d dVar = new d((LinearLayout) inflate);
            MethodCollector.o(1754);
            return dVar;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        MethodCollector.o(1754);
        throw nullPointerException;
    }
}
