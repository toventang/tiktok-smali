package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.ss.android.ugc.aweme.activity.processor.x;
import h.f.a.b;

final /* synthetic */ class aa implements b {

    /* renamed from: a  reason: collision with root package name */
    private final x f122015a;

    static {
        Covode.recordClassIndex(79984);
    }

    aa(x xVar) {
        this.f122015a = xVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        BaseViewModel baseViewModel = (BaseViewModel) obj;
        baseViewModel.config(new at(this.f122015a));
        baseViewModel.config(au.f122080a);
        return null;
    }
}
