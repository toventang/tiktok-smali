package com.ss.android.ugc.aweme.livewallpaper.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.ss.android.ugc.aweme.activity.processor.x;
import h.f.a.b;

final /* synthetic */ class h implements b {

    /* renamed from: a  reason: collision with root package name */
    private final x f108978a;

    static {
        Covode.recordClassIndex(69773);
    }

    h(x xVar) {
        this.f108978a = xVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        BaseViewModel baseViewModel = (BaseViewModel) obj;
        baseViewModel.config(new m(this.f108978a));
        baseViewModel.config(n.f108984a);
        return null;
    }
}
