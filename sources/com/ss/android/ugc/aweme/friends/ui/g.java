package com.ss.android.ugc.aweme.friends.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.ss.android.ugc.aweme.activity.processor.x;
import h.f.a.b;

final /* synthetic */ class g implements b {

    /* renamed from: a  reason: collision with root package name */
    private final x f97255a;

    static {
        Covode.recordClassIndex(61783);
    }

    g(x xVar) {
        this.f97255a = xVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        BaseViewModel baseViewModel = (BaseViewModel) obj;
        baseViewModel.config(new r(this.f97255a));
        baseViewModel.config(i.f97257a);
        baseViewModel.config(j.f97258a);
        return null;
    }
}
