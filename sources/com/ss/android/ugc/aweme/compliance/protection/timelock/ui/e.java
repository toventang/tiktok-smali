package com.ss.android.ugc.aweme.compliance.protection.timelock.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.ss.android.ugc.aweme.activity.processor.x;
import h.f.a.b;

final /* synthetic */ class e implements b {

    /* renamed from: a  reason: collision with root package name */
    private final x f78089a;

    static {
        Covode.recordClassIndex(48414);
    }

    e(x xVar) {
        this.f78089a = xVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        BaseViewModel baseViewModel = (BaseViewModel) obj;
        baseViewModel.config(new f(this.f78089a));
        baseViewModel.config(g.f78091a);
        return null;
    }
}
