package com.ss.android.ugc.aweme.friends.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.ss.android.ugc.aweme.activity.processor.x;
import h.f.a.b;

final /* synthetic */ class ag implements b {

    /* renamed from: a  reason: collision with root package name */
    private final x f97149a;

    static {
        Covode.recordClassIndex(61726);
    }

    ag(x xVar) {
        this.f97149a = xVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        BaseViewModel baseViewModel = (BaseViewModel) obj;
        baseViewModel.config(new ar(this.f97149a));
        baseViewModel.config(ai.f97151a);
        baseViewModel.config(aj.f97152a);
        return null;
    }
}
