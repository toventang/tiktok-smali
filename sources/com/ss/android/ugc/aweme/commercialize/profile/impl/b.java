package com.ss.android.ugc.aweme.commercialize.profile.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.commercialize_ad_api.a.c;
import com.ss.android.ugc.aweme.commercialize_ad_api.service.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends a {
    static {
        Covode.recordClassIndex(46389);
    }

    @Override // com.ss.android.ugc.aweme.commercialize_ad_api.service.b, com.ss.android.ugc.aweme.commercialize_ad_api.service.a
    public final com.ss.android.ugc.aweme.commercialize_ad_api.b.a c(Context context, c cVar) {
        ViewStub viewStub;
        MethodCollector.i(1775);
        l.d(cVar, "");
        if (!(cVar instanceof com.ss.android.ugc.aweme.commercialize.profile.api.b) || (viewStub = ((com.ss.android.ugc.aweme.commercialize.profile.api.b) cVar).f75138a) == null) {
            com.ss.android.ugc.aweme.commercialize_ad_api.b.a c2 = super.c(context, cVar);
            MethodCollector.o(1775);
            return c2;
        }
        viewStub.setLayoutResource(R.layout.amb);
        View inflate = viewStub.inflate();
        if (inflate != null) {
            c cVar2 = new c((LinearLayout) inflate);
            MethodCollector.o(1775);
            return cVar2;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        MethodCollector.o(1775);
        throw nullPointerException;
    }
}
