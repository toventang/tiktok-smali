package com.ss.android.ugc.aweme.favorites.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.ss.android.ugc.aweme.activity.processor.x;
import h.f.a.b;

final /* synthetic */ class s implements b {

    /* renamed from: a  reason: collision with root package name */
    private final x f90938a;

    static {
        Covode.recordClassIndex(57159);
    }

    s(x xVar) {
        this.f90938a = xVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        BaseViewModel baseViewModel = (BaseViewModel) obj;
        baseViewModel.config(new t(this.f90938a));
        baseViewModel.config(u.f90940a);
        baseViewModel.config(v.f90941a);
        return null;
    }
}
