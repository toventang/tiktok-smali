package com.ss.android.ugc.aweme.compliance.protection.timelock.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.ss.android.ugc.aweme.activity.processor.x;

final /* synthetic */ class b implements h.f.a.b {

    /* renamed from: a  reason: collision with root package name */
    private final x f78086a;

    static {
        Covode.recordClassIndex(48411);
    }

    b(x xVar) {
        this.f78086a = xVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        BaseViewModel baseViewModel = (BaseViewModel) obj;
        baseViewModel.config(new c(this.f78086a));
        baseViewModel.config(d.f78088a);
        return null;
    }
}
