package com.ss.android.ugc.aweme.music.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.ss.android.ugc.aweme.activity.processor.x;
import h.f.a.b;

final /* synthetic */ class r implements b {

    /* renamed from: a  reason: collision with root package name */
    private final x f112034a;

    static {
        Covode.recordClassIndex(71996);
    }

    r(x xVar) {
        this.f112034a = xVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        BaseViewModel baseViewModel = (BaseViewModel) obj;
        baseViewModel.config(new s(this.f112034a));
        baseViewModel.config(t.f112036a);
        return null;
    }
}
