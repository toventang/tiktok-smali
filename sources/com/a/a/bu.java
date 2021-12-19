package com.a.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer;
import com.zhiliaoapp.musically.R;

public final class bu implements e {
    static {
        Covode.recordClassIndex(1984);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(4133);
        context.getResources();
        AdHalfWebPageMaskLayer adHalfWebPageMaskLayer = new AdHalfWebPageMaskLayer(context);
        adHalfWebPageMaskLayer.setId(R.id.gu);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -1);
        a.a(adHalfWebPageMaskLayer);
        adHalfWebPageMaskLayer.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(adHalfWebPageMaskLayer);
        }
        MethodCollector.o(4133);
        return adHalfWebPageMaskLayer;
    }
}
