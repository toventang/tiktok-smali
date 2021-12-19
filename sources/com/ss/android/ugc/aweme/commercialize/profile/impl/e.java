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

public final class e extends a {
    static {
        Covode.recordClassIndex(46400);
    }

    @Override // com.ss.android.ugc.aweme.commercialize_ad_api.service.b, com.ss.android.ugc.aweme.commercialize_ad_api.service.a
    public final com.ss.android.ugc.aweme.commercialize_ad_api.b.a c(Context context, c cVar) {
        ViewStub viewStub;
        MethodCollector.i(1757);
        l.d(cVar, "");
        if (!(cVar instanceof com.ss.android.ugc.aweme.commercialize.profile.api.e) || (viewStub = ((com.ss.android.ugc.aweme.commercialize.profile.api.e) cVar).f75144e) == null) {
            com.ss.android.ugc.aweme.commercialize_ad_api.b.a c2 = super.c(context, cVar);
            MethodCollector.o(1757);
            return c2;
        }
        viewStub.setLayoutResource(R.layout.an9);
        View inflate = viewStub.inflate();
        if (inflate != null) {
            f fVar = new f((LinearLayout) inflate);
            MethodCollector.o(1757);
            return fVar;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        MethodCollector.o(1757);
        throw nullPointerException;
    }
}
