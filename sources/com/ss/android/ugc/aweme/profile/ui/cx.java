package com.ss.android.ugc.aweme.profile.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.ss.android.ugc.aweme.activity.processor.x;
import h.f.a.b;

final /* synthetic */ class cx implements b {

    /* renamed from: a  reason: collision with root package name */
    private final x f117115a;

    static {
        Covode.recordClassIndex(75628);
    }

    cx(x xVar) {
        this.f117115a = xVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        BaseViewModel baseViewModel = (BaseViewModel) obj;
        baseViewModel.config(new da(this.f117115a));
        baseViewModel.config(db.f117122a);
        baseViewModel.config(dc.f117123a);
        return null;
    }
}
