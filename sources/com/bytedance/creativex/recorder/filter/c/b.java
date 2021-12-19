package com.bytedance.creativex.recorder.filter.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.a.e;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.a.c;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import h.p;

public final class b {
    static {
        Covode.recordClassIndex(16574);
    }

    public static final String a(p<? extends FilterBean, e> pVar) {
        EffectCategoryResponse b2;
        if (pVar == null || (b2 = c.b(pVar.getSecond().f28227b.f(), (FilterBean) pVar.getFirst())) == null) {
            return null;
        }
        return b2.getName();
    }
}
