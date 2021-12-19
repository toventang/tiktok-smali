package com.ss.android.ugc.aweme.qrcode.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.ss.android.ugc.aweme.activity.processor.x;
import h.f.a.b;

final /* synthetic */ class e implements b {

    /* renamed from: a  reason: collision with root package name */
    private final x f119862a;

    static {
        Covode.recordClassIndex(77873);
    }

    e(x xVar) {
        this.f119862a = xVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        BaseViewModel baseViewModel = (BaseViewModel) obj;
        baseViewModel.config(new m(this.f119862a));
        baseViewModel.config(n.f119874a);
        baseViewModel.config(g.f119865a);
        return null;
    }
}
