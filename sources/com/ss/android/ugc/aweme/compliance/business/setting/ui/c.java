package com.ss.android.ugc.aweme.compliance.business.setting.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.ss.android.ugc.aweme.activity.processor.x;
import h.f.a.b;

final /* synthetic */ class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final x f77198a;

    static {
        Covode.recordClassIndex(47729);
    }

    c(x xVar) {
        this.f77198a = xVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        BaseViewModel baseViewModel = (BaseViewModel) obj;
        baseViewModel.config(new m(this.f77198a));
        baseViewModel.config(e.f77200a);
        return null;
    }
}
