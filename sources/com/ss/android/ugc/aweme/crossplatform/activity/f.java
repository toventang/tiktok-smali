package com.ss.android.ugc.aweme.crossplatform.activity;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.ss.android.ugc.aweme.activity.processor.x;
import h.f.a.b;

final /* synthetic */ class f implements b {

    /* renamed from: a  reason: collision with root package name */
    private final x f78542a;

    static {
        Covode.recordClassIndex(48776);
    }

    f(x xVar) {
        this.f78542a = xVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        BaseViewModel baseViewModel = (BaseViewModel) obj;
        baseViewModel.config(new h(this.f78542a));
        baseViewModel.config(i.f78545a);
        return null;
    }
}
