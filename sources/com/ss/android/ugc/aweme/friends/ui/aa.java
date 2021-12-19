package com.ss.android.ugc.aweme.friends.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.ss.android.ugc.aweme.activity.processor.x;
import h.f.a.b;

final /* synthetic */ class aa implements b {

    /* renamed from: a  reason: collision with root package name */
    private final x f97140a;

    static {
        Covode.recordClassIndex(61720);
    }

    aa(x xVar) {
        this.f97140a = xVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        BaseViewModel baseViewModel = (BaseViewModel) obj;
        baseViewModel.config(new ae(this.f97140a));
        baseViewModel.config(af.f97148a);
        return null;
    }
}
