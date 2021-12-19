package com.ss.android.ugc.aweme.filter.view.a;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import f.a.t;

public interface i extends h {
    static {
        Covode.recordClassIndex(60684);
    }

    void a(View view, Object obj);

    void a(EffectCategoryResponse effectCategoryResponse, boolean z);

    void a(boolean z);

    void c(FilterBean filterBean);

    ViewGroup e();

    t<EffectCategoryResponse> f();

    t<Object> g();
}
